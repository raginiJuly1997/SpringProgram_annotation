package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Ragini chaudhary**")
	private String name;
	@Value("26")
	private int rollNo;
	@Value("ragini@gmail.com")
	private  String email;
	@Value("123.3f")
	private float marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void display()
	
	{
		System.out.println("name: "+name);
		System.out.println("rollNo: "+rollNo);
		System.out.println("email: "+email);
		System.out.println("marks: "+marks);
	}
	
}
