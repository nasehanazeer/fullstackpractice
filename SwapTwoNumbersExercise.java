package knitinggale;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float first = 2.50f, second = 4.50f; 

System.out.println("...before swap .....");
System.out.println("First number = " + first);
System.out.println("Second number = "  +  second) ;


float temporary = first ;


first = second;
second = temporary;

System.out.println("...after swap ...");
System.out.println("First number  =  "  + first);
System.out.println("Second number =  "  + second );


	}

}
