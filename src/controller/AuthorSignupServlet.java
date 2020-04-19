package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AuthorDao;
import model.Author;

/**
 * Servlet implementation class AuthorSignupServlet
 */
@WebServlet(urlPatterns= {"/authorsignup"})
public class AuthorSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorSignupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/authorsignup.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		LocalDate date = LocalDate.now();
		
		Author author = new Author();
		author.setEmail(email);
		author.setPassword(confirmPassword);
		AuthorDao authordao = new AuthorDao();
		
		int checkAuthor = authordao.signupAuthor(author);
		
		System.out.println("checkAuthor"+checkAuthor);
		
		if(checkAuthor!=0)
		{
			System.out.println(author.getEmail());
			System.out.println(author.getPassword());
			
			request.setAttribute("message", "Registration Succesful");
			request.setAttribute("message", "Please login to continue");
			
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/authorsignup.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message", "Please check your credentials & try again");
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/authorsignup.jsp");
			rd.forward(request, response);
		}
	}

}
