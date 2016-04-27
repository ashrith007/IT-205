import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		int n, c, factorial = 1;
		System.out.print("Enter an Integer to calculate it's factorial: ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		if (n < 0) {
			System.out.println("Number should be non-negative");
		} else {
			for (c = 1; c <= n; c++)
				factorial = factorial * c;
			System.out.println("Factorial of " + n + " is = " + factorial);
		}
	}
}
