package ersservice;

import java.util.List;
import java.util.logging.Logger;

import Entity.EmployeeEntity;
import Entity.ReimEntity;
import ersdao.ReimbursmentDaoImpl;
import ersmodel.com.EmployeeModel;
import ersmodel.com.ReimModel;

public class ReimbursementServiceImpl {
	static Logger logger=Logger.getLogger("ReimbursementServiceImpl.class");
	ReimbursmentDaoImpl reimdao = new ReimbursmentDaoImpl();
	public void addReimbursment(ReimModel r) {
		logger.info("Rembursement added successfully.....");
		reimdao.addReimbursment(r);
	}
	
	public List<EmployeeEntity> displayparticularemp(String empid){
		logger.info("Displayed Particular Reimbursement ");
		return reimdao.displayparticularemp(empid);
	}
	
	public List<ReimEntity> reimforpartemployee(String empid){
		logger.info("Particular Reimbursement ....");
		return reimdao.reimforpartemployee(empid);
	}
	
	public List<ReimEntity> displayalreimbursement(){
		logger.info("Display all Reimbursement ");
		return reimdao.displayalreimbursement();
	}
	
	public List<ReimEntity> allrejectedreim(){
		logger.info("Updation Success! And details are rejected");
		return reimdao.allrejectedreim();
	}
	
	public List<ReimEntity> allacceptedreim(){
		logger.info("Updation Success! And details are accepted");
		return reimdao.allacceptedreim();
	}
	
	public List<ReimEntity> allpendingreim(){
		logger.info("All Pendding requestss.....");
		return reimdao.allpendingreim();
	}
	
	public void updatereim2(Integer ID,String type){
		logger.info("updating reimbursemet");
		 reimdao.updatereim2(ID,type);
	}
	
	public void updateemp(EmployeeModel e){
		reimdao.updateemp(e);
	}
			
}
