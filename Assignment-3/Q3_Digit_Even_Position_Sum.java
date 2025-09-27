package Assignment5;

import java.util.Scanner;


public class Q3_Digit_Even_Position_Sum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        String s = num + "";
        int sum = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(i % 2 == 1) {
        	    sum = sum + (s.charAt(i) - '0');
        	
            }
        }
        
        System.out.println(sum);
        sc.close();
    }
}
