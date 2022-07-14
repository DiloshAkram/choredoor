package JavaMethod;

public class For_ForEachLoop {

	public static void main(String[] args) {
	
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.print(i);
			}
		
		System.out.println("_______________________");
		//for each
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.print(i);
		}
		
		
		

	}

}
