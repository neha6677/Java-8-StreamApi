package streamapi;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

interface PerformOperationall {
 boolean check(int a, int b);
}

class MyMath1 {
 public static boolean checker(PerformOperationall p, int num, int numb) {
  return p.check(num, numb);
 }
 
 public static PerformOperationall isPalindrome() {
     return (a,c) -> c == Integer.parseInt(new StringBuilder(String.valueOf(c)).reverse().toString()) ? true : false;
 }
 
 public static PerformOperationall isEven() {
	return (a,c)->(c % 2 == 0) ? true : false;
	
 }
 
 public static PerformOperationall isOdd() {
		return (a,c)->(c % 2 != 0) ? true : false;
		
	 }

}
public class CheckEvenOddArmsPalindrom {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		MyMath1 ob = new MyMath1();
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter number to check for Palindrome");
		  int T = Integer.parseInt(br.readLine());
		  int input = Integer.parseInt(br.readLine());
		 
		  PerformOperationall op;
		  boolean ret = false;
		  String ans = null;
		  
		  //op = ob.isPalindrome();
		    
		   // System.out.println(ans);
		    
		    if(T==1) {
		    	op = ob.isEven();
		        ret = ob.checker(op,T, input);
		        ans = (ret) ? "ODD" : "EVEN";
		        if(ret==true) {
		        	System.out.println(" num is even");
		        }
		        System.out.println(" num is not even");
		    }
		    if(T==2) {
		    	op = ob.isOdd();
		        ret = ob.checker(op,T, input);
		        ans = (ret) ? "ODD" : "EVEN";
		        //System.out.println(ret);
		        if(ret==true) {
		        	System.out.println(" num is odd");
		        }
		        System.out.println("num is not odd");
		    }
		    if(T==4) {
		    	op = ob.isPalindrome();
		    	ret = ob.checker(op, T,input);
			    
			    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
			    if(ans=="PALINDROME") {
			    	System.out.println("it is palindrome");
			    }
			    System.out.println("it is not palindrome");
		    }
	}
}


