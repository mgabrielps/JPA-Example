package perscholas.jpaexample.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import perscholas.jpaexample.model.Credentials;
import perscholas.jpaexample.model.Student;

public class RunnerDay3 {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Example"); 
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
//		Subject s = new Subject();
//		s.setSub_id(1);
//		s.setSub_name("Math");
//		
//		manager.persist(s);
//		
//		Course c1 = new Course();
//		c1.setC_id(1);
//		c1.setC_name("MTH101");
//		c1.setSubject(s);
//		
//		Course c2 = new Course();
//		c2.setC_id(2);
//		c2.setC_name("MTH200");
//		c2.setSubject(s);
//		
//		manager.persist(c1);
//		manager.persist(c2);
		
//		Subject s = manager.find(Subject.class, 1);
//		List<Course> courses = s.getCourses();
//		for(Course c : courses) {
//			System.out.println(c.getSubject());
//		}
		
//		Student s1 = new Student();
//		s1.setStudent_id(1);
//		s1.setStudent_name("Mike");
//		
//		manager.persist(s1);
//		
//		Student s2 = new Student();
//		s2.setStudent_id(2);
//		s2.setStudent_name("Marcial");
//		
//		manager.persist(s2);
//		
//		List<Student> studentsInMath101 = new ArrayList<Student>();
//		studentsInMath101.add(s1);
//		studentsInMath101.add(s2);
//		
//		Course math101 = manager.find(Course.class, 1);
//		math101.setStudents(studentsInMath101);
		
//		Course math101 = manager.find(Course.class, 1);
//		for(Student s : math101.getStudents()) {
//			System.out.println(s);
//		}
		
		Student s = manager.find(Student.class, 1);
//		Credentials c = new Credentials();
//		c.setStudent(s);
//		c.setUsername("mike");
//		c.setPassword("mike");
//		
//		manager.persist(c);
		s.getCredentials().setUsername("mike");
		
		manager.getTransaction().commit();
	}
}
