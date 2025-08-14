import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String x, y, z;
		x = input.nextLine();
		y = input.nextLine();
		z = input.nextLine();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		//input.nextLine: We use it to separate inputs from different lines, by pressing the enter key
		
		int x1;
		String s1, s2, s3;
		x1 = input.nextInt();
		input.nextLine(); //Consumes the newline character after the integer input
		s1 = input.nextLine();
		s2 = input.nextLine();
		s3 = input.nextLine();
		System.out.println(x1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//When using a command other than nextLine() to read input, a newline character remains in the standard input buffer
		//if you then use nextLine(), the pending newline character is consumed by nextLine().
		
		input.close();
	}

}
