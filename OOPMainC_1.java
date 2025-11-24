import java.util.Random;
import java.util.Scanner;

public class OOPMainC_1 {
 public static void main (String [] args)
 {
	 /* Object = An entity that hold data(attribute)
	  *        -> Human= Name,age,hight,weight.
	  *       and can perform action (methods)
	  *       ->Eat,walk,talk,sleep,run,laugh.
	  *   It is a reference data type.
	  *   
	  * Class =  Conserve as a blueprint to create object.
	  * 
	  */
	 Scanner sc= new Scanner(System.in);
	 Random rd= new Random();
	 
	 Car_1 car = new Car_1();
	 
	 //car.isRunning= true;
	 System.out.println(car.make);
	 System.out.println(car.model);
	 System.out.println(car.year);
	 System.out.println(car.price);
	 System.out.println("\n\n"+car.isRunning);
	 
	 car.start() ;
	 car.drive();
	 System.out.println(car.isRunning);
	 car.brake();
	 car.stop();
	 System.out.println(car.isRunning);
	 
	 
	 Car_1 car2=new Car_1();
	 System.out.println(car.make+" "+car.model);
	 System.out.println(car2.make+" "+car2.model);


	 
	 
	 
	 


	 
	 
 }
}
