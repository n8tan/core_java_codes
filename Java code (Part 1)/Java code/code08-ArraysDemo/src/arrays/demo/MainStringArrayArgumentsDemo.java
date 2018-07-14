package arrays.demo;

public class MainStringArrayArgumentsDemo {

	public static void main(String[] args) {
		
		//check if there are arguments passed to the main method
		
		//int index = 0;
		
		//args.toString().toCharArray();
		
		//System.out.println();
		
		if(args.length > 0){
			char message[] = "There are arguments passed.".toCharArray(); 
			//conversion of string to char array
			for(char letter:message){
				System.out.print(letter);
			}
			
			System.out.println("Here are the parameters.\n");
			for(String param: args){
				System.out.println(param);
			}
		}else{
			System.out.println("There are no arguments passed");
		}
		
	}

}
