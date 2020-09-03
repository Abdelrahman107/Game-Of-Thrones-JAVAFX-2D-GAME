package GOT;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage)  {

        Scene s = Mainmenu.menu(primaryStage);
        primaryStage.setScene(s);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Game Of Thrones");
        primaryStage.show();

    }
    public static void main(String[] args) {
        // write your code here
        launch(args);
    }
}
