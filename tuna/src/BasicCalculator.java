import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner ashrith = new Scanner(System.in);
		double fnum,snum,answer;
		System.out.println("Enter first number");
		fnum = ashrith.nextDouble();
		System.out.println("Enter second number");
		snum = ashrith.nextDouble();
		answer = fnum+snum;
		System.out.println(answer);
		
	}

}
