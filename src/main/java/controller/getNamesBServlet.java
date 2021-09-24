package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NameConverter;

/**
 * Servlet implementation class getNamesBServlet
 */
@WebServlet("/getNamesBServlet")
public class getNamesBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNamesBServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
				
		NameConverter reversedName = new NameConverter(userName);	
				
		request.setAttribute("userReversedName", reversedName);
		getServletContext().getRequestDispatcher("/reversedresult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(reversedName.toString());
		writer.close();
	}

}
