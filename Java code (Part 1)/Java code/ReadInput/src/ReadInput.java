import java.util.Scanner;


public class ReadInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String nameInput = scan.nextLine();
		
		System.out.print("Enter age: ");
		int age = scan.nextInt();
		
		System.out.println("Your name is " + nameInput);
		System.out.println("Your age in 5 from now is " + (age + 5));
		
		System.out.println((5+10) + " Little Pigs");
		
		if (age > 20) {
			System.out.println(" > 20");
		} else {
			System.out.println(" < 20");
		}
	}

}
