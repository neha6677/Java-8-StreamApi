package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*class demo{
	public static final String joinWithPrefixPostfix(String[] arrayOfString){
		
	    return Arrays.asList(arrayOfString)
	      .stream()
	      //.map(...)
	      .collect(Collectors.joining(",","[","]"));
	    
	}*/

public class InsertStringIntoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		  List<String> list = Arrays.asList("hello ", " world"); 
		 
		  
		  StringBuilder sb = new StringBuilder(); 
		  list.forEach(sb::append);
		  //System.out.println(sb);
		  System.out.println(sb.insert(5, " my"));
		//  String con = sb.toString(); 
		  
		  System.out.println(sb);
		 
		
		
		/*
		 * demo d = new demo(); String [] arr= {"hy", "ji", "hytre"};
		 * System.out.println(d.joinWithPrefixPostfix(arr));
		 */
	}

}
