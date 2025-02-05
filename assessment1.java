import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		println("Name: " + State.NAME);
		println("Section: " + State.SECTION);
		    
		State state = new State();
		Scanner scanner = new Scanner(System.in);
		    
		print("Enter student name: ");
		state.setStudentName(scanner.nextLine());
		    
		print("Enter course code 1: ");
		state.setCourseCode1(scanner.nextLine());
		    
		print("Enter course grade 1: ");
		state.setCourseGrade1(Double.parseDouble(scanner.nextLine()));
		    
		print("Enter course unit 1: ");
		state.setCourseUnit1(Integer.parseInt(scanner.nextLine()));
		    
		print("Enter course code 2: ");
		state.setCourseCode2(scanner.nextLine());
		    
		print("Enter course grade 2: ");
		state.setCourseGrade2(Double.parseDouble(scanner.nextLine()));
		    
		print("Enter course unit 2: ");
		state.setCourseUnit2(Integer.parseInt(scanner.nextLine()));
		    
		scanner.close();
		    
		println("Your General Weighted Average (GWA): " + Math.round(state.getGWA()));
	}
	
	private static void print(String msg)
	{
		System.out.print(msg);
	}
	
	private static void println(String msg)
	{
		System.out.println(msg);
	}
}

class State
{
	public static final String NAME = "Aaron Angelo M. Ragudos";
	public static final String SECTION = "CS12S2";
	    
	private String studentName,courseCode1,courseCode2;
	private int courseUnit1, courseUnit2, totalUnits;
	private double courseGrade1, courseGrade2;
    
    	public void setStudentName(String name)
	{
		studentName = name;
	}
    
	public void setCourseCode1(String cc1)
	{
	        courseCode1 = cc1;
	}
    
    	public void setCourseCode2(String cc2)
	{
	        courseCode2 = cc2;
	}
    
    	public void setCourseUnit1(int cu1) 
	{
	        courseUnit1 = cu1;
	        
	        calculateTotalUnits();
	}
    
    	public void setCourseUnit2(int cu2) 
	{
	        courseUnit2 = cu2;
	        
	        calculateTotalUnits();
	}
    
  	public void setCourseGrade1(double cg1)
	{
        	courseGrade1 = cg1;
	}
    
    	public void setCourseGrade2(double cg2)
	{
        	courseGrade2 = cg2;
	}
    
    	public double getGWA()
	{
      		return (courseGrade1 * courseUnit1 + courseGrade2 * courseUnit2) / totalUnits;
	}
    
    	private void calculateTotalUnits()
	{
       		totalUnits = courseUnit1 + courseUnit2;
	}
}
