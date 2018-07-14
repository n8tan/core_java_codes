package exceptionsdemo;

import java.io.*;

public class ThrowsKeywordDemo {

	public static void main(String[] args) {
		try {
			System.out.println(getQuotient());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException nfe) {
			System.err.println(nfe.getMessage());
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public static double getQuotient() throws IOException, NumberFormatException , ArithmeticException{
		double result = 0;
		
		/*try {*/
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(System.in));
			
			int firstOperand = 10;
			System.out.println("First operand is 10.");
			System.out.println("enter second operand: ");
			int secondOperand = Integer.parseInt(reader.readLine());
			
			result = firstOperand / secondOperand;
		/*} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		} catch (NumberFormatException nfe) {
			System.err.println(nfe.getMessage());
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage());
		}*/
		return result; 
	}
}
