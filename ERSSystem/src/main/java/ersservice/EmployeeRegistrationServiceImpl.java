package ersservice;

import java.util.List;
import java.util.logging.Logger;

import Entity.EmployeeEntity;
import ersdao.EmployeeRegDetailsImpl;
import ersmodel.com.EmployeeModel;

public class EmployeeRegistrationServiceImpl {
	static Logger logger=Logger.getLogger("EmployeeRegistrationServiceImpl.class");
	
	EmployeeRegDetailsImpl empdao = new EmployeeRegDetailsImpl();
	public void addEmployee(EmployeeModel e) {
		logger.info("Details are added....");
		empdao.addEmployee(e);
	}
	public List<EmployeeEntity> displayAllEmployees(){
		logger.info("Details are displayed....");
		return empdao.displayAllEmployees();
	}
	
	
}
