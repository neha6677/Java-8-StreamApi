package streamapi;
import java.util.Scanner;
import java.util.Arrays;
interface StringFunc {
    void func(int r);
  }
public class Range {
  

	public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of character to print the pattern ");
      char row = scanner.next().charAt(0);
      
      System.out.println("## Printing the pattern ##");
       
        StringFunc r1 =(int h)->{
        	
        	int[] al=new int[]{65};
	           for(int i=0;i<=h;i++)
	            {
 for(int j=0;j<h-i;j++)
 { int s=0;
 char ch=(char)(al[s]+j);
 	Arrays.asList(al).stream().forEach(e->System.out.print(ch));
    
 	
 }
 for(int k=1;k<=i*2-1; k++)
 {
     System.out.print(" ");
 }
for(int l=h-i-1; l>=0; l--)
 {
     if(l!=h) 
     {int s=0;
     	char ch1=(char)(al[s]+l);
     	Arrays.asList(al).stream().forEach(e->System.out.print(ch1));
        
 }
 } 
System.out.println();

	            
	            }
        	
        };
   
      switch(row)
      {
      case 'A':
   	        	if(row=='A')
   	        	{
   	        int a=1;		
   	        
   	        	r1.func(a);
           	              
   	        	}        
    	          break;
      case 'B':
    	  if(row=='B')
	        	{
	        int a=2;		
	        
	        	r1.func(a);
         	        	}  
	           break;
      case 'C':
    	  if(row=='C')
       	{
       int a=3;		
       
       	r1.func(a);
       	        	}  
	           break;
      case 'D':
    	  if(row=='D')
       	{
       int a=4;		
       
       	r1.func(a);
       	        	}  
	           break;
      case 'E':
    	  if(row=='E')
	        	{
	        int a=5;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case 'F':
    	  if(row=='F')
	        	{
	        int a=6;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case 'G':
    	  if(row=='G')
	        	{
	        int a=7;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'H':
    	  if(row=='H')
	        	{
	        int a=8;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'I':
    	  if(row=='I')
	        	{
	        int a=9;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'J':
    	  if(row=='J')
	        	{
	        int a=10;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'K':
    	  if(row=='K')
	        	{
	        int a=11;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'L':
    	  if(row=='L')
	        	{
	        int a=12;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'M':
    	  if(row=='M')
	        	{
	        int a=13;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'N':
    	  if(row=='N')
	        	{
	        int a=14;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'O':
    	  if(row=='O')
	        	{
	        int a=15;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'P':
    	  if(row=='P')
	        	{
	        int a=16;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'Q':
    	  if(row=='Q')
	        	{
	        int a=17;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'R':
    	  if(row=='R')
	        	{
	        int a=18;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'S':
    	  if(row=='S')
	        	{
	        int a=19;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'T':
    	  if(row=='T')
	        	{
	        int a=20;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'U':
    	  if(row=='U')
	        	{
	        int a=21;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'V':
    	  if(row=='V')
	        	{
	        int a=22;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'W':
    	  if(row=='W')
	        	{
	        int a=23;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'X':
    	  if(row=='X')
	        	{
	        int a=24;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'Y':
    	  if(row=='Y')
	        	{
	        int a=25;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
      case'Z':
    	  if(row=='Z')
	        	{
	        int a=26;		
	        
	        	r1.func(a);
           	        	}  
    	  break;
       default:
    	   System.out.println("you are entered wrong chracter ,enter only capital character");
    	  break;
	           
       }
      
      
        }
}    