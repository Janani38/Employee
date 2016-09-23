


public class UserNameCheck {

    String username;

    public UserNameCheck(String username) {
        this.username = username;
    }

    public boolean isValid() {
        return this.username.matches("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{3}");
    }
}