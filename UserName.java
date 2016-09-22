

import java.util.Scanner;



public class UserName {

    Scanner scanner;

    public UserName() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        UserName app = new UserName();

        app.GetUsername(true);
    }

    public void GetUsername(boolean b) {

        if(!b) {
            System.out.println("The username you have entered was in an incorrect format");
        } else {
            System.out.println("Please enter a username:");
        }

        String userInput = this.scanner.nextLine();

        UserNameCheck usernameCheck = new UserNameCheck(userInput);

        if(usernameCheck.isValid()) {
            System.out.println("Welcome, " + userInput + "!");
        } else {
            GetUsername(false);
        }
    }

}