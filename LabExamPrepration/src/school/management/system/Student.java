package school.management.system;

import java.util.*;

public class Student extends Person {
	String studentId;
	ArrayList<Double> grades;
	
	Student(String name,  int age, String studentId){
		super(name, age);
		this.studentId = studentId;
		this.grades = new ArrayList<>();
	}
	
	public void addGrade(double grade) {
		grades.add(grade);
	}
	
	public double calculateAverageGrade() {
		if(grades.isEmpty())
			return 0;
		
		double avgGrade = 0; 
		double totalGrade = 0;
		
		for(Double grade : grades) {
			totalGrade += grade;
		}
		
		return totalGrade / grades.size();
	}
		
	
	
	public void displayInfo() {
		System.out.println("Name: " + name + ", Grade: " + studentId);
	}
	
	
}
