package javaPgms;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ArrPgms {
	public static void main(String[] args) {

		/*
		 * int arr[] = {10, 4, 3, 50, 23, 90, 23,23,23}; 
		 * TreeSet<Integer> set = new TreeSet<Integer>();
		 *  NavigableSet<Integer> descset = new TreeSet<Integer>();
		 * 
		 * for (int i = 0;i< arr.length; i++) { set.add(arr[i]); }
		 * 
		 * System.out.println("set before" + set); // reverse order
		 * 
		 * descset = set.descendingSet(); // when add or remove element in descending
		 * set it reflects the same in set too) descset.add(500);
		 * 
		 * set.add(6000);
		 * 
		 * System.out.println("descset" + descset ); System.out.println("set after" +
		 * set );
		 * 
		 * Integer b[] = new Integer[set.size()];
		 * 
		 * //convert set to array
		 * 
		 * descset.toArray(b);
		 * 
		 * 
		 * for (int value : b) { System.out.println(value); }
		 * 
		 * 
		 * System.out.println("first 3 largest distinct elements: " + b[0]+"," +
		 * b[1]+", " + b[2]);
		 * 
		 * 
		 * //conversion of Integer Array to int array
		 * 
		 * int[] bArr = new int[b.length]; for(int j=0;j<b.length;j++) { bArr[j]=b[j];
		 * System.out.println(bArr[j]); }
		 * 
		 * //System.out.println("first 3 largest distinct elements: " + bArr[0]+"," +
		 * bArr[1]+", " + bArr[2]);
		 * 
		 * 
		 */
		
		
		// find second largest no in array
		
		int arr[] = { 100,546,343,879,879};
		int temp,j, k, i= 0;
		//j= arr[i];
		//k=arr[i+1];
		
		for ( i=0;i<arr.length;i++)
		{
			for (j=i+1;j<arr.length;j++) {
				
						
		 if(arr[i]>arr[j])	
		 {
			 temp = arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
		 }
		 
		 
		}
		
		
		

	}
		
		System.out.println(Arrays.toString(arr));
}
}
