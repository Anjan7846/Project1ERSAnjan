package ersdao;

import java.util.List;

import Entity.EmployeeEntity;
import ersmodel.com.EmployeeModel;

public interface EmployeeRegDetails {
	public void addEmployee(EmployeeModel e);
	public List<EmployeeEntity> displayAllEmployees();
}
