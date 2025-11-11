import java.util.Scanner;

public class heybro06_math_class {
public static void main(String [ ]args)
{
	Scanner sc= new Scanner(System.in);

	System.out.println("Some Constent Value in Java: ");
	System.out.println(Math.PI);
	System.out.println(Math.E);//Eulars Number
	
	
	int a,b;
	System.out.println("Enter the base and the exponent or power: ");
	a=sc.nextInt();
	b=sc.nextInt();
	
	double result,absrslt;
	result =Math.pow(a, b);// 2 to the power 3
	System.out.println(result);
	System.out.println("Enter the to get the absolute value: ");
	
	int c;
	c=sc.nextInt();
	absrslt = Math.abs(c);
	System.out.println(absrslt);
	
	int d;
	System.out.print("Enter the number to get the root : ");
	d=sc.nextInt();
	double sqrt= Math.sqrt(d);
	System.out.println(sqrt);

	double e;
	System.out.print("Enter number(Decimal or integer) to make it round: ");
	e=sc.nextDouble();
	int round= (int) Math.round(e);// It will provide the nearest round number.
	System.out.println(round);
	
	double f;
	System.out.print("Enter a number to make it round by it's ceiling value : ");
	f=sc.nextDouble();
	int ceiling=(int)Math.ceil(f);
	System.out.println(ceiling );

	double g;
	System.out.print("Enter a number to make it round by it's floor value : ");
	g=sc.nextDouble();
	int floor=(int) Math.floor(g);
	System.out.println(floor);
	
	int h,i;
	System.out.print("Enter two number to get the maximum and minimum value among them: ");
	h=sc.nextInt();
	i=sc.nextInt();
	int max=Math.max(h, i);
	System.out.print("The maximum number between them is: ");
	System.out.println(max);
	System.out.println("The minimum number between them is: "+Math.min(h, i));


	// Mathematical problem 01
	System.out.print("\nLet you have a Right Angle Triagle "
			+ "\nTo calculate the Hypotenuse of that triagle "
			+ "\nEnter the vertical side, and Base:  ");
	int j,k;
	j=sc.nextInt();
	k=sc.nextInt();
	double hypo= Math.sqrt((Math.pow(j,2)+Math.pow(k,2)));
	System.out.println("The Hypotenous of the triangle is: "+hypo+"cm");

	// Mathematical problem 02
	       //Circumference ,Area, Volume
	System.out.println("\nLet a ring is a perfect circle ."
			+ "\nYou have to calculate the Circumference and the area of the Circle."
			+ "\nThen if the Cirlce turn into a Sphare then calculate the volume of the Sphare:");
	double radius;
	radius=sc.nextDouble();
	System.out.println("Circumference: "+2*Math.PI*radius);
	System.out.println("Area: "+Math.PI*radius*radius);
	System.out.println("Volume: "+(4/3)*Math.PI+radius*radius*radius);








	
	sc.close();
	
}
}
