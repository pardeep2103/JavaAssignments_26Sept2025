package Assignment5;

public class Q1_2D_Array_Rows_Columns {
	
	    public static void main(String[] args) {
	        // Create 3 rows and 4 columns array
	        int[][] numbers = {
	            {12, 20, 9, 15},
	            {6, 8, 10, 21},
	            {13, 14, 5, 18}
	        };       
	        int sum = 0;
	        int count = 0;  
	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 4; j++) {
	                if(numbers[i][j] % 3 == 0) {
	                    sum = sum + numbers[i][j];
	                }
	                
	                if(numbers[i][j] % 5 == 0) {
	                  count++;
	                }
	            }
	        }
	        
	        // Print results
	        System.out.println("Sum = " + sum);
	        System.out.println("Count = " + count);
	    }
	}
