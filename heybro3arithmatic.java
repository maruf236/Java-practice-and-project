import java.util.Scanner;

public class heybro3arithmatic {
public static void main (String [] args)
{
	          //Arithmetic Operator
	
	int x=10;
	int y=2;
	int z ;
     z=x+y;
    System.out.println("Addition: Z=x+y= "+z);
    int k= x-y;
    System.out.println("Subtraction: k=x-y= "+k);
    int a= x*y;
    System.out.println("Multiplication: a=x*y= "+a);
    int b= x/y;
    System.out.println("Division: b=x/y= "+b);
    x++;
    int c=x%y;
    System.out.println("Modulus: c=x%y= "+c);

            //Augmented Assignment Operators
    int m=5;
    int n=12;
     m=m+n;//m+=n;
     System.out.println("Augmented addition m="+m);
     
     m=m-n;//m-=n;
     System.out.println("Augmented Subtraction m="+m);
     
     m=m*n;//m*=n;
     System.out.println("Augmented multiplication m="+m);
     
     m=m/n;//m/=n;
     System.out.println("Augmented Division m="+m);
     
     m=m%n;//m%=n;
     System.out.println("Augmented Mod m="+m);

            //Increment and decrement Operators
     m=m+1;//m++;//m+=1;
     x++; 
     System.out.println("M="+m+"\nX="+x);
     m--;//m-=1;
     x--;
     System.out.println("M="+m+"\nX="+x);

          //ORDER OF OPERATIONS (P-E-M-D-A-S)
			/* P= parenthesis 
			 * E= Exponent
			 * M= Multiplication
			 * D= Division 
			 * A=Addition
			 * S=Subtraction 
			 */
     double result = 3+4*(7-5)/2.0;//P-E-M-D-A-S
     
     System.out.println("Result ="+result);






}
}
