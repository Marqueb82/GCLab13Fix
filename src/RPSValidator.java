import java.util.InputMismatchException;
import java.util.Scanner;

public class RPSValidator {

	public static int getInt(Scanner scnr, String prompt) {
		System.out.println(prompt);
		try {
			int num = scnr.nextInt();
			while (num < 1 || num > 2) {
				System.out.println("Retry selection: ");
				num = scnr.nextInt();
			}
			scnr.nextLine();
			return num;
		} catch (InputMismatchException e) {
			System.out.println("Enter value as listed:");
			scnr.nextLine();
			return getInt(scnr, prompt);
		}
	}

	public static String getStringMatchingChoice(Scanner scnr, String prompt) {
		boolean isValid = false;
		System.out.println(prompt);
		String input;
		do {
			input = scnr.next();

			if (input.equalsIgnoreCase("r") || input.equalsIgnoreCase("p") || input.equalsIgnoreCase("s")
					|| input.equalsIgnoreCase("y") || input.equals("n")) {
				isValid = true;
			} else {
				System.out.println("Input must match letter.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}

	public static String getStringMatchingRegex(Scanner scnr, String prompt) {
		System.out.println(prompt);
		boolean isValid = false;
		String regex = "[A-Za-z]{3,15}";
		String input;
		do {
			input = scnr.next();

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Names only contain letters and should be at least 3 characters long!! :->");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}

}
