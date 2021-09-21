package ersdao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import DbUtil.EmployeeMapper;
import DbUtil.HibernateUtil;
import Entity.EmployeeEntity;
import ersmodel.com.EmployeeModel;

public class EmployeeRegDetailsImpl {
	
public List<EmployeeEntity> displayAllEmployees(){
	List<EmployeeEntity> elist = new ArrayList<EmployeeEntity>();
	
	try {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Query query = session.createQuery("from EmployeeEntity e");
		elist = query.list();		
		
	} catch (Exception e1) {
		
		e1.printStackTrace();
	}
	 return elist;
 }

	
public void addEmployee(EmployeeModel e) {
		
		try {
			
			Session session=HibernateUtil.getSessionFactory().openSession();
			
			session.beginTransaction();  //insert,update,delete
			session.save(EmployeeMapper.mapEmployee(e));
			System.out.println("employee inserted...");
			session.getTransaction().commit();
			
			
		} catch (Exception e1) {
			
			e1.printStackTrace();
		}
		 
	 }




}
