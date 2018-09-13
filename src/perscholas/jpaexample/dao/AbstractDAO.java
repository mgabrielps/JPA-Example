package perscholas.jpaexample.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO {
	protected EntityManager manager;
	
	public void begin() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Example"); 
		manager = factory.createEntityManager();
		manager.getTransaction().begin();
	}
	
	public void close() {
		manager.getTransaction().commit();
		manager.close();
	}
}
