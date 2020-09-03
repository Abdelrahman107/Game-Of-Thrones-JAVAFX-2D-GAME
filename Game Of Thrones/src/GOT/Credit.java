package GOT;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Credit {

    public static MediaPlayer creditMusic;

    public static Scene Credit(Stage PrimaryStage)
    {


        creditMusic = new MediaPlayer(new Media(SingleGame.class.getResource("/music/musicCredit.mp3").toString()));
        creditMusic.setCycleCount(MediaPlayer.INDEFINITE);
        creditMusic.setAutoPlay(true);
        creditMusic.setVolume(1);


        Image image2 = new Image("file:Data/cr2.jpg");
        Image image3 = new Image("file:Data/cr3.jpg");
        ImageView imageView = new ImageView();

        imageView.setFitWidth(1200);
        imageView.setFitHeight(800);

        Timeline timeline = new Timeline(


                new KeyFrame(Duration.ZERO, new KeyValue(imageView.imageProperty(), image2)),
                new KeyFrame(Duration.seconds(5), new KeyValue(imageView.imageProperty(), image3))
        );
        timeline.play();

        ImageView back = new ImageView("file:Data/h1.jpg");
        back.setFitHeight(100);
        back.setFitWidth(150);
        back.setX(80);
        back.setY(650);
        back.setOnMouseEntered(e ->{
            back.setImage(new Image("file:Data/creditback.jpg"));
        });
        back.setOnMouseExited(e->{
            back.setImage(new Image("file:Data/h1.jpg"));
        });

        back.setOnMouseClicked(e->{
            PrimaryStage.setScene(Mainmenu.menu(PrimaryStage));
            creditMusic.stop();
        });




        Group root = new Group();
        root.getChildren().addAll(imageView,back);
        Scene s = new Scene(root,1200,800);

        return s;







    }



}
