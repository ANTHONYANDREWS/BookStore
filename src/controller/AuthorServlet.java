package controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AuthorDao;
import model.Author;

/**
 * Servlet implementation class AuthorServlet
 */
@WebServlet(urlPatterns= {"/author"})
public class AuthorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/author.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password = request.getParameter("password");
		
		Author author = new Author();
		author.setEmail(email);
		author.setPassword(password);
		
		AuthorDao authordao = new AuthorDao();
		boolean validateAuthor= authordao.loginAuthor(author);
		System.out.println(validateAuthor);
		if(validateAuthor)
		{
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/authorwelcome.jsp");
			rd.forward(request, response);		
		}
		else
		{
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/author.jsp");
			rd.forward(request, response);
			request.setAttribute("message", "Invalid Username/Password");
		}
	}

}
