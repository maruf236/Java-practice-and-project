import java.util.Scanner;

public class heybro2 {
public static void main(String [] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter your name: ");
	String name =sc.nextLine();//Get input String with spaces .
	//String nam =sc.next(); // Get input String without Spaces.
	
	System.out.print("Enter your age: ");
	int age =sc.nextInt();//user input for integer .
	
	System.out.print("Enter your GPA: ");
	double gpa=sc.nextDouble();//user input for double
	
	System.out.print("Are you a student ? (true/false): ");
	boolean isStudent=sc.nextBoolean();//user input for boolean
	

	
	System.out.println("Hello "+name);
	System.out.println("You are "+age+" Years old.");
	System.out.println("Your gpa is: "+gpa);
	
	if(isStudent)
	{
		System.out.println("You are enrolled as a student.");
	}
	else
	{
		System.out.println("You are NOT enrolled as a student.");
	}

	//Common Issue
	System.out.println("Enter your age:");
	int age2 =sc.nextInt();
	//after every input when we press "Enter"
//	button the system automatically get \n as a input in the 
//	next input method . if there is string then will fill up with \n. to avoid this 
// we should use this line 
	sc.nextLine();


	
	System.out.println("Enter your favorite color");
	String color=sc.nextLine();
	
	System.out.println("You are "+age2+" years old");
	System.out.println("You like the color "+color);

	double width=0;
	double hight=0;
	double area=0;
	
	System.out.print("Enter width: ");
	width=sc.nextDouble();
	System.out.print("Enter hight: ");
	hight =sc.nextDouble();
	
	area=width*hight;
	System.out.println("The area of Ractabgle is "+area+" cm^2");


	
	


	

	sc.close();
}
}
