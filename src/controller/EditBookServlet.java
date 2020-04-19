package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AuthorBookDao;
import model.AuthorBook;

/**
 * Servlet implementation class EditBookServlet
 */
@WebServlet(urlPatterns= {"/editbook"})
public class EditBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			showEditForm(request,response);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	} 
	// 5min ok sir

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)throws SQLException,ServletException,IOException{
		AuthorBookDao authorbookdao = new AuthorBookDao();
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);  //It is going here sir
		AuthorBook existingbook=  authorbookdao.selectbook(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/authoraddbook.jsp"); //It is having problem here sir
		// yes i will check now ok sir
		request.setAttribute("bookslist", existingbook);
		dispatcher.forward(request, response);
	}

}
