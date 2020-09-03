package GOT;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Setting {


    public static MediaPlayer redwedding;

    public static Scene sett (Stage window){

        Image bg = new Image("file:Data/setting2.jpg");
        ImageView v1 = new ImageView(bg);
        v1.setFitWidth(1200);
        v1.setFitHeight(800);

        redwedding = new MediaPlayer(new Media(SingleGame.class.getResource("/music/Redwedding.mp3").toString()));
        redwedding.setCycleCount(MediaPlayer.INDEFINITE);
        redwedding.setAutoPlay(true);
        redwedding.setVolume(1);


        ImageView img = new ImageView(new Image("file:Data/setback.jpg"));
        img.setFitHeight(100);
        img.setFitWidth(150);
        img.setOnMouseEntered(e ->{
            img.setImage(new Image("file:Data/setback2.jpg"));
        });
        img.setOnMouseExited(e->{
            img.setImage(new Image("file:Data/setback.jpg"));
        });
        img.setTranslateX(100);
        img.setTranslateY(700);

        img.setOnMouseClicked(event -> {
            window.setScene(Mainmenu.menu(window));
            redwedding.stop();
        });


        HBox h = new HBox();
        h.getChildren().add(img);

        Group root = new Group();
        root.getChildren().addAll(v1,h);

        Scene scene=new Scene(root,1200,800);

        return scene;
    }
}

