package perscholas.jpaexample.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import perscholas.jpaexample.model.AdminUsers;
import perscholas.jpaexample.model.CustomerUsers;

public class RunnerDay2 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Example"); 
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		AdminUsers admin = new AdminUsers();
		admin.setId(1);
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setOrderRights(7);
		admin.setPageRights(7);
		admin.setUserRights(7);
		
		CustomerUsers cust = new CustomerUsers();
		cust.setId(2);
		cust.setUsername("cust");
		cust.setPassword("cust");
		cust.setAddress("45 Some Place, New York, NY 10001");
		cust.setPhone(1234567890);
		
		manager.persist(admin);
		manager.persist(cust);
		
		manager.getTransaction().commit();
	}
}
