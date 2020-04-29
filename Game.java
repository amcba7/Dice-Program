import java.util.Scanner;
import java.io.IOException;
class Game {
	private static Scanner cin = new Scanner(System.in);
	private static int input;
	private static Cube dice = new Dice();
	private static boolean isNumber;
	public static void cls() {
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		System.out.println("\t\t\t<----------------------{\tDice Program\t}--------------------->");
		dice.show();
		while (true) {
			System.out.print("Press to 1. Roll Dice\t2.exit");
			do {
				if (cin.hasNextInt()) {
					input = cin.nextInt();
					cls();
					isNumber = true;
				} else {
					System.out.println("invaid input");
					isNumber = false;
					cin.next();
				}
			} while(!(isNumber));
			if(input==1) {
				dice = new Dice();
				System.out.println(dice);
				dice.show();
			} else if (input==2) {
				System.exit(0);
			} else {
				System.out.println("invalid input");
			}
		}
	}
}