import java.util.Scanner;

public class heybro07_printf {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		//printf()=is a method used to format output;
		//%[flags][width][.orecision][specifier-character]
		
		
		//using printf like c language . Same as c Style.
		
		String name ="ALi Ahsan Maruf";
		char firstletter='A';
		int age =30;
		double hight=5.8;
		boolean isEmployed=true;
		System.out.printf("Hello %s",name);
		System.out.printf("\nYour name start with a %c",firstletter);
		System.out.printf("\nYou are %d years old.",age);
		System.out.printf("\nYou are %.1f feet tall.",hight);
		System.out.printf("\nEmployed: %b.",isEmployed);
		System.out.printf("%s is %d years old.",name,age);
		double price1=90000.99;
		double price2=1000000.15;
		double price3=-540000.01;
		/*.1f or .2f or.3f is represent how many decimal number would appear after
		 * decimal point.
		 * 
		 * using comma(,) we can separate the number after thousand  number .
		 * 
		 * using first bracket '(' we can parentesise the negative number.not for positive.
		 * 
		 * using space after '(' -> if it is positive value then it will take 
		 * space not for negative value.
		 */ 
		System.out.printf("\n\nPrice1 = %( ,.1f\n",price1);
		System.out.printf("Price2 = %( ,.2f\n",price2);
		System.out.printf("Price3 = %( ,.3f\n",price3);

		
		//Width
		    // 0 = Zero padding 
		/* number = right justified padding .
		 * negative number = left  justified padding.
		 * 
		 * -> using zero '0with(max length of a number )' after %d sing we can 
		 *     add zero before any integer to make the integer equal.
		 * -> same as if use space instead of zero.
		 *    length with the maximum length number.
		 *-> if we use negative sign before d
		 */
		
		System.out.println("\n Zero padding or space padding .");

		int id1=1;
		int id2=23;
		int id3=456;
		int id4=3424;
		System.out.printf("%4d\n",id1);
		System.out.printf("%4d\n",id2);
		System.out.printf("%4d\n",id3);
		System.out.printf("%4d\n",id4);



		
		
		




		
		
		
		
		
		
	}

}
