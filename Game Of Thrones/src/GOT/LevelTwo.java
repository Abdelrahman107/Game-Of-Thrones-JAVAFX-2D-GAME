package GOT;


import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;

public class LevelTwo {
    private static Group dragon1, dragon2;
    public static Group h = new Group();
    public static int playerLife=100;
    public static int comLife=150;
    public static Timeline t,t2,t3;
    public static MediaPlayer dragonsound,nkk;
    public static ImageView v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,
            n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,H,C,next,jon0,jon1,jon2,jon3,jon4;


    public static ImageView Images(String s1) {
        ImageView img = new ImageView(new Image(s1));
        img.setFitHeight(250);
        img.setFitWidth(380);
        return img;
    }
    public static void shoot(){

        ImageView fire = new ImageView(new Image("file:Data/fire.png"));
        Group fire1 = new Group();
        fire1.getChildren().add(fire);

        fire.setFitHeight(40);
        fire.setFitWidth(100);
        fire1.setTranslateX((int) dragon1.getTranslateX() + 360);
        fire1.setTranslateY((int) dragon1.getTranslateY() + 170);
        h.getChildren().add(fire1);

        PathTransition tt= new PathTransition(Duration.millis(500),
                new Line(fire1.getTranslateX(),fire1.getTranslateY(),1300,fire1.getTranslateY()),fire1);
        tt.setCycleCount(1);
        tt.play();

        if(tt.getPath().getBoundsInParent().intersects(dragon2.getBoundsInParent())){
            SingleGame.fadeimg(fire1);
            comLife =comLife -1;
            switch (comLife){
                case 140: h.getChildren().remove(n1);
                    h.getChildren().add(n2);
                    break;
                case 125: h.getChildren().remove(n2);
                    h.getChildren().add(n3);
                    break;
                case 110:h.getChildren().remove(n3);
                    h.getChildren().add(n4);
                    break;
                case 90:h.getChildren().remove(n4);
                    h.getChildren().add(n5);
                    break;
                case 70:h.getChildren().remove(n5);
                    h.getChildren().add(n6);
                    break;
                case 50:h.getChildren().remove(n6);
                    h.getChildren().add(n7);
                    break;
                case 30:h.getChildren().remove(n7);
                    h.getChildren().add(n8);
                    break;
                case 20:h.getChildren().remove(n8);
                    h.getChildren().add(n9);
                    break;
                case 0:h.getChildren().remove(n9);
                    h.getChildren().add(n10);
                    break; }
        }
        if(comLife<=0){
            t2.stop();
            t3.stop();
            h.getChildren().remove(dragon2);
            ImageView win = new ImageView(new Image("file:Data/www.png"));
            win.setTranslateX(200);
            win.setTranslateY(200);
            h.getChildren().add(win);

            h.getChildren().add(next);
            dragon1.setOnKeyPressed(e->{
                switch (e.getCode()) {
                    case D:
                        dragon1.setTranslateX(dragon1.getTranslateX() + 15);
                        if(dragon1.getTranslateX() >= 820){
                            dragon1.setTranslateX(820); }
                        break;
                    case A:
                        dragon1.setTranslateX(dragon1.getTranslateX() - 15);
                        if(dragon1.getTranslateX() <= 0){
                            dragon1.setTranslateX(0); }
                        break;
                    case W:
                        dragon1.setTranslateY(dragon1.getTranslateY() - 20);
                        if(dragon1.getTranslateY() <= 70){
                            dragon1.setTranslateY(70); }
                        break;
                    case S:
                        dragon1.setTranslateY(dragon1.getTranslateY() + 20);
                        if(dragon1.getTranslateY() >= 650){
                            dragon1.setTranslateY(650); }
                        break; } });}
    }
    public static void comShoot(){

        ImageView ice = new ImageView(new Image("file:Data/ice.png"));
        Group ice1 = new Group(ice);
        ice.setFitHeight(50);
        ice.setFitWidth(100);
        ice1.setTranslateX((int) dragon2.getTranslateX() - 70);
        ice1.setTranslateY((int) dragon2.getTranslateY() + 170);
        h.getChildren().add(ice1);

        PathTransition ttt= new PathTransition(Duration.millis(500),
                new Line(ice1.getTranslateX(),ice1.getTranslateY(),-100 ,ice1.getTranslateY()),ice1);
        ttt.setCycleCount(1);
        ttt.play();
        if(ttt.getPath().getBoundsInParent().intersects(dragon1.getBoundsInParent()))
        {
            SingleGame.fadeimg(ice1);
            playerLife =playerLife -2;
            switch (playerLife){
                case 90: h.getChildren().remove(v2);
                    h.getChildren().add(v3);
                    break;
                case 80: h.getChildren().remove(v3);
                    h.getChildren().add(v4);
                    break;
                case 70:h.getChildren().remove(v4);
                    h.getChildren().add(v5);
                    break;
                case 60:h.getChildren().remove(v5);
                    h.getChildren().add(v6);
                    break;
                case 50:h.getChildren().remove(v6);
                    h.getChildren().add(v7);
                    break;
                case 40:h.getChildren().remove(v7);
                    h.getChildren().add(v8);
                    break;
                case 30:h.getChildren().remove(v8);
                    h.getChildren().add(v9);
                    break;
                case 20:h.getChildren().remove(v9);
                    h.getChildren().add(v10);
                    break;
                case 0:h.getChildren().remove(v10);
                    h.getChildren().add(v11);
                    break; }
        }
        if(playerLife<=0){
            t2.stop();
            t3.stop();
            h.getChildren().remove(dragon1);
            h.getChildren().add(next);

            ImageView lose = new ImageView(new Image("file:Data/lll.png"));
            lose.setTranslateX(200);
            lose.setTranslateY(200);
            h.getChildren().add(lose);

        }
    }
    public static ImageView PlayerhealthBar(String s){
        Image health1 = new Image(s);
        H = new ImageView(health1);
        H.setFitWidth(400);
        H.setFitHeight(100);
        return H;
    }
    public static ImageView comhealthBar(String ss){
        Image h1 = new Image(ss);
        C = new ImageView(h1);
        C.setFitWidth(400);
        C.setFitHeight(100);
        C.setX(800);
        return C;
    }
    public static Scene Singleplayer (Stage window , String s1, String s2, String s3, String s4, String s5, String bg1,String bg2, String p1h1, String p1h2, String p1h3, String p1h4, String p1h5,
                                      String p1h6, String p1h7, String p1h8, String p1h9, String p1h10) {


       /* if(playerLife<=0 || comLife<=0){
            Button b = new Button("Back to main menu");
            b.setLayoutX(400);
            b.setOnAction(e->{
                window.setScene(Main.s1);
            });
        }*/
        next = new ImageView(new Image("file:Data/nextLevel3.png"));
        next.setOnMouseEntered(e->{
            next.setImage(new Image("file:Data/nextLevel4.png"));
        });
        next.setOnMouseExited(e->{
            next.setImage(new Image("file:Data/nextLevel3.png"));
        });
        next.setLayoutX(400);
        next.setLayoutY(400);
        next.setOnMouseClicked(e->{
            comLife=150;
            playerLife=100;
            dragonsound.stop();
            nkk.stop();
            h.getChildren().remove(dragon1);
            t.pause();
            SingleGame.t.pause();
            SingleGame.walker.pause();
            SingleGame.mobs.pause();
            window.setScene(Mainmenu.menu(window));
        });
        Image backGround1 = new Image(bg2);
        ImageView v1 = new ImageView(backGround1);
        v1.setFitWidth(1200);
        v1.setFitHeight(900);
        h.getChildren().add(v1);

        v2 = PlayerhealthBar(p1h1);
        h.getChildren().add(v2);
        v3 = PlayerhealthBar(p1h2);
        v4 =  PlayerhealthBar(p1h3);
        v5 =  PlayerhealthBar(p1h4);
        v6 =  PlayerhealthBar(p1h5);
        v7 =  PlayerhealthBar(p1h6);
        v8 =  PlayerhealthBar(p1h7);
        v9 =  PlayerhealthBar(p1h8);
        v10 =  PlayerhealthBar(p1h9);
        v11 = PlayerhealthBar(p1h10);

        n1 = comhealthBar("file:Data/NKblood1.png");
        h.getChildren().add(n1);
        n2 =comhealthBar("file:Data/NKblood2.png");
        n3 = comhealthBar("file:Data/NKblood3.png");
        n4 = comhealthBar("file:Data/NKblood4.png");
        n5 = comhealthBar("file:Data/NKblood5.png");
        n6 = comhealthBar("file:Data/NKblood6.png");
        n7 = comhealthBar("file:Data/NKblood7.png");
        n8 = comhealthBar("file:Data/NKblood8.png");
        n9 = comhealthBar("file:Data/NKblood9.png");
        n10 = comhealthBar("file:Data/NKblood10.png");

        dragonsound = new MediaPlayer(new Media(LevelTwo.class.getResource("/music/dragonSound.mp3").toString()));
        dragonsound.setCycleCount(MediaPlayer.INDEFINITE);
        dragonsound.setAutoPlay(true);
        dragonsound.setVolume(0.15);
        nkk = new MediaPlayer(new Media(LevelTwo.class.getResource("/music/nkk.mp3").toString()));
        nkk.setCycleCount(MediaPlayer.INDEFINITE);
        nkk.setAutoPlay(true);
        nkk.setVolume(0.85);

        jon0 = Images(s1);
        jon1 = Images(s2);
        jon2 = Images(s3);
        jon3 = Images(s4);
        jon4 = Images(s5);
        ImageView KN0 = Images("file:Data/KN0.png");
        ImageView KN1 = Images("file:Data/KN1.png");
        ImageView KN2 = Images("file:Data/KN2.png");
        ImageView KN3 = Images("file:Data/KN3.png");
        ImageView KN4 = Images("file:Data/KN4.png");
        dragon1 = new Group(jon0);
        dragon2 = new Group(KN0);
        dragon1.setTranslateX(0);
        dragon1.setTranslateY(500);
        dragon2.setTranslateX(850);
        dragon2.setTranslateY(250);

        t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(Duration.millis(100),
                event -> dragon1.getChildren().setAll(jon1)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(200),
                event -> dragon1.getChildren().setAll(jon2)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(300),
                event -> dragon1.getChildren().setAll(jon3)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(400),
                event -> dragon1.getChildren().setAll(jon4)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(500),
                event -> dragon1.getChildren().setAll(jon3)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(600),
                event -> dragon1.getChildren().setAll(jon2)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(700),
                event -> dragon1.getChildren().setAll(jon1)));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(100),
                event -> dragon2.getChildren().setAll(KN1)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(200),
                event -> dragon2.getChildren().setAll(KN2)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(300),
                event -> dragon2.getChildren().setAll(KN3)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(400),
                event -> dragon2.getChildren().setAll(KN4)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(500),
                event -> dragon2.getChildren().setAll(KN3)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(600),
                event -> dragon2.getChildren().setAll(KN2)));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(700),
                event -> dragon2.getChildren().setAll(KN1)));
        t.play();
        EventHandler<ActionEvent> d2 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < 100; i++) {      // till dragon is life
                    double dy = -15 + Math.random() * 30;
                    dragon2.setTranslateY(dragon2.getTranslateY() + dy);
                    if(dragon2.getTranslateY() >= 650){ dragon2.setTranslateY(650); }
                    if(dragon2.getTranslateY() <= 70){ dragon2.setTranslateY(70); }
                } }};
        t2 = new Timeline(new KeyFrame(Duration.millis(150), d2));
        t2.setCycleCount(Animation.INDEFINITE);
        t2.play();
        EventHandler<ActionEvent> d3 = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                comShoot();
            }};
        t3= new Timeline(new KeyFrame(Duration.seconds(0.3),d3));
        t3.setCycleCount(Animation.INDEFINITE);
        t3.play();
        dragon1.setOnKeyPressed(e1 -> {
            switch (e1.getCode()) {
                case W:
                    dragon1.setTranslateY(dragon1.getTranslateY() - 20);
                    if(dragon1.getTranslateY() <= 70){ dragon1.setTranslateY(70); }
                    break;
                case S:
                    dragon1.setTranslateY(dragon1.getTranslateY() + 20);
                    if(dragon1.getTranslateY() >= 650){ dragon1.setTranslateY(650); }
                    break;
                case SPACE:
                    shoot();
                    break; } });
        h.getChildren().addAll(dragon1, dragon2);
        Pane x = new Pane(h);
        Scene s = new Scene(x,1185,885);
        dragon1.requestFocus();
        return s;
    }
}

