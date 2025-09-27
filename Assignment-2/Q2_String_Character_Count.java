package Assignment5;
import java.util.Scanner;

public class Q2_String_Character_Count {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("string : ");
	        String str = sc.nextLine();
	        
	        System.out.print("character : ");
	        char ch = sc.next().charAt(0);
	        
	        int count = 0;
	        
	        for(int i = 0; i < str.length(); i++) {
	            if(str.charAt(i) == ch) {
	                count++;
	            }
	        }
	        
	        if(count > 0) {
	            System.out.println("The number of times the character " + ch + " appears in the string is " + count);
	        } else {
	            System.out.println("The character " + ch + " doesn't appear in the string.");
	        }
	        
	        sc.close();
	    }
	}
