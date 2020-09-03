package GOT;


import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class SinglePlayer{

    public static MediaPlayer myWatch;


    public  static RadioButton radio(String name,double x,double y){
        RadioButton r = new RadioButton(name);
        r.setLayoutX(x);
        r.setLayoutY(y);
        r.setPrefSize(100,100);

        return r;
    }


    public static ImageView buttonImages(String s1 , String s2){
        ImageView img = new ImageView(new Image(s1));
        img.setFitHeight(100);
        img.setFitWidth(150);
        img.setOnMouseEntered(e ->{
            img.setImage(new Image(s2));
        });
        img.setOnMouseExited(e->{
            img.setImage(new Image(s1));
        });
        return img;
    }


    public static Scene Player(Stage window) {
        window.setScene(null);

        Image spbg = new Image("file:Data/singleBG.jpg");
        ImageView v1 = new ImageView(spbg);
        v1.setFitWidth(1200);
        v1.setFitHeight(800);



        myWatch = new MediaPlayer(new Media(SingleGame.class.getResource("/music/myWatch.mp3").toString()));
        myWatch.setCycleCount(MediaPlayer.INDEFINITE);
        myWatch.setAutoPlay(true);
        myWatch.setVolume(1);

        ToggleGroup answer1,answer2;    // make one choice of radio button


        answer1 = new ToggleGroup();
        answer2 = new ToggleGroup();

        RadioButton jon = radio(" ",70,150);
        jon.setToggleGroup(answer1);


        RadioButton dani = radio(" ",70,280);
        dani.setToggleGroup(answer1);


        RadioButton fell = radio(" ",70,500);
        fell.setToggleGroup(answer2);


        RadioButton wall = radio(" ",70,640);
        wall.setToggleGroup(answer2);

        ImageView start = buttonImages("file:Data/start.jpg","file:Data/start2.jpg");
        start.setOnMouseClicked(
                e->{
                    myWatch.stop();
                    if(jon.isSelected() && fell.isSelected())
                    {
                        window.setScene(SingleGame.level1(window,"file:Data/jon0.png","file:Data/jon1.png","file:Data/jon2.png",
                                "file:Data/jon3.png","file:Data/jon4.png","file:Data/winterfellBG.jpg",
                                "file:Data/winter.jpg",
                                "file:Data/jonblood1.png","file:Data/jonblood2.png","file:Data/jonblood3.png",
                                "file:Data/jonblood4.png","file:Data/jonblood5.png"
                                ,"file:Data/jonblood6.png","file:Data/jonblood7.png","file:Data/jonblood8.png",
                                "file:Data/jonblood9.png","file:Data/jonblood10.png"));
                    } else if(jon.isSelected() && wall.isSelected())
                    {
                        window.setScene(SingleGame.level1(window,"file:Data/jon0.png","file:Data/jon1.png","file:Data/jon2.png",
                                "file:Data/jon3.png","file:Data/jon4.png","file:Data/wallBG.jpg","file:Data/wall.jpg",
                                "file:Data/jonblood1.png","file:Data/jonblood2.png","file:Data/jonblood3.png",
                                "file:Data/jonblood4.png","file:Data/jonblood5.png"
                                ,"file:Data/jonblood6.png","file:Data/jonblood7.png","file:Data/jonblood8.png",
                                "file:Data/jonblood9.png","file:Data/jonblood10.png"));

                    } else if(dani.isSelected() && fell.isSelected())
                    {
                        window.setScene(SingleGame.level1(window,"file:Data/dani0.png","file:Data/dani1.png","file:Data/dani2.png",
                                "file:Data/dani3.png","file:Data/dani4.png","file:Data/winterfellBG.jpg","file:Data/winter.jpg",
                                "file:Data/daniblood1.png","file:Data/daniblood2.png","file:Data/daniblood3.png",
                                "file:Data/daniblood4.png","file:Data/daniblood5.png"
                                ,"file:Data/daniblood6.png","file:Data/daniblood7.png","file:Data/daniblood8.png",
                                "file:Data/daniblood9.png","file:Data/daniblood10.png"));

                    } else if(dani.isSelected() && wall.isSelected())
                    {
                        window.setScene(SingleGame.level1(window,"file:Data/dani0.png","file:Data/dani1.png","file:Data/dani2.png",
                                "file:Data/dani3.png","file:Data/dani4.png","file:Data/wallBG.jpg","file:Data/wall.jpg",
                                "file:Data/daniblood1.png","file:Data/daniblood2.png","file:Data/daniblood3.png",
                                "file:Data/daniblood4.png","file:Data/daniblood5.png"
                                ,"file:Data/daniblood6.png","file:Data/daniblood7.png","file:Data/daniblood8.png",
                                "file:Data/daniblood9.png","file:Data/daniblood10.png"));

                    }

                }
        );

        ImageView back = buttonImages("file:Data/back2.jpg","file:Data/back.jpg");
        back.setOnMouseClicked(e->{
            window.setScene(Mainmenu.menu(window));
            myWatch.stop();
        });

        HBox h = new HBox();
        h.getChildren().addAll(back,start);
        h.setSpacing(350);
        h.setPadding(new Insets(700,10,10,500));



        Pane root = new Pane();
        root.getChildren().addAll(v1,h,jon,dani,fell,wall);

        Scene s2 = new Scene(root,1200,800);

        return s2;

    }
}