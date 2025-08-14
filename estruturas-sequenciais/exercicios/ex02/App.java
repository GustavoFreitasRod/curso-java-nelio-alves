
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double length, width, squareMeter, price, area;
		
		
		System.out.println("What is the length of the plot? ");
		length = input.nextDouble();
		
		System.out.println("What is the width of the plot? ");
		width = input.nextDouble();
		
		System.out.println("What is the value of the square meter of the plot? ");
		squareMeter = input.nextDouble();
		
		area = length * width;
		price = area * squareMeter;
				
		System.out.printf("The area of the plot measures %.2f square meters, and its price is %.2f dollars! ", area, price );
		
		
		
		
		
		input.close();
	}

}
