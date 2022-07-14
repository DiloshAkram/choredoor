package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
	
	
		  public static void main(String[] args) {
		    ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    
		   System.out.println(cars.get(0)); 


		  //loop elements 
		  
		System.out.println("___________________");
		    for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));
		    }
		  
		    System.out.println("___________________");
		    
		    //for each loop
		  for (String i : cars) {
		      System.out.println(i);
		    }
		  System.out.println("___________________");
		  
		  
		  }
		  
}