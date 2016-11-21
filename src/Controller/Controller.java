package Controller;

import View.MainMenuView;

/**
 * Created by biancajuul-hansen on 16/11/2016.
 */
public class Controller {
    private MainMenuView mainMenuView;

    public Controller(){
        this.mainMenuView = new MainMenuView(this);

    }
    public void showMainMenuView(){
        this.mainMenuView.mainMenu();
    }
    public MainMenuView getMainMenuView() {
        return mainMenuView;
    }
    //Hvorfor laver vi ikke setter??
}
