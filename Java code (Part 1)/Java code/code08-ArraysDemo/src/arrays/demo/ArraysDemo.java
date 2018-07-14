package arrays.demo;

public class ArraysDemo {

	public static void main(String[] args) {
	
		int numbers[] = new int[10];
		
		int counter = 0;
		for(int number:numbers){
			System.out.println("numbers[" + counter + "]: " + number);
			counter++;
		}
		System.out.println("\n\n");
		boolean blnVar[] = new boolean[10];
		//use while loop to print elements
		counter = 0;
		while(counter < 10){
			System.out.println("blnVar[" + counter + "]: " + blnVar[counter]);
		counter++;
		}
		
		String name[] = new String[10];
		
		//perform first print
		printArray(name);
		
		//perform initialization for array
		initializeArray(name);
		
		printArray(name);
	}
	
	public static void initializeArray(String mgaPangalan[]){
		
		for(int counter=0; counter < mgaPangalan.length; counter++){
			mgaPangalan[counter] = "James Gosling_" + counter;
		}
	}

	public static void printArray(String name[]){
		//enhanced for loop or for  each loop
		System.out.println("\n\n");
		for(String pangalan: name){
			System.out.println(pangalan); //default to null
				}
	}
}
