package perscholas.jpaexample.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT")
public class Subject {
	
	@Id
	@Column(name="sub_id")
	private int sub_id;
	
	@Basic
	@Column(name="sub_name")
	private String sub_name;
	
	@OneToMany
	@JoinColumn(name="sub_id", referencedColumnName="sub_id")
	private List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public int getSub_id() {
		return sub_id;
	}

	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}
	
	
}
