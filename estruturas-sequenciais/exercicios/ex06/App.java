import java.util.Scanner;
import java.util.Locale;
public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the code for the first piece, the quantity of pieces and the unit price? ");
		int codePiece1 = input.nextInt();
		int quantityPiece1 = input.nextInt();
		double unitPrice1 = input.nextDouble();
		
		System.out.println("Enter the code for the second piece, the quantity of pieces and the unit price? ");
		int codePiece2 = input.nextInt();
		int quantityPiece2 = input.nextInt();
		double unitPrice2= input.nextDouble();
		
		
		
		double totalValue = unitPrice1 * quantityPiece1 + unitPrice2 * quantityPiece2;
		
		System.out.printf(" The first piece code: %d%n The second piece code: %d%n The total value of purchase: %.2f dollars!", codePiece1, codePiece2, totalValue);
		
		input.close();
	}

}
