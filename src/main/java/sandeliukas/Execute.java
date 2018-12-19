package sandeliukas;

import java.util.Scanner;

import static sandeliukas.Warehouse.countEggsSum;

public class Execute {

	public static String size;
	public static String answer;
	static Scanner enter = new Scanner(System.in);
	private static int count;
	private static String deliveryDate;
	public static String input;

	public static int countEggsSum;

	public static void main(String[] args) {
		System.out.println("Welcome!");
		goEggsInWarehouseDB();



		initialCheck();

		if (input.equals("Y")) {
			getTheInputs();
			passingToOrder();
			generatePositiveResponse();


		} else {
			generateNegativeResponse();
		}
	}


	public static void goEggsInWarehouseDB() {

		Warehouse.eggsInWarehouseDBTotals();
		Warehouse.eggsInWarehouseDB();
		countEggsSum = Warehouse.countEggsSum;

	}

	public static void getTheInputs() {
		countCheck();
		sizeCheck();
		dateCheck();
	}


	public static void passingToOrder() {

		Order order = new Order(count, size, deliveryDate);
	}

	public static void initialCheck() {
		do {
			System.out.println("Would you like some eggs? (Y/N)");
			input = enter.next().substring(0,1).toUpperCase();
			//input.substring(0,1);
			System.out.println(input);
		} while ((!"Y".equals(input))&&(!"N".equals(input)));

	}
//ToDo: - fix the error what passing text instead of number
	//Todo - you can pass the order and create negative value in db
	//https://stackoverflow.com/questions/12838346/possible-exception-if-user-enters-string-instead-of-int
	public static void countCheck() {
		do {
			System.out.println("How many eggs would you like to buy? Min. 1, max. " + countEggsSum);
			count = enter.nextInt();
		} while (count>countEggsSum || count<=0);

	}

	public static void sizeCheck() {
		do {
			System.out.println("What is the size? (L, M, S)");
			size = enter.next().toUpperCase();
		} while ((!"L".equals(size))&&(!"M".equals(size))&&(!"S".equals(size)));

	}

	//ToDo: change to date format
	public static void dateCheck() {
		do {
			System.out.println("What is the delivery date? Only 20190101 allowed");
			deliveryDate = enter.next();
		} while ((!"20190101".equals(deliveryDate)));

	}

	public static void generateNegativeResponse() {
		System.out.print("Bye, cunt");
		System.exit(0);
	}
	public static void generatePositiveResponse(){
		System.out.print("Thank you!");
		System.exit(0);
	}


}




