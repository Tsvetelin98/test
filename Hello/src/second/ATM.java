package second;

import java.util.Scanner;


public class ATM  {
	static Scanner keyboard = new Scanner(System.in);
	static String acctNum, pwd, result;
	static double oldBalance, newBalance, deposit, withdraw,currentBalance;
	static int choose;

	public static void main(String[] args) {
		for (int run = 0; run < 3; run++) {
			System.out.println("Въведи потребителско име:");
			acctNum = keyboard.nextLine();
			System.out.println("Парола:");
			pwd = keyboard.nextLine();

			result = checkID(acctNum, pwd);
			if (!result.equals("Грешка!")) 
				break;
			else if (run == 2) {                       					  //максимално 3 опита

				System.out.println("Картата е блокирана!"); 
				return;

			}

		}
		Меню();
	}

	public static String checkID(String acctNum, Object pwd) {
		String result = "Грешка!";


		if (acctNum.equals("ceco") && pwd.equals("2011")) {
			result = "ВЯРНО";	} 
		System.out.println(result);
		return result;
	}

	public static int Меню() {
		System.out.println("Избери действие: \n1.Баланс\n2.Внасяне\n3.Теглене\n4.Излез");
		choose = keyboard.nextInt();

		if (choose == 1) {
			displayBalance();
			Меню();
			return 1;

		}
		if (choose == 2) {
			Внасяне();
			Меню();
			return 2;

		}
		if (choose == 3) {
			Теглене();
			Меню();
			return 3;

		}
		if (choose == 4) {
			System.out.println("Ти излезе.");
			return 4;

		}
		if (choose <= 5) {
			System.out.println("Грешка");
			Меню();
			return 5;
		}
		if (choose >= 1) {
			System.out.println("Грешка");
			Меню();
			return 6;
		}
		return choose;

	}

	public static void Внасяне()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Сума за внасяне:");
		double amount = input.nextDouble();
		System.out.println("Сума: " + amount);
		currentBalance += amount;
		System.out.println("Твоята нова сметка е: " + currentBalance);
	}

	public static double displayBalance() {
		System.out.println("Парите са ти: $" + currentBalance);
		oldBalance = 0.00;
		return 1;
	}

	public static void Теглене()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Сума за теглене: ");
		double amount = input.nextDouble();
		System.out.println("Сума: " + amount);
		currentBalance -= amount;
		System.out.println("Парите са ти: " + currentBalance);
	}
}