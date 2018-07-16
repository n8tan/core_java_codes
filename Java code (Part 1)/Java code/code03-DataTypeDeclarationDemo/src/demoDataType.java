
public class demoDataType {

	public static void main(String[] args) {
		//integral data types
		byte numberbyte = 10;
		short numberShort = 100;
		int numberInt = 1500;
		long numberLong = 500;
		
		System.out.println("Byte Value: " + numberbyte + "\n"
			+ "Short Value: " + numberShort + "\n"
			+ "Int Value: " + numberInt + "\n"
			+ "Long Value: " + numberLong);
		
		//floating-point literal
		float floatNumber = 10.5f;
		double doubleNumber = 100.65;
		
		System.out.println("Float value: " + floatNumber + "\n"
			+ "Double value: " + doubleNumber);
		
		char charValue = 'i';
		String stringValue = "ACADEMY";
		
		boolean isGoodSchool = true;
		
		if (isGoodSchool) {
			System.out.println("Good school is "
			 + (charValue + stringValue)+".");
		}

	}

}
