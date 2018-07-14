package arrays.demo;

public class VarArgsDemo {

	public static void main(String[] args) {
		
			int numbers[] = {10, 15, 20, 25};
		
			printArrayNumbers(numbers);
			printVarArgsNumbers(numbers);
			printVarArgsNumbers(10, 15, 40, 30, 70, 110);
			printASCIITable();
			
			//display total number of visible characters
			//display total number of invisible characters
			//display search keyword
			//display total number of search keyword occurrences
	}
	
	public static void printArrayNumbers(int number[]){
		System.out.println("Using integer array. \n");
		
		for(int numero : number){
			System.out.println(numero + " ");
		}
	}
	
	public static void printVarArgsNumbers(int ...number){
		System.out.println("using integer variable argument.\n");
		
		for(int numero:number){
			System.out.println(numero + " ");
		}
	}
	
	public static void printASCIITable(){
		System.out.println("\n\nDECIMAL\tASCII\tOCCURENCE");
		for(int counter =0; counter <= 255; counter++){
			char letter = (char) counter;
			System.out.println(counter + "\t" + letter);
		}
	}
	
}
