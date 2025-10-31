import java.util.Random;

public class heybro05_random_class {
public static void main(String [] args)
{
	Random rn= new Random();
	/*
	 * In bracket the first number is inclusive and the second number is exclusive.
	 */
	int number1;
	number1 =rn.nextInt(1,101);
	
	int number2;
	number2= rn.nextInt(1,101);
	
	int number3;
	int number4;
	number3= rn.nextInt(1,101);
	number4= rn.nextInt(1,101);

	//Between 0 and 1;
	double number5;
	double number6;
	number5=rn.nextDouble();
	number6=rn.nextDouble();

	//
	boolean isHeads;
	isHeads=rn.nextBoolean();
	
	
	
	System.out.println("Integer number:\n"+number1);
	System.out.println(number2);
	System.out.println(number3);
	System.out.println(number4);
	System.out.println("\nDouble number:\n"+number5);
	System.out.println(number6);
	if(isHeads)
	{
		System.out.println("\nCoin position: Heads");
	}
	else
	{
		System.out.println("\ncoin position: Tails");
	}




}
}
