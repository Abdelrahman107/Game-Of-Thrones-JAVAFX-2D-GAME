package GOT;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Mainmenu {

    public static MediaPlayer m,introo;

    public static ImageView introImages(String s1 , String s2){
        ImageView img = new ImageView(new Image(s1));
        img.setFitHeight(120);
        img.setFitWidth(300);
        img.setOnMouseEntered(e ->{
            img.setImage(new Image(s2));
        });
        img.setOnMouseExited(e->{
            img.setImage(new Image(s1));
        });
        return img;
    }

    public static MediaPlayer addMusic(String name){

        Media music = new Media(Main.class.getResource(name).toString());
        m = new MediaPlayer(music);
        m.setCycleCount(MediaPlayer.INDEFINITE);
        m.setAutoPlay(true);
        m.setVolume(1);

        return m;
    }

    public static Scene menu(Stage window)
    {
        Image backGround2 = new Image("file:Data/night-king-animation.gif");
        ImageView v2 = new ImageView(backGround2);
        v2.setFitWidth(800);
        v2.setFitHeight(600);
        v2.setX(400);
        v2.setY(100);

        Image backGround1 = new Image("file:Data/BG3.jpg");
        ImageView v1 = new ImageView(backGround1);
        v1.setFitWidth(1200);
        v1.setFitHeight(800);





        introo = addMusic("/music/introo.mp3");





        ImageView single = introImages("file:Data/01.jpg","file:Data/11.jpg");
        single.setOnMouseClicked(e->{
            //  Scene s2 = SinglePlayer.Player(window);
            window.setScene(SinglePlayer.Player(window));
            introo.stop();
        });

        ImageView multi = introImages("file:Data/2.jpg","file:Data/22.jpg");
        multi.setOnMouseClicked(e->{
            // Scene s3 = MultiPlayer.Multi(window);
            window.setScene(MultiPlayer.Multi(window));
            introo.stop();
        });

        ImageView credits = introImages("file:Data/3.jpg","file:Data/33.jpg");
        credits.setOnMouseClicked(e-> {
            // Scene s4 = Credit.Credit(window);

            window.setScene(Credit.Credit(window));
            introo.stop();
        });

        ImageView setting = introImages("file:Data/4.jpg","file:Data/44.jpg");
        setting.setOnMouseClicked(e->{
//            Scene s5 = Setting.sett(window);
//            window.setScene(s5);
//
            window.setScene(Setting.sett(window));
            introo.stop();
        });


        ImageView exit = introImages("file:Data/5.jpg","file:Data/55.jpg");
        exit.setOnMouseClicked(e->{
            window.close();
        });

        VBox p = new VBox();
        p.getChildren().addAll(single,multi,credits,setting,exit);
        p.setSpacing(10);
        p.setPadding(new Insets(70,10,10,50));


        Group q = new Group();
        q.getChildren().addAll(v1,v2,p);


        Scene s1 = new Scene(q,1200,800);
        return s1;
    }


}
