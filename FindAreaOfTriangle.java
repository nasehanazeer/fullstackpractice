package knitinggale;
import java.util.Scanner;
public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner scanner=new Scanner(System.in);
		
         System.out.println("Enter the width of the triangle:");
         double base= scanner.nextDouble();
         
         System.out.println("Enter the hieght of the triangle:");
         double hieght = scanner.nextDouble();
         
         
         double area = (base*hieght )/2;
         System.out.println("Area of a triangle is"  + area);
         
	}

}
