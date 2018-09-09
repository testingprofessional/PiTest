package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String  gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextLine();
		System.out.println(firstName + " " + lastName + " " + gradeYear);
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
	}
	
	// Generate an ID (grade level + ID)
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				System.out.println("BREAK!!!");
				break;
			}
		} while (1 != 0);
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance: $" + tuitionBalance);
	}
	
	// Pay Tuition
	public void payTuition(int payment) {
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Show status

}
