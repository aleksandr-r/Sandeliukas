package sandeliukas;

import java.util.Scanner;

public class Temp {

	static Scanner scanner = new Scanner(System.in);
	public static String ivestis;

	public static void main(String[] args) {
		do {
			System.out.println("Enter Y or N");
			ivestis = scanner.next().toUpperCase();
			System.out.println("You have entered" + " " + ivestis);
		} while ((!"Y".equals(ivestis))&&(!"N".equals(ivestis)));
	}
}
