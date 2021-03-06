package erscontroller.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.EmployeeEntity;
import Entity.ReimEntity;
import ersmodel.com.ReimModel;
import ersservice.ReimbursementServiceImpl;

public class Reimforpartemployee extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid=String.valueOf(request.getSession().getAttribute("empid"));
		
		ReimModel reimmod = new ReimModel();
		reimmod.setEmpid(empid);
		
		ReimbursementServiceImpl reimservice = new ReimbursementServiceImpl();
		List<ReimEntity> elist= reimservice.reimforpartemployee(empid);
		
		PrintWriter out = response.getWriter();
		out.println("<table width=200 height=200 border=1>");           
		out.println("<caption>Your Reimbursement Details is Here </caption>");
		out.println("<tr><th>Reimbursementy ID</th><th>Employee ID</th><th>Reimbursement ammount</th><th>Reimbursement DateOfRequest</th><th>Reimbursement Description</th><th>Reimbursement Status</th><th>Reimbursement Type</th></tr>");
		for(ReimEntity r:elist) {
			out.println("<tr><td>"+r.getReim_id()+"</td><td>"+r.getEmpid()+"</td><td>"+r.getReim_ammount()+"</td><td>"+r.getReim_dateofrequest()+"</td><td>"+r.getReim_descripton()+"</td><td>"+r.getReim_status()+"</td><td>"+r.getReim_type()+"<td></tr>");
		}
	}
}