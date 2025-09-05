package TemplateMethod.Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose login method (1 - Google, 2 - Facebook):");
        int choice = scanner.nextInt();

        AbstractLogin login;
        if (choice == 1) {
            login = new GoogleLogin();
        } else {
            login = new FacebookLogin();
        }
        login.login("user_facebook", "facebook123");

        scanner.close();
    }
}
