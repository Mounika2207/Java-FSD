package EmailID;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email address:");
        String email = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
	}
}


