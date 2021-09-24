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
 * Servlet implementation class getNameScoreServlet
 */
@WebServlet("/getNameScoreServlet")
public class getNameScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getNameScoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		
		NameConverter scoredName = new NameConverter(userName);
				
		request.setAttribute("userScoredName", scoredName);
		getServletContext().getRequestDispatcher("/scoredresult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(scoredName);
		writer.close();
	}

}
