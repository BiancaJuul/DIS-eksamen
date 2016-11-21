package View;

import Controller.Controller;
import SDK.Connection.ResponseCallback;
import SDK.Models.AccessToken;
import SDK.Services.UserService;

import java.util.Scanner;


/**
 * Created by biancajuul-hansen on 16/11/2016.
 */
public class MainMenuView {

    //Login laves her
    private Controller controller;
    private UserService userService;
    private Scanner inputReader;

    public MainMenuView(Controller controller) {
        this.controller = controller;
        this.userService = new UserService();

    }

    public void mainMenu() {

        System.out.println("**--** Velkommen til Bookit **--**");
        System.out.println();
        System.out.println();
        System.out.println("Indtast 1 eller 2:");
        System.out.println("(1) - Login");
        System.out.println("(2) - Opret bruger");

        Scanner inputReader = new Scanner(System.in);
        int choice = inputReader.nextInt();

        switch (choice) {
            case 1:
                loginMenu();
                mainMenu();
                break;

            case 2:
                System.out.println("Opret ny bruger");
                mainMenu();
                break;


            default:
                System.out.println("Du skal indtaste 1 eller 2");
                mainMenu();
                break;
        }
    }


    private void loginMenu() {
        System.out.println("Indtast dit brugernavn og dit kodeord");
        System.out.println("Brugernavn: ");
        String username = new Scanner(System.in).nextLine();

        System.out.println("Kodeord: ");
        String password = new Scanner(System.in).nextLine();

        this.userService.login(username, password, new ResponseCallback<AccessToken>() {
            public void success(AccessToken data) {
                System.out.println("Du er nu logget ind");

            }

            public void error(int status) {
                System.out.println("Der er indstastet forkert brugernavn eller kodeord" + status);

            }
        });
    }

}


