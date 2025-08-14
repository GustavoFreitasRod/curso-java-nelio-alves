
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the value of the circle's radius? ");
		double radiusCircle = input.nextDouble();
		
		double area = 3.14159 * Math.pow(radiusCircle, 2.0);
		
		System.out.printf("The area of the circle is %.4f square centimeters", area);
		
		
		
		
		input.close();
		
		
	}

}
