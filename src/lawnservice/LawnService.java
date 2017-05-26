

package lawnservice;
import java.util.Scanner;

public class LawnService {

	public static void main(String[] args) {
		
		int lawnLength,lawnWidth;
		int time;
		int area;
		int hours;
		int minutes;
		
		
		
		System.out.println("Please enter the lawn length in yards");
		
		Scanner lawnL=new Scanner(System.in);
		lawnLength = lawnL.nextInt();
		
		System.out.println("Please enter the lawn width in yards");
		
		Scanner lawnW =new Scanner(System.in);
		lawnWidth = lawnW.nextInt();
		
		area = (lawnLength * lawnWidth);
		
		time = (area * 1) / 20;
		
		hours = time /60;
		
		minutes = time % 60;
		 
			
		
		
		 if (time <= 59) {
	           
	            
	     System.out.println("The amount of time mowing will be, " + time + " minutes");
	       
		 }
		 	
			 
		 else if (time>=60) {
		             System.out.println("The amount of time mowing will be " + hours + " hours " + minutes + " minutes");
		  }
		        	 
		       

	}
		 
}
		 
	       
		
	



	




