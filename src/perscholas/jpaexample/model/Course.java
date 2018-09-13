package perscholas.jpaexample.model;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLASS")
public class Course {
	@Id
	@Column(name="c_id")
	private int c_id;
	
	@Basic
	@Column(name="c_name")
	private String c_name;
	
	@ManyToOne
	@JoinColumn(name="sub_id", referencedColumnName="sub_id")
	private Subject subject;
	
	@ManyToMany
	@JoinTable(name="STUDENT_CLASS",
	joinColumns=@JoinColumn(name="c_id"),
	inverseJoinColumns=@JoinColumn(name="student_id"))
	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	
}
