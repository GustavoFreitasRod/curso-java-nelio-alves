
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first value: ");
		int A = input.nextInt();
		System.out.println("Enter the second value: ");
		int B = input.nextInt();
		System.out.println("Enter the third value: ");
		int C = input.nextInt();
		System.out.println("Enter the fourth value: ");
		int D = input.nextInt();
		
		int difference = A * B - C * D;
		
		System.out.printf("The difference between %d times %d and % d times %d is: %d", A, B, C, D, difference);
		
		
		input.close();
	}

}
