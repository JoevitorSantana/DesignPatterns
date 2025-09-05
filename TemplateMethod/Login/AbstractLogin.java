package TemplateMethod.Login;

public abstract class AbstractLogin {
    String username;
    String password;
    String accessToken;

    public final void login(String username, String password) {
        if (authenticate(username, password)) {
            generateAccessToken();
            saveAccessLog();
        }
    }

    abstract boolean authenticate(String username, String password);

    abstract void generateAccessToken();

    abstract void saveAccessLog();
}
