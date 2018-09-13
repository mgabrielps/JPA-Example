package perscholas.jpaexample.dao;

import java.util.List;

import javax.persistence.Query;

import perscholas.jpaexample.model.Junk;

public class JunkDAO extends AbstractDAO{
	public void createJunk(Junk junk) {
		begin();
		manager.persist(junk);
		close();	
	}
	
	public Junk findJunkById(int id) {
		begin();
		Junk found = manager.find(Junk.class, id);
		close();
		return found;
	}
	
	public void updateJunk(int id, Junk newJunk) {
		begin();
		Junk found = manager.find(Junk.class, id);
		found.setName(newJunk.getName());
		found.setPrice(newJunk.getPrice());
		found.setQuantity(newJunk.getQuantity());
		close();
	}
	
	public void removeJunk(int id) {
		begin();
		Junk found = manager.find(Junk.class, id);
		manager.remove(found);
		close();
	}
	
	public void getJunkByName(String name) {
		begin();
		Query query = manager.createQuery(Queries.getJunkByName);
		query.setParameter("name", name);
		List<Junk> junkList = query.getResultList();
		for(Junk j : junkList) {
			System.out.println(j.getId());
		}
		close();
	}
	
	
}
