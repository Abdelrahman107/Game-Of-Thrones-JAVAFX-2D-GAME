package GOT;


import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

public class SingleGame {

    public static Group scene1 = new Group();
    public static Group player,fire1;
    public static MediaPlayer level,dragonmusic;
    public static PathTransition tt2;
    public static ImageView fire,p0,p1,p2,p3,p4;
    public static Label counter  = new Label("WAVE 1");
    public static Label notice = new Label("FIGHT THE DEAD ARMY UNTIL THE NIGHT KING ARRIVES! \n CONTROLS : A  D , SPACE : SHOOT");
    public static double countk=1;
    public static Timeline t,walker, mobs;
    public static ArrayList<wight> wights = new ArrayList<wight>(10);
    public static  ArrayList<walker> walkers = new ArrayList<walker>(2);

    public static void fade(Group group)
    {
        Timeline fade = new Timeline();
        fade.setCycleCount(1);
        fade.getKeyFrames().add(new KeyFrame(Duration.millis(300),
                event ->
                {
                    FadeTransition ft = new FadeTransition(Duration.millis(300),group);
                    ft.setFromValue(1.0);
                    ft.setToValue(0.0);
                    ft.play();
                }));
        fade.getKeyFrames().add(new KeyFrame(Duration.millis(450),
                event ->
                {
                    scene1.getChildren().remove(group);
                    scene1.getChildren().remove(fire);
                }));
        fade.play();
    }
    public static void fadeimg(Group img)
    {
        Timeline fade = new Timeline();
        fade.setCycleCount(1);
        fade.getKeyFrames().add(new KeyFrame(Duration.millis(300),
                event ->
                {
                    FadeTransition ft = new FadeTransition(Duration.millis(1),img);
                    ft.setFromValue(1.0);
                    ft.setToValue(0.0);
                    ft.play();
                }));
        fade.getKeyFrames().add(new KeyFrame(Duration.millis(450),
                event ->
                {
                    scene1.getChildren().remove(img);
                    scene1.getChildren().remove(fire);
                }));
        fade.play();
    }
    public static void shoot()
    {
        fire = new ImageView(new Image("file:Data/fire.png"));
        fire.setFitHeight(40);
        fire.setFitWidth(100);
        fire.setTranslateX((int) player.getTranslateX()+350);
        fire.setTranslateY((int) player.getTranslateY()+180);
        fire.setRotate(90);
        fire1 = new Group(fire);
        scene1.getChildren().add(fire1);
        tt2= new PathTransition(Duration.millis(500),
                new Line(fire.getTranslateX(),fire.getTranslateY(),fire.getTranslateX(),fire.getTranslateY()+650),fire);
        tt2.setCycleCount(1);
        tt2.play();
        for(wight w:wights)
        {
            if(tt2.getPath().getBoundsInParent().intersects(w.getBoundsInParent()))
            {
                fade(w);
                fadeimg(fire1);
            }
        }
        for(walker w:walkers)
        {
            if(tt2.getPath().getBoundsInParent().intersects(w.getBoundsInParent()))
            {
                fade(w);
                fadeimg(fire1);
            }
        }
        Timeline remove = new Timeline();
        remove.setCycleCount(1);
        remove.getKeyFrames().add(new KeyFrame(Duration.millis(500),
                event ->
                {
                    fadeimg(fire1);
                }));
        remove.play();
    }
    public static Scene level1(Stage window , String s1, String s2, String s3, String s4, String s5, String bg1,String bg2,
                               String p1h1, String p1h2, String p1h3, String p1h4, String p1h5,
                               String p1h6, String p1h7, String p1h8, String p1h9, String p1h10)
    {
        scene1.getChildren().removeAll(player,counter,notice);
        Pane P = new Pane(scene1);
        P.setPrefHeight(800);
        P.setPrefWidth(1200);
        Scene level1 = new Scene(P);
        Image bg = new Image(bg1);
        ImageView background = new ImageView(bg);

        counter.setFont(Font.font("Cambria", 32));
        counter.setTextFill(Color.WHITE);
        notice.setFont(Font.font("Cambria", 28));
        notice.setTextFill(Color.WHITE);
        notice.setTranslateX(200);
        notice.setTranslateY(0);

        level = new MediaPlayer(new Media(SingleGame.class.getResource("/music/levelmusic.mp3").toString()));
        level.setCycleCount(MediaPlayer.INDEFINITE);
        level.setAutoPlay(true);
        level.setVolume(1);

        dragonmusic = new MediaPlayer(new Media(SingleGame.class.getResource("/music/dragonSound.mp3").toString()));
        dragonmusic.setCycleCount(MediaPlayer.INDEFINITE);
        dragonmusic.setAutoPlay(true);
        dragonmusic.setVolume(0.15);

        p0 = new ImageView(new Image(s1));
        p1 = new ImageView(new Image(s2));
        p2 = new ImageView(new Image(s3));
        p3 = new ImageView(new Image(s4));
        p4 = new ImageView(new Image(s5));

        player =  new Group(p0);
        player.setTranslateX(100);
        player.setTranslateY(100);


        player.setOnKeyPressed(e->
        {
            switch(e.getCode())
            {
                case D:
                    player.setTranslateX(player.getTranslateX() + 15);
                    if(player.getTranslateX() >= 850){ player.setTranslateX(850); }
                    break;
                case A:
                    player.setTranslateX(player.getTranslateX() - 15);
                    if(player.getTranslateX() <= 0){ player.setTranslateX(0); }
                    break;
                case SPACE:
                    shoot();



                    break;

            }
        });

         walker = new Timeline();
        walker.setCycleCount(Timeline.INDEFINITE);
        walker.getKeyFrames().add(new KeyFrame(Duration.millis(0),
                event ->
                {
                    walkers.add(new walker(scene1));
                }));

        walker.getKeyFrames().add(new KeyFrame(Duration.millis(10000),
                event ->
                {
                    walkers.add(new walker(scene1));
                }));
        walker.play();

         mobs = new Timeline();
        mobs.setCycleCount(Timeline.INDEFINITE);

        mobs.getKeyFrames().add(new KeyFrame(Duration.millis(0),
                event ->
                {
                    wights.add(new wight(scene1));

                }));
        mobs.getKeyFrames().add(new KeyFrame(Duration.millis(1000),
                event ->
                {
                    wights.add(new wight(scene1));
                    countk++;
                    if(countk >=20 )
                    {
                        counter.setText("WAVE 2");
                    }
                    if(countk >=30)
                    {
                        counter.setText("WAVE 3");
                    }
                }));
        mobs.getKeyFrames().add(new KeyFrame(Duration.millis(2000),
                event ->
                {

                }));
        mobs.play();



        t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(Duration.millis(100),
                event ->
                {
                    player.getChildren().setAll(p0);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(200),
                event ->
                {
                    player.getChildren().setAll(p1);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(300),
                event ->
                {
                    player.getChildren().setAll(p2);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(400),
                event ->
                {
                    player.getChildren().setAll(p3);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(500),
                event ->
                {
                    player.getChildren().setAll(p4);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(600),
                event ->
                {
                    player.getChildren().setAll(p3);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(700),
                event ->
                {
                    player.getChildren().setAll(p2);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(800),
                event ->
                {
                    player.getChildren().setAll(p1);
                }));


        t.play();
        scene1.getChildren().addAll(background,player,counter,notice);
        player.requestFocus();

        Timeline end = new Timeline();
        end.setCycleCount(1);
        end.getKeyFrames().add(new KeyFrame(Duration.millis(2000),
                event ->
                {
                    scene1.getChildren().remove(notice);
                }));
        end.getKeyFrames().add(new KeyFrame(Duration.millis(70000),
                event ->
                {
                    wights.clear();
                    walkers.clear();

                    ImageView never = new ImageView(new Image("file:Data/never.png"));
                    never.setTranslateX(500);

                    ImageView next = new ImageView(new Image("file:Data/nextLevel.png"));
                    next.setOnMouseEntered(e->{
                        next.setImage(new Image("file:Data/nextLevel2.png"));
                    });
                    next.setOnMouseExited(e->{
                        next.setImage(new Image("file:Data/nextLevel.png"));
                    });
                    next.setLayoutX(600);
                    next.setLayoutY(200);
                    scene1.getChildren().addAll(next,never);
                    next.setOnMouseClicked(e->{
                        level.stop();
                        dragonmusic.stop();
                        window.setScene(LevelTwo.Singleplayer(window,s1,s2,s3,s4,s5,bg1,bg2,p1h1,p1h2,
                                p1h3,p1h4,p1h5,p1h6,p1h7,p1h8,p1h9,p1h10));

                    });
                }));
        end.play();
        return level1;
    }
}
