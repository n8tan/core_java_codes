package arrays.demo;

public class ArrayDeclarationWithInitialization {

	public static void main(String[] args) throws InterruptedException{
		//integer array declaration with initialization
		int numbers[] = {41, 30, 11, 9, 31};
	
		//character array declaration with initialization
		char message[] = {'j', 'a', 'v', 'a'};
	
		String messages[] = {"I", "love", "Java", "Programming", "."};
		
		double mgaNumero[] = {10.5, 11, 33, 96.3, -5};
	
		printArray(numbers);
		printArray(message);
		printArray(messages);
		printArray(mgaNumero);
	}

	public static void printArray(Object obj) throws InterruptedException{
		
		if(obj instanceof int[]){
			System.out.println("Array integer value:");
			for(int numero: (int[]) obj){ //shorctcut casting - downcasting; from object to generic array 
				System.out.println(numero);
			}
		}else if(obj instanceof char[]){
			System.out.println("Array character value:");
			for(char letra: (char[]) obj){
				Thread.sleep(750);
				System.out.println(letra);
			}
		}else if(obj instanceof String[]){
			System.out.println("Array integer value:");
			for(String mensahe: (String[]) obj){
				System.out.println(mensahe);
			}
		}else if(obj instanceof double[]){
			System.out.println("Array integer value:");
			for(double numero: (double[]) obj){
				System.out.println(numero);
			}
		}
	}
}
