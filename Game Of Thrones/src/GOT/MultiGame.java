package GOT;


import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MultiGame {

    public static KeyManager km = new KeyManager();
    public static Group jon,KN,ice1,fire1;
    public static Pane h;
    static int player1Life=200;
    static int  player2Life2 = 200;
    static ImageView im2,im3,im4,im5,im6,im7,im8,im9,im10,im11,myhealthbar1,myhealthbar2,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,ice,fire;
    static MediaPlayer lightoftheseven,dragonmusic;
    public static ImageView next,jon0,jon1,jon2,jon3,jon4,KN0,KN1,KN2,KN3,KN4;
    public static  Timeline t;

    public static void move()
    {
        if(km.getkeystate(KeyCode.W))
        {
            jon.setTranslateY(jon.getTranslateY() - 20);
            if(jon.getTranslateY() <= 70){jon.setTranslateY(70); }
        }
        if(km.getkeystate(KeyCode.S))
        {
            jon.setTranslateY(jon.getTranslateY() + 20);
            if(jon.getTranslateY() >= 650){ jon.setTranslateY(650); }
        }


        if(km.getkeystate(KeyCode.UP))
        {
            KN.setTranslateY(KN.getTranslateY() - 20);
            if(KN.getTranslateY() <= 70){KN.setTranslateY(70); }
        }
        if(km.getkeystate(KeyCode.DOWN))
        {
            KN.setTranslateY(KN.getTranslateY() + 20);
            if(KN.getTranslateY() >= 650){ KN.setTranslateY(650); }
        }
    }
    public static void shootPlayer1(String s1)
    {
        if (player1Life<=0 || player2Life2<=0){
            h.getChildren().remove(fire1);
            h.getChildren().remove(ice1);

        }
        else
        {

            fire = new ImageView(s1);
            fire1 = new Group(fire);
            fire.setFitHeight(40);
            fire.setFitWidth(100);
            fire1.setTranslateX((int)jon.getTranslateX() + 360);
            fire1.setTranslateY((int) jon.getTranslateY() + 170);
            h.getChildren().add(fire1);

            PathTransition tt = new PathTransition(Duration.millis(500), new Line(fire1.getTranslateX(), fire1.getTranslateY(),
                    1300, fire1.getTranslateY()),fire1);
            tt.setCycleCount(1);
            tt.play();



            if (tt.getPath().getBoundsInParent().intersects(KN.getBoundsInParent()))
            {
                SingleGame.fadeimg(fire1);
                player2Life2--;
                switch(player2Life2)
                {
                    case 190:
                        h.getChildren().remove(i2);
                        h.getChildren().add(i3);
                        break;
                    case 170:
                        h.getChildren().remove(i3);
                        h.getChildren().add(i4);
                        break;
                    case 145:
                        h.getChildren().remove(i4);
                        h.getChildren().add(i5);
                        break;
                    case 120:
                        h.getChildren().remove(i5);
                        h.getChildren().add(i6);
                        break;
                    case 100:
                        h.getChildren().remove(i6);
                        h.getChildren().add(i7);
                        break;
                    case 70:
                        h.getChildren().remove(i7);
                        h.getChildren().add(i8);
                        break;
                    case 45:
                        h.getChildren().remove(i8);
                        h.getChildren().add(i9);
                        break;
                    case 20:
                        h.getChildren().remove(i9);
                        h.getChildren().add(i10);
                        break;
                    case 0:
                        h.getChildren().remove(i10);
                        h.getChildren().add(i11);
                        break;
                }

                if(player2Life2<=0)
                {
                    h.getChildren().remove(KN);
                    h.getChildren().add(next);
                    ImageView win = new ImageView(new Image("file:Data/player1win.png"));
                    win.setTranslateX(300);
                    win.setTranslateY(200);
                    h.getChildren().add(win);

                }
            }
        }
    }

    public static void shootPlayer2(String s2)
    {
        if (player1Life<=0 || player2Life2<=0){
            h.getChildren().remove(fire1);
            h.getChildren().remove(ice1);

        }
        else
        {
            ice = new ImageView(s2);
            ice1 = new Group(ice);
            ice.setFitHeight(50);
            ice.setFitWidth(100);

            ice1.setTranslateX((int) KN.getTranslateX() - 70);
            ice1.setTranslateY((int) KN.getTranslateY() + 170);
            h.getChildren().add(ice1);

            PathTransition ttt = new PathTransition(Duration.millis(500), new Line(ice1.getTranslateX(), ice1.getTranslateY(), -100,
                    ice1.getTranslateY()),ice1);
            ttt.setCycleCount(1);
            ttt.play();




            if (ttt.getPath().getBoundsInParent().intersects(jon.getBoundsInParent()))
            {
                SingleGame.fadeimg(ice1);
                player1Life--;
                switch(player1Life)
                {
                    case 190:
                        h.getChildren().remove(im2);
                        h.getChildren().add(im3);
                        break;
                    case 170:
                        h.getChildren().remove(im3);
                        h.getChildren().add(im4);
                        break;
                    case 145:
                        h.getChildren().remove(im4);
                        h.getChildren().add(im5);
                        break;
                    case 120:
                        h.getChildren().remove(im5);
                        h.getChildren().add(im6);
                        break;
                    case 100:
                        h.getChildren().remove(im6);
                        h.getChildren().add(im7);
                        break;
                    case 70:
                        h.getChildren().remove(im7);
                        h.getChildren().add(im8);
                        break;
                    case 45:
                        h.getChildren().remove(im8);
                        h.getChildren().add(im9);
                        break;
                    case 20:
                        h.getChildren().remove(im9);
                        h.getChildren().add(im10);
                        break;
                    case 0:
                        h.getChildren().remove(im10);
                        h.getChildren().add(im11);
                        break;
                }

                if(player1Life<=0)
                {
                    h.getChildren().remove(jon);
                    h.getChildren().add(next);

                    ImageView win = new ImageView(new Image("file:Data/player2win.png"));
                    win.setTranslateX(300);
                    win.setTranslateY(200);
                    h.getChildren().add(win);

                }
            }
        }
    }

    public static ImageView PlayerhealthBar(String s){
        Image health1 = new Image(s);
        myhealthbar1 = new ImageView(health1);
        myhealthbar1.setFitWidth(400);
        myhealthbar1.setFitHeight(100);
        return myhealthbar1;
    }

    public static ImageView Player2healthBar(String ss){
        Image h1 = new Image(ss);
        myhealthbar2 = new ImageView(h1);
        myhealthbar2.setFitWidth(400);
        myhealthbar2.setFitHeight(100);
        myhealthbar2.setX(800);
        return myhealthbar2;
    }

    public static Scene MultiPlayer(Stage window, String bg, String p11, String p12, String p13, String p14, String p15,
                                    String p21, String p22, String p23, String p24, String p25,
                                    String p1h1, String p1h2, String p1h3, String p1h4, String p1h5,
                                    String p1h6, String p1h7, String p1h8, String p1h9, String p1h10,
                                    String p2h1, String p2h2, String p2h3, String p2h4, String p2h5,
                                    String p2h6, String p2h7, String p2h8, String p2h9, String p2h10,
                                    String p1shoot, String p2shoot
    )
    {
        h = new Pane();
        ImageView wallBG = new ImageView(bg);
        wallBG.setFitWidth(1200);
        wallBG.setFitHeight(900);
        h.getChildren().add(wallBG);
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
            player1Life = 200;
            player2Life2 = 200;
            lightoftheseven.stop();
            dragonmusic.stop();
            t.pause();
            window.setScene(Mainmenu.menu(window));
        });


        jon0 = new ImageView(p11);
        jon1 = new ImageView(p12);
        jon2 = new ImageView(p13);
        jon3 = new ImageView(p14);
        jon4 = new ImageView(p15);




        KN0 = new ImageView(p21);
        KN1 = new ImageView(p22);
        KN2 = new ImageView(p23);
        KN3 = new ImageView(p24);
        KN4 = new ImageView(p25);



        im2 = PlayerhealthBar(p1h1);
        h.getChildren().add(im2);
        im3 = PlayerhealthBar(p1h2);
        im4 = PlayerhealthBar(p1h3);
        im5 = PlayerhealthBar(p1h4);
        im6 = PlayerhealthBar(p1h5);
        im7 = PlayerhealthBar(p1h6);
        im8 = PlayerhealthBar(p1h7);
        im9 = PlayerhealthBar(p1h8);
        im10 = PlayerhealthBar(p1h9);
        im11= PlayerhealthBar(p1h10);


        i2 = Player2healthBar(p2h1);
        h.getChildren().add(i2);
        i3 = Player2healthBar(p2h2);
        i4 = Player2healthBar(p2h3);
        i5 = Player2healthBar(p2h4);
        i6 = Player2healthBar(p2h5);
        i7 = Player2healthBar(p2h6);
        i8 = Player2healthBar(p2h7);
        i9 = Player2healthBar(p2h8);
        i10 = Player2healthBar(p2h9);
        i11= Player2healthBar(p2h10);



        lightoftheseven = new MediaPlayer(new Media(MultiGame.class.getResource("/music/light.mp3").toString()));
        lightoftheseven.setCycleCount(MediaPlayer.INDEFINITE);
        lightoftheseven.setVolume(1);
        lightoftheseven.setAutoPlay(true);

        dragonmusic = new MediaPlayer(new Media(MultiGame.class.getResource("/music/dragonSound.mp3").toString()));
        dragonmusic.setCycleCount(MediaPlayer.INDEFINITE);
        dragonmusic.setAutoPlay(true);
        dragonmusic.setVolume(0.15);


        jon = new Group(jon0);
        jon.setTranslateX(0);
        jon.setTranslateY(200);

        t= new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);


        t.getKeyFrames().add(new KeyFrame(Duration.millis(100),(event) -> {
            jon.getChildren().setAll(jon1);
        }));


        t.getKeyFrames().add(new KeyFrame(Duration.millis(200),(event) -> {
            jon.getChildren().setAll(jon2);
        }));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(300),(event) -> {
            jon.getChildren().setAll(jon3);
        }));


        t.getKeyFrames().add(new KeyFrame(Duration.millis(400),(event) -> {
            jon.getChildren().setAll(jon4);
        }));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(500),(event) -> {
            jon.getChildren().setAll(jon3);
        }));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(600),(event) -> {
            jon.getChildren().setAll(jon2);
        }));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(700),(event) -> {
            jon.getChildren().setAll(jon1);
        }));

        KN = new Group(KN0);
        KN.setTranslateX(850);
        KN.setTranslateY(200);

        t.getKeyFrames().add(new KeyFrame(Duration.millis(100),(event) -> {
            KN.getChildren().setAll(KN1);
        }));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(200),(event) -> {
            KN.getChildren().setAll(KN2);
        }));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(300),(event) -> {
            KN.getChildren().setAll(KN3);
        }));


        t.getKeyFrames().add(new KeyFrame(Duration.millis(400),(event) -> {
            KN.getChildren().setAll(KN4);
        }));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(500),(event) -> {
            KN.getChildren().setAll(KN3);
        }));


        t.getKeyFrames().add(new KeyFrame(Duration.millis(600),(event) -> {
            KN.getChildren().setAll(KN2);
        }));

        t.getKeyFrames().add(new KeyFrame(Duration.millis(700),(event) -> {
            KN.getChildren().setAll(KN1);
        }));


        t.play();

        h.setOnKeyPressed(e1 -> {


            km.setState(e1.getCode(), true);
            move();
            if (km.getkeystate(KeyCode.SPACE))
                shootPlayer1(p1shoot);
            if (km.getkeystate(KeyCode.ENTER))
                shootPlayer2(p2shoot);
        });

        h.setOnKeyReleased(e2 -> {

            km.setState(e2.getCode(), false);
        });

        h.getChildren().addAll(jon,KN);
        Scene multiscene = new Scene(h,1185,885);
        h.requestFocus();

        return multiscene;
    }

}

