package erscontroller.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.ReimEntity;
import ersservice.ReimbursementServiceImpl;


public class UpdateReim2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String rid=request.getParameter("R_ID");
		String type=request.getParameter("type");
		Integer ID = Integer.parseInt(rid);
		
		ReimbursementServiceImpl reimservice = new ReimbursementServiceImpl();
		reimservice.updatereim2(ID,type);
		
		out.println("<h1> Bravo! Updation is successfull!! </h1>");
	}

}
