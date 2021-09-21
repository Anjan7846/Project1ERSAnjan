package erscontroller.com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ersmodel.com.EmployeeModel;
import ersservice.EmployeeRegistrationServiceImpl;


public class EmployeeRegistrationController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid=request.getParameter("empid");
		String empname=request.getParameter("empname");
		String empdesignation=request.getParameter("empdesignation");
		String empldept=request.getParameter("empldept");
		String empdob=request.getParameter("empdob");
		String empgender=request.getParameter("empgender");
		String empemail=request.getParameter("empemail");
		String emptype=request.getParameter("emptype");
		String emppassword=request.getParameter("emppassword");
		String empphoneno=request.getParameter("empphoneno");
		String empaddress=request.getParameter("empaddress");
		
		
		//Model is mapped
		EmployeeModel empmod = new EmployeeModel();
		empmod.setEmpaddress(empaddress);
		empmod.setEmpdept(empldept);
		empmod.setEmpdesignation(empdesignation);
		empmod.setEmpdob(empdob);
		empmod.setEmpemail(empemail);
		empmod.setEmpgender(empgender);
		empmod.setEmpid(empid);
		empmod.setEmpname(empname);
		empmod.setEmppassword(emppassword);
		empmod.setEmpphoneno(empphoneno);
		empmod.setGetEmptype(emptype);
		
		
		EmployeeRegistrationServiceImpl employeeService =new EmployeeRegistrationServiceImpl();
		
		employeeService.addEmployee(empmod);
		
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");		
		rd.forward(request, response);
	}

}
