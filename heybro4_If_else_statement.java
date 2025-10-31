import java.util.Scanner;

public class heybro4_If_else_statement {
	public static void main(String [] args)
	{
		/*If-else statement= Performs a block
		 *  of code if its condition is true
		 */
		Scanner sc= new Scanner(System.in);
		int age;

		String name;
		System.out.print("Enter your name: ");
		name=sc.nextLine();
		
 
		System.out.print("Enter your age: ");
		age=sc.nextInt();
        sc.nextLine();
        
        boolean isStudent;
        System.out.print("Are you Student? (true/false): ");
        isStudent=sc.nextBoolean();

           //Group 01
		while(name.isEmpty()) {
		if(name.isEmpty())
		{
			System.out.println("\nYou didnot enter your name. ");
			System.out.println("Please , enter your name : ");
			name=sc.nextLine();
		}
		
		}
		System.out.println("\nHello, "+name+"!");

                //Group 02
		if(age>=18 && age<65)
		{
			System.out.println("You are an adult! 🚶‍♀️‍➡️");
		}
		else if(age<0)
		{
			System.out.println("You haven't been born yet!");
		}
		else if(age==0)
		{
			System.out.println("You are a baby.");
		}
		else if(age>=65)
		{
			System.out.println("You are a senior."); 
		}
		else
		{
			System.out.println("You are a Child! 🧘‍♀️");
		}
		
		       //Group 03
		if(isStudent)
		{
			System.out.println(name+" is a student. 😒");
		}
		else
		{
			System.out.println(name+" is not a student.");
		}
		
		
		sc.close();
		}

}
