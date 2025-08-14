import java.util.Locale;
public class App {
	

	public static void main(String[] args) {
		
		double x = 3.141592653;
		double height = 10.5738;
			
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("The height in meters is equal to: " + height + " meters");
		System.out.printf("The height in meters is equal to: %.1f meters%n", height);
		
		String name = "Maria";
		int age = 32;
		double income = 4000.00;
		
		System.out.printf("%s is %d years old and earns %.2f dollars%n", name, age, income);
		System.out.print("TEST");
		
  }
} 