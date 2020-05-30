package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

@WebServlet("/controller.do")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doExecute(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		doExecute(request, response);
	}
    
	private void doExecute(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			String comando = request.getParameter("command");
			Command command = (Command) Class.forName("command." + comando).newInstance();
			command.execute(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
