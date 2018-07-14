
public class Array2DRectangularDemo {

	public static void main(String[] args) {
		
		//sample declaration of 2D Array
		int grades[][] = {{86, 87, 90, 89},
						  {90, 97, 80, 60},
						  {88, 85, 65, 71},
						  {56, 90, 74, 65}
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
	}

}
