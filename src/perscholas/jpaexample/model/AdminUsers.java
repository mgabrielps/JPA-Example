package perscholas.jpaexample.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id")
public class AdminUsers extends Users {
	
	/*
	 * 1 = Delete
	 * 2 = Write
	 * 4 = Read
	 * Add together for full rights
	 */
	private int pageRights;
	private int userRights;
	private int orderRights;
	
	public int getPageRights() {
		return pageRights;
	}
	public void setPageRights(int pageRights) {
		this.pageRights = pageRights;
	}
	public int getUserRights() {
		return userRights;
	}
	public void setUserRights(int userRights) {
		this.userRights = userRights;
	}
	public int getOrderRights() {
		return orderRights;
	}
	public void setOrderRights(int orderRights) {
		this.orderRights = orderRights;
	}
	
	
}
