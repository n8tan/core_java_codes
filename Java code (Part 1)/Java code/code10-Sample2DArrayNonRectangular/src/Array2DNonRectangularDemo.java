
public class Array2DNonRectangularDemo {

	public static void main(String[] args) {
		
		//sample declaration of 2D Array
		int grades[][] = {{86, 87, 90, 89, 90, 70, 80},
						  {90, 97, 80, 60},
						  {88, 85, 71},
						  {56, 90},
						  {56},
						  {56, 90, 74, 65, 89, 30}
		};
		
		int outerCounter = 0;
		for (int[] rowData: grades){
			int innerCounter = 0;
			for(int cellData: rowData) {
				System.out.println("grade[" + outerCounter + "]"
						+ "[" + innerCounter + "]:" +cellData);
						innerCounter++;
				
			}
		outerCounter++;
		}
	   
		System.out.println("array index at [4][1]: " + grades[4][1]);
	}

}
