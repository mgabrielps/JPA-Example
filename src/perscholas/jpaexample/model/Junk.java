package perscholas.jpaexample.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="jpa_junk")
@NamedQuery(query="SELECT j FROM Junk j WHERE j.name = :name", 
			name="getJunkByName")
public class Junk {
	@Id
	@Column
	private int id;
	@Basic
	@Column
	private String name;
	@Basic
	@Column
	private double price;
	@Basic
	@Column
	private int quantity;
	
	public Junk(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Junk() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
