import java.util.Scanner;

public class Task3b_PrintZFigure {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if ((i == 1 || i == number) || (i == number - j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}