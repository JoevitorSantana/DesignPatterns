package TemplateMethod.Login;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FacebookLogin extends AbstractLogin
{
    String OTPCode;

    public FacebookLogin() {}

    public boolean authenticate(String username, String password) {
        if (password.equals("facebook123")) {
            generateOTPCode();

            if (validateOTP()) {
                this.username = username;
                this.password = password;
                System.out.println("OTP validated successfully!");
            } else {
                System.out.println("OTP validation failed!");
                return false;
            }
            System.out.println("Facebook login successful!");
            return true;
        } else {
            System.out.println("Facebook login failed!");
            return false;
        }
    }

    private void generateOTPCode() {
        this.OTPCode = Integer.toString((int)(Math.random() * 900000) + 100000);
        System.out.println("Generated OTP Code: " + this.OTPCode);
    }

    private boolean validateOTP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the OTP code sent to your registered mobile number/email:");
        String userInput = scanner.nextLine().toString();

        return userInput.equals(this.OTPCode);
    }

    public void generateAccessToken() {
        // generate a hash token
        this.accessToken = Integer.toHexString(username.hashCode() + password.hashCode());
        System.out.println("Access Token Facebook: " + this.accessToken);
    }

    public void saveAccessLog() {
        System.out.println("Facebook access log saved for user: " + this.username + " at " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n");
    }
    
}
