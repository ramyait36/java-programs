package javaPgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;

public class ArrayListPgms {


	public static void main(String[] args) {

		//			ArrayList<Integer> li = new ArrayList<Integer> ();
		//			li.add(10);
		//			li.add(20);
		//			li.add(30);
		//			for (int num: li)
		//			{
		//				System.out.println(num);
		//
		//			} - output - 10
		//            20
		//            30

		//	System.out.println(li); - [10,20,30]

		//	remove 
		//	 li.remove(2);

		//			System.out.println(li); 


		// Creating an ArrayList
		//		        ArrayList<Integer> numbers = new ArrayList<>();
		//		        numbers.add(1);
		//		        numbers.add(3);
		//		        numbers.add(2);
		//		        System.out.println("ArrayList: " + numbers);

		//		        // Creating an instance of ListIterator
		//		        ListIterator<Integer> iterate = numbers.listIterator();
		//		        iterate.next();
		//		        iterate.next();
		//
		//		        // Using the previous() method
		//		        int number1 = iterate.previous();
		//		        System.out.println("Previous Element: " + number1);
		//
		//		        // Using the previousIndex()
		//		        int index1 = iterate.previousIndex();
		//		        System.out.println("Position of the Previous element: " + index1);
		//		        
		////  numbers.removeIf(n-> (n%2!=0));
		//   System.out.println("ArrayList: " + numbers);
		
		
   //  String s = "ababca";
//		     // converting string to string array
//		     String[] splt = s.split("");
//		     for (int i=0;i<=splt.length-1;i++) {
//		     System.out.println(splt[i]);
//		     }		     
// 
//		     
//		     // string to arraylist
//		     
//		     ArrayList<String> li = new ArrayList<String>(Arrays.asList(splt));
//		     System.out.println(li);
//		     
//		     // remove a 
//		     
//		     li.removeIf(i-> i.equals("a"));
//		     System.out.println(li);
		
	//	another solution:
     
//    s= s.replace("a", "");
//  System.out.println(s);
  
  
	//	Write a Java Program to reverse a String.
  
		
//		String str = "ramya";
//		StringBuffer bf = new StringBuffer(str);
		
//		int i;
//		for (i=str.length()-1;i>=0;i--) {
//			
//			res = res + str.charAt(i);}
//			System.out.println(res);
//         	bf = bf.reverse();
//         	System.out.println(bf);
         	
       // count the frequency of alphanumeric , alphabetic
//		int alphanumericCount = 0;
//		int alphabetCount = 0;
//        boolean value = false;
//
//		String arr[] = {"abcd", "mak87s", "abcd", "kakjdj", "laojs7s6"};
//	    for (int i=0;i<arr.length;i++)
//	    {
//	    	System.out.println(arr[i]);
//	    	
//	    	char[] ch = arr[i].toCharArray();
//	    	
//	    	for (int j=0;j<ch.length;j++) {
//	    		
//		    	System.out.println(ch[j]);
//
//	    	if(Character.isDigit(ch[j])) {
//		    	
//		    	//if(Character.(ch[j])) {
//			    	
//		    	
//
//	    			
//	    			//value = true;
//	    			
//	    			alphanumericCount++; 
//	    			break;
//	    			}
//	    		
//	    		 	
//	    		    		
//	    	}
//	    }
//
//    		System.out.println("the count of alphanumeric is  :"+alphanumericCount);
//    		
//    		alphabetCount= arr.length - alphanumericCount;
//    		
//    		System.out.println("the count of alphabet is  :"+alphabetCount);
		
		
//		// average, sum of ascii value of  words inn a sentence and also sentence itself
//		int asciSum = 0, asciAvg = 0;
//		int convert = 0;
//	//	int lRange = 'l';
//	//	int rRange = 'r';
//		int lRange = 102;
//		int rRange = 111;
//		int count =0;
//		String str = "geeks for geeks";
//		String strSplit[] = str.split(" ");
//		System.out.println(rRange);
//		System.out.println(lRange);
//				
//		for (int i =0;i<strSplit.length;i++)
//		{
//			
//				for (int j =0;j<strSplit[i].length();j++)
//				{
//				char ch = strSplit[i].charAt(j);
//				convert = ch;
//				//if (!((lRange <= convert) && (convert <= rRange))) {
//				 if (!(convert >= lRange && convert <= rRange)) {
//					System.out.println("the character not in range between l,r is:" + ch + "  " + "its asci value is: " + convert);
//										
//					count++;
//		///	System.out.print(convert); // just to convert all character of string to asci 
//				//asciSum = asciSum + (int) ch; // explict typecasting // sum of all ascii value of words in a sentence
//				// int asciSum = ch;
//				
//				// print the sum of asci of each word of a sentence
//				
//			//	asciSum = asciSum + (int) ch;
//					
//					
//							}
////				int Avg = asciSum/strSplit[i].length();
////				System.out.println("word is :" + strSplit[i]+","+"its asciSum is: " + asciSum  );
////				System.out.println("word is :" + strSplit[i]+","+"its asciSum is: " + Avg  );
////				asciSum = 0;
//
//			//	System.out.println(asciSum);
//			//System.out.println(convert);
//			}
//				
//		
//	//	System.out.println(asciSum);
//	//	System.out.println(str.length());
//		
//	//	System.out.println(asciAvg = asciSum/str.length());
//
//		
//		
		
//		int asciSum = 0, asciAvg = 0;
//		int convert = 0;
//	//	int lRange = 'l';
//	//	int rRange = 'r';
//		int lRange = 102;
//		int rRange = 111;
//		int count =0;
//		String str = "geeks for geeks";
//		String strSplit[] = str.split(" ");
//		System.out.println(rRange);
//		System.out.println(lRange);
//		
//		HashMap<Character,Integer> hMap = new HashMap<Character,Integer>();
//				
//		for (int i =0;i<strSplit.length;i++)
//		{
//			
//				for (int j =0;j<strSplit[i].length();j++)
//				{
//				char ch = strSplit[i].charAt(j);
//				convert = ch;
//				//if (!((lRange <= convert) && (convert <= rRange))) {
//				 if (!(convert >= lRange && convert <= rRange)) {
//					if( hMap.get(ch) != null) {
//						hMap.put(ch, hMap.get(ch)+1);}
//					else {
//						hMap.put(ch, 1);}
//					
//						
//			//		System.out.println("the character not in range between l,r is:" + ch + "  " + "its asci value is: " + convert);
//					
//					count++;
//				 }	
//				}
//				
//		}
//		System.out.println(count);
//		System.out.println(hMap.entrySet());
		
		/*
		// print the count of prime nos for the character 


		int convert = 0;
		//	int lRange = 'l';
		//	int rRange = 'r';
			int count =0;
			String str = "geeksforg";
			boolean value = true;
							
				for (int i =0;i<str.length();i++) {
				
			char ch = str.charAt(i);
					convert = ch;
					
					// check the asci no is prime or not
					for (int k = 2; k * k <= convert; k++)
				//	for (int k = 2; k <= Math.sqrt(convert); k++)
					//for (int k = 2; k <= convert/2; k++)
					//	for (int k = 2; k < convert; k++)

					{
						if(convert % k == 0)
						{
						 value = false;
						}
						
						else {
						value = true;
						}}
						if (value == true) {
						//	System.out.println("the character is :" + ch + "the ascii value is :" + convert);
							count++;

					                    }
									
						
						System.out.println(count);

					}*/
				
				
				
				String str = "hello morning how are  you!<><<>>>> aaaoiuuio";
				str = str.toLowerCase();
				int vowCount =0;
				int consCount = 0;
				String[] strSplit = str.split(" ");
				for(int i=0;i<strSplit.length;i++)
				{
					for (int j=0;j<strSplit[i].length();j++)
					{
						char ch = strSplit[i].charAt(j);
						if(Character.isAlphabetic(ch)) {
							if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
								vowCount++;				
							}
							
							else {
								consCount++;
							}
						}
					}
				}
				System.out.println(str.length());
				System.out.println(vowCount);
				System.out.println(consCount);
				 }}
						
					
					
				//	);}


					
					

					

			

     
			
			

		     
		     
		     
		     
	






	
	    	
	    
	
				
  


    
     
			
			

		     
		     
		     
		     


	
















