package perscholas.jpaexample.runner;

import perscholas.jpaexample.dao.JunkDAO;
import perscholas.jpaexample.model.Junk;

public class Runner {
	public static void main(String[] args) {
		
		JunkDAO dao = new JunkDAO();
		dao.getJunkByName("Changed");
	}
}
