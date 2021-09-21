package erscontroller.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.EmployeeEntity;
import ersmodel.com.EmployeeModel;
import ersservice.EmployeeRegistrationServiceImpl;


public class DisplayEmployees extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		PrintWriter out = response.getWriter();
		List<EmployeeEntity> elist = employeeService.displayAllEmployees();
		out.println("<table width=200 height=200 border=1>");
		out.println("<caption> Employee Details </caption>");
		for(EmployeeEntity e:elist) {
			out.println("<tr><td>"+"Employee Address: "+e.getEmpaddress()+"</td><td>"+"EmployeeDepartment: "+e.getEmpldept()+"</td><td>"+"Employee Designation "+e.getEmpdesignation()+"</td><td>"+" Employee DateofBirth: "+e.getEmpdob()+"</td><td>"+" EmployeeEmail: "+e.getEmpemail()+"</td><td>"+" Employee Gender: "+e.getEmpgender()+"</td><td>"+" Employee ID: "+e.getEmpid()+"</td><td>"+" Employee Name: "+e.getEmpname()+"</td><td>"+" Employee Password: "+e.getEmppassword()+"</td><td>"+" Employee PhoneNumber: "+e.getEmpphoneno()+"</td><td>"+" Employee Type: "+e.getEmptype()+"<td></tr>");
		}
		out.println("</table>");
		
		out.println("<form action='index.jsp'> <input type='submit' value='back to Home'></form> ");
	}

}
