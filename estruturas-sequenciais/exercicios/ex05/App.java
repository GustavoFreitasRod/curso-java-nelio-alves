import java.util.Scanner;
import java.util.Locale;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the employee code number: ");
		int employeeCode = input.nextInt();
		System.out.println("Enter the number of hours worked: ");
		double hoursWorked = input.nextDouble();
		System.out.println("What is the hourly wage");
		double hourlyWage = input.nextDouble();
		
		double salary = hoursWorked * hourlyWage;
		
		System.out.printf("The employee code number is %d%nand your salary is %.2f dollars", employeeCode, salary);
		
		input.close();
		

	}

}
