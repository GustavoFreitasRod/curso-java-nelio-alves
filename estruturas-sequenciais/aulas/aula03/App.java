
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		String x;
		x = input.next();
		System.out.println("You typed: " + x);

		int y;
		y = input.nextInt();
		System.out.println("You typed the integer number: " + y);

		double d;
		d = input.nextDouble();
		System.out.println("You typed the floating-point number: " + d);

		char l;
		l = input.next().charAt(0);
		System.out.println("You typed the character: " + l);
		// .charAt = extracts a character from a string and captures the first letter of the input

		String s;
		int i;
		double p;
		System.out.println("Type your name, your age and your income on the same line: ");
		s = input.next();
		i = input.nextInt();
		p = input.nextDouble();
		System.out.printf("Your name is: %s, your age is %d years and your income is %.2f dollars! ", s, i, p);
		//In this way, we can write information from different types, by using the spacebar 
		//on the keyboard to separate them.
		
		
		
		

		input.close();

	}

}
