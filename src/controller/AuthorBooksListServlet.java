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
 * Servlet implementation class AuthorBooksListServlet
 */
@WebServlet(urlPatterns= {"/authorbooks"})
public class AuthorBooksListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorBooksListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AuthorBookDao authorbookdao= new AuthorBookDao();
		java.util.List<AuthorBook> listbooks = authorbookdao.selectAllBooks();
		request.setAttribute("listbooks", listbooks);

		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/authorbookslist.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
