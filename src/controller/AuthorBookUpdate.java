package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AuthorBookDao;
import model.AuthorBook;

/**
 * Servlet implementation class AuthorBookUpdate
 */
@WebServlet(urlPatterns= {"/AuthorBookUpdate"})
public class AuthorBookUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorBookUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int bookid = Integer.parseInt(request.getParameter("id"));
		System.out.println(bookid);
		String bookname = request.getParameter("bookname");
		String bookprice = request.getParameter("bookprice");
		int publishedyear = Integer.parseInt(request.getParameter("publishedyear"));
		System.out.println(bookname);
		AuthorBook authorbook = new AuthorBook();
		authorbook.setId(bookid);
		authorbook.setBookname(bookname);
		authorbook.setPrice(bookprice);
		authorbook.setPublishedyear(publishedyear);
		
		AuthorBookDao authorbookdao = new AuthorBookDao();
		try {
			authorbookdao.updateBook(authorbook);
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		response.sendRedirect("authorhome");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
