import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three values: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double areaTriangle = a * c / 2;
		double areaCircle = Math.pow(c, 2.0) *  3.14159;
		double areaTrapezoid = (a + b) / 2 * c;
		double areaSquare = Math.pow(b,2.0);
		double areaRectangle = a * b;
		
		System.out.printf("TRIANGLE: %.3f%nCIRCLE: %.3f%nTRAPEZOID: %.3f%nSQUARE: %.3f%nRECTANGLE %.3f", areaTriangle, areaCircle, areaTrapezoid, areaSquare, areaRectangle );
		input.close();
	}

}
