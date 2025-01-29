package Loops;

public class PatternTriangle3 {
	
	    public static void main(String[] args) {
	       
	        for (int i = 1; i <= 3; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	        
	        System.out.println(" 1");
	        System.out.println("2 2");
	        
	       
	        for (int i = 1; i <= 4; i++) {
	            for (int j = 4 - i; j > 0; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }
	}

