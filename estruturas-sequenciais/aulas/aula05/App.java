import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("The square root of: " + x + " is " + A);
		System.out.println("The square root of: " + y + " is " + B);
		System.out.println("The square root of: 25.0 " + " is " + C);
		//The function math.abs 
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println("The number " + x + " raised to the power: " + y + " is: " + A);
		System.out.println("The number " + x + " squared is: " + B);
		System.out.println("The number 5.0 " + " squared is: " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("The absolute value of " + y + " is: " + A);
		System.out.println("The absolute value of " + z + " is: " + B);
		
		
		double a, b, c, delta, x1, x2;
		System.out.println("Enter the coefficient A: ");
		a = input.nextDouble();
		System.out.println("Enter the coefficient B: ");
		b = input.nextDouble();
		System.out.println("Enter the coefficient C: ");
		c = input.nextDouble();
		delta = Math.pow(b, 2.0) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);		
		System.out.println("Root for the positive sign: " + x1);
		System.out.println("Root for the negative sign: " + x2);
		
		input.close();
	}

}
