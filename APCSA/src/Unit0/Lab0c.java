package Unit0;
import static java.lang.System.*;
import java.util.Scanner;

public class Lab0c {
	  public static void main(String[] args) {
	    
		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		Scanner keyboard = new Scanner(System.in);

	    //add in input for all variables
	     
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
	    System.out.println("");
	    System.out.print("Enter an double :: ");
		doubleOne = keyboard.nextInt();
		System.out.print("Enter an double :: ");
		doubleTwo = keyboard.nextInt();
		System.out.println();
		System.out.print("Enter an float :: ");
		floatOne = keyboard.nextInt();
		System.out.print("Enter an float :: ");
		floatTwo = keyboard.nextInt();
		System.out.println();
		System.out.print("Enter an short :: ");
		shortOne = keyboard.nextShort();
		System.out.print("Enter an short :: ");
		shortTwo = keyboard.nextShort();
			
	    //add in output for all variables

		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
	    System.out.println();
	    System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
			
	  }
}
