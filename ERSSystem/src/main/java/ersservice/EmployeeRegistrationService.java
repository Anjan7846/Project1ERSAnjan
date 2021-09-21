package ersservice;

import java.util.List;

import Entity.EmployeeEntity;
import ersmodel.com.EmployeeModel;

public interface EmployeeRegistrationService {
	public void addEmployee(EmployeeModel e);
	public List<EmployeeEntity> displayAllEmployees();
	}
