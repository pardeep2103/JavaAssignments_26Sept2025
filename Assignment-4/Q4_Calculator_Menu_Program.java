package Assignment5;
import java.util.Scanner;

public class Q4_Calculator_Menu_Program {
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	       
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter Second number: ");
            int b = sc.nextInt();
	        
	        System.out.println("1) Addition");
	        System.out.println("2) Subtraction");
	        System.out.println("3) Multiplication");
	        System.out.println("4) Division");
	        System.out.println("5) Exit");
	        
	        System.out.print("Enter your choice : ");
	        int c = sc.nextInt();
	        
	        if(c == 1) {
	            System.out.println("The output is " + (a + b));
	        }
	        else if(c == 2) {
	            System.out.println("The output is " + (a - b));
	        }
	        else if(c == 3) {
	            System.out.println("The output is " + (a * b));
	        }
	        else if(c == 4) {
	            System.out.println("The output is " + (a / b));
	        }
	        else if(c == 5) {
	            System.out.println("Exit");
	        }
	        else {
	            System.out.println("Wrong choice");
	        }
	        
	        sc.close();
	    }
	}
