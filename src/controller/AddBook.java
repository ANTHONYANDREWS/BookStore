package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AuthorBookDao;
import model.AuthorBook;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/addbook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/authoraddbook.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering post method");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String bookname = request.getParameter("bookname");
		String price = request.getParameter("bookprice");
		int publishedyear = Integer.parseInt(request.getParameter("publishedyear"));
		
		System.out.println(id);
		System.out.println(bookname);
		System.out.println(price);
		System.out.println(publishedyear);
		
		AuthorBook authorbook= new AuthorBook();
		authorbook.setId(id);
		authorbook.setBookname(bookname);
		authorbook.setPrice(price);
		authorbook.setPublishedyear(publishedyear);
		
		AuthorBookDao authorbookdao = new AuthorBookDao();
		try {
			authorbookdao.addbook(authorbook);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
		response.sendRedirect("authorhome");

	}

}
