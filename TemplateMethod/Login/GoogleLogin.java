package TemplateMethod.Login;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GoogleLogin extends AbstractLogin
{
    public GoogleLogin() { }

    public boolean authenticate(String username, String password) {
        if (password.equals("google123")) {
            System.out.println("Google login successful!");
            this.username = username;
            this.password = password;
            return true;
        } else {
            System.out.println("Google login failed!");
            return false;
        }
    }

    public void generateAccessToken() {
        // generate a hash token
        this.accessToken = Integer.toHexString(username.hashCode() + password.hashCode());
        System.out.println("Access Token Google: " + this.accessToken);
    }

    public void saveAccessLog() {
        System.out.println("Google access log saved for user: " + this.username + " at " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + "\n");
    }
}
