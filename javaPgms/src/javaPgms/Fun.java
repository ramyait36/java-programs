package javaPgms;

import java.util.Scanner;

public class Fun {

	public Fun() {
		// TODO Auto-generated constructor stub
	}
	
		public static void main(String[] args) {
		
		            	Scanner scan = new Scanner(System.in);
		            	System.out.print("Enter your no: ");
		      		int n = scan.nextInt();	 
					int y = mul(n);
					System.out.println(y);
					scan.close();;
				
		}
		 
		     public static int mul(int n)
		   {
		    	
		       n=n*n;
		       return n;
		    }}