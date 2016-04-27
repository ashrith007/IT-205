import java.util.Scanner;

public class divisibility {

	public static void main(String[] args) {
		int n,c;
		System.out.println("Enter the number you want to divide");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (c = 1; c <= 10; c++)
		if (n % c == 0) {
			System.out.println(n + " is divisible by:" +c);
		} else {
			System.out.println(n + " is not divisible by:" +c);

		}
	}
}