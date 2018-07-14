package branch.demo;

public class BranchingStatementsDemo {

	public static void main(String[] args) {
		//breakDemo();
		
		//use of continue
		for (int counter = 1; counter <=10; counter++) {
			if (counter == 5) {
				continue;
				//illegal to put any executable statement after continue keyword
			}
			System.out.println("Value of counter: " + counter);
		}
		System.out.println("\n\nProgram terminated");
		
	
	}
	
	public static void breakDemo() {
		//sample inner loop
		int outerLoop = 3;
		int innerLoop = 10;
		
		//using for loop
		for(int outerCounter = 1; outerCounter <= outerLoop;
			outerCounter++) {
			
			if (outerCounter == 2) {
				break;
			}
			
			System.out.println(outerCounter  + ". Outer Loop");
			
			for (int innerCounter = 1; innerCounter <= innerLoop;
				innerCounter++) {
				
				
				if (innerCounter == 5) {
					break;
					//illegal to put any executable statement after break keyword
				}
			
				System.out.println("\t" + innerCounter  + ". Inner Loop");
			}
		}
		System.out.println("\n\nProgram terminated");
	}

}
