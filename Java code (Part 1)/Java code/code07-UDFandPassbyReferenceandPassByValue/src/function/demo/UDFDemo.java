package function.demo;

public class UDFDemo {

	public static void main(String[] args) {
		
		int number = 10;
		System.out.println("Value before calling the changeValue: " 
				+ number);
		
		number = changeValue(number);
		
		System.out.println("Value after calling the changeValue: " 
				+ number);
		
		System.out.println("-------------------------------------------------");
		int numbers[] = {10};
		System.out.println("Value before calling the changeValue (obj): "
				+ numbers[0]);
		
		changeValue(numbers);
		
		System.out.println("Value after calling the changeValue (obj): "
				+numbers[0]);
		
		
	}
	
	//pass by value
	public static int changeValue(int number) {
		number = 15;
		
		return number;
	}
	
	//pass by reference
	public static void changeValue(int mgaNumero[]) {
		
		if (mgaNumero instanceof int[]) {
			System.out.println("mgaNumero is an Object");
		}
		mgaNumero[0] = 100;
	}
	
	
}
