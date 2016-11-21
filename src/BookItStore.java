import Controller.Controller;
import SDK.Config;
import SDK.Services.BookService;
import com.google.gson.JsonObject;


/**
 * Created by biancajuul-hansen on 16/11/2016.
 */
public class BookItStore {

        private Controller controller;
        private static BookService bookService;

        public BookItStore() {
            this.controller = new Controller();
            bookService = new BookService();
        }

        public static void main(String[] args) {
       //     new BookItStore().run();

            JsonObject jsonObject = new Config().initConfig();
            System.out.println(jsonObject.get("DbUrl"));
        }

        public void run() {

            while (true) {
                this.controller.showMainMenuView();
            }


    }
}
