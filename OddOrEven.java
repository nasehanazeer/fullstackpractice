package knitinggale;
import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num ;
System.out.println("Enter an Integer number");

Scanner input = new Scanner(System.in);
num = input.nextInt();

//if (num % 2 == 0);{

//System.out.println("Entered Number is Even");
//}
if (num % 2 == 0) {
	System.out.println("Entered Number is Even");	
} else {
	System.out.println("Entered Number is Odd");
} 
	
		
	}

}
