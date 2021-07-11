package knitinggale;
import java.util.Scanner;
public class FindTheAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the length of Rectangle");
    double length=scanner.nextDouble();
    System.out.println("enter the width of Rectangle");
    double width=scanner.nextDouble();
    
    double area = length*width;
    
    System.out.println("Area of a Rectangle is" + area);
		
		
	}

}
