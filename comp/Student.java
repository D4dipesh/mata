package comp;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable,Comparable<Student>{
	int rollno;
	String name;
	String course;
	public Student(int rollno, String name, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + "]";
	}
	public void accept() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter rollno ");
		this.rollno=sc.nextInt();
		System.out.println("Enter name ");
		this.name=sc.next();
		System.out.println("Enter course ");
		this.course=sc.next();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if ((this.course.compareTo(o.course))>1) {
			return 1;
		}
		if ((this.course.compareTo(o.course))<1) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
}
