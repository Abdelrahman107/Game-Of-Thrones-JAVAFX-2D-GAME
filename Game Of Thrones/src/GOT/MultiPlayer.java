package GOT;


import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MultiPlayer{

    public static MediaPlayer redwedding;


    public  static RadioButton radio(String name,double x,double y){
        RadioButton r = new RadioButton(name);
        r.setLayoutX(x);
        r.setLayoutY(y);
        r.setPrefSize(50,50);

        return r;
    }


    public static Scene Multi(Stage window)
    {
        Image bg = new Image("file:Data/multiBG1.jpg");
        ImageView bg1 = new ImageView(bg);

        ToggleGroup answer1 = new ToggleGroup();
        ToggleGroup answer2 = new ToggleGroup();
        ToggleGroup answer3 = new ToggleGroup();



        redwedding = new MediaPlayer(new Media(SingleGame.class.getResource("/music/Redwedding.mp3").toString()));
        redwedding.setCycleCount(MediaPlayer.INDEFINITE);
        redwedding.setAutoPlay(true);
        redwedding.setVolume(1);

        RadioButton jon = radio(" ",70,115);
        jon.setToggleGroup(answer1);

        RadioButton dani = radio(" ",70,170);
        dani.setToggleGroup(answer1);


        RadioButton nk = radio(" ",70,225);
        nk.setToggleGroup(answer1);


        RadioButton jon1 = radio(" ",70,350);
        jon1.setToggleGroup(answer2);


        RadioButton dani1 = radio(" ",70,410);
        dani1.setToggleGroup(answer2);


        RadioButton nk1 = radio(" ",70,475);
        nk1.setToggleGroup(answer2);


        RadioButton arena1 = radio(" ",70,610);
        arena1.setToggleGroup(answer3);


        RadioButton arena2 = radio(" ",70,710);
        arena2.setToggleGroup(answer3);



        ImageView back = SinglePlayer.buttonImages("file:Data/back1.jpg","file:Data/back22.jpg");
        back.setOnMouseClicked(e->{
            window.setScene(Mainmenu.menu(window));
            redwedding.stop();

        });

        ImageView start = SinglePlayer.buttonImages("file:Data/start1.jpg","file:Data/start22.jpg");
        start.setOnMouseClicked(e->{
            redwedding.stop();

            if (jon.isSelected()&& nk1.isSelected()&& arena1.isSelected()){
                Scene m1 = MultiGame.MultiPlayer(window,"file:Data/wall.jpg",
                        "file:Data/jon0.png","file:Data/jon1.png",
                        "file:Data/jon2.png","file:Data/jon3.png","file:Data/jon4.png",
                        "file:Data/KN0.png", "file:Data/KN1.png","file:Data/KN2.png","file:Data/KN3.png",
                        "file:Data/KN4.png", "file:Data/jonblood1.png","file:Data/jonblood2.png",
                        "file:Data/jonblood3.png", "file:Data/jonblood4.png",
                        "file:Data/jonblood5.png","file:Data/jonblood6.png",
                        "file:Data/jonblood7.png","file:Data/jonblood8.png","file:Data/jonblood9.png",
                        "file:Data/jonblood10.png",
                        "file:Data/NKblood1.png","file:Data/NKblood2.png",
                        "file:Data/NKblood3.png","file:Data/NKblood4.png","file:Data/NKblood5.png",
                        "file:Data/NKblood6.png","file:Data/NKblood7.png","file:Data/NKblood8.png",
                        "file:Data/NKblood9.png","file:Data/NKblood10.png",
                        "file:Data/fire.png", "file:Data/ice.png"
                );
                window.setScene(m1);
            }

            if (jon.isSelected()&& nk1.isSelected()&& arena2.isSelected()){
                Scene m2 = MultiGame.MultiPlayer(window,"file:Data/winter.jpg","file:Data/jon0.png","file:Data/jon1.png",
                        "file:Data/jon2.png","file:Data/jon3.png","file:Data/jon4.png","file:Data/KN0.png",
                        "file:Data/KN1.png","file:Data/KN2.png","file:Data/KN3.png","file:Data/KN4.png",
                        "file:Data/jonblood1.png","file:Data/jonblood2.png","file:Data/jonblood3.png",
                        "file:Data/jonblood4.png","file:Data/jonblood5.png","file:Data/jonblood6.png",
                        "file:Data/jonblood7.png","file:Data/jonblood8.png","file:Data/jonblood9.png",
                        "file:Data/jonblood10.png","file:Data/NKblood1.png","file:Data/NKblood2.png",
                        "file:Data/NKblood3.png","file:Data/NKblood4.png","file:Data/NKblood5.png",
                        "file:Data/NKblood6.png","file:Data/NKblood7.png","file:Data/NKblood8.png",
                        "file:Data/NKblood9.png","file:Data/NKblood10.png","file:Data/fire.png",
                        "file:Data/ice.png"
                );
                window.setScene(m2);
            }

            if (jon.isSelected()&& dani1.isSelected()&&arena1.isSelected()){
                Scene m3 = MultiGame.MultiPlayer(window,"file:Data//wall.jpg",
                        "file:Data//jon0.png","file:Data//jon1.png",
                        "file:Data//jon2.png","file:Data//jon3.png","file:Data//jon4.png",

                        "file:Data//dani0p2.png", "file:Data//dani1p2.png","file:Data//dani2p2.png","file:Data//dani3p2.png",
                        "file:Data//dani4p2.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",
                        "file:Data//fire.png", "file:Data//firep2.png"
                );
                window.setScene(m3);
            }

            if (jon.isSelected()&& dani1.isSelected()&&arena2.isSelected()){
                Scene m4 = MultiGame.MultiPlayer(window,"file:Data//winter.jpg",
                        "file:Data//jon0.png","file:Data//jon1.png",
                        "file:Data//jon2.png","file:Data//jon3.png","file:Data//jon4.png",

                        "file:Data//dani0p2.png", "file:Data//dani1p2.png","file:Data//dani2p2.png","file:Data//dani3p2.png",
                        "file:Data//dani4p2.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",
                        "file:Data//fire.png", "file:Data//firep2.png"
                );
                window.setScene(m4);
            }

            if (jon.isSelected()&& jon1.isSelected()&&arena1.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//wall.jpg",
                        "file:Data//jon0.png","file:Data//jon1.png",
                        "file:Data//jon2.png","file:Data//jon3.png","file:Data//jon4.png",

                        "file:Data//jon0p2.png", "file:Data//jon1p2.png","file:Data//jon2p2.png","file:Data//jon3p2.png",
                        "file:Data//jon4p2.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",
                        "file:Data//fire.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (jon.isSelected()&& jon1.isSelected()&&arena2.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//winter.jpg",
                        "file:Data//jon0.png","file:Data//jon1.png",
                        "file:Data//jon2.png","file:Data//jon3.png","file:Data//jon4.png",

                        "file:Data//jon0p2.png", "file:Data//jon1p2.png","file:Data//jon2p2.png","file:Data//jon3p2.png",
                        "file:Data//jon4p2.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",
                        "file:Data//fire.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (dani.isSelected()&& jon1.isSelected()&&arena1.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//wall.jpg",
                        "file:Data//dani0.png","file:Data//dani1.png",
                        "file:Data//dani2.png","file:Data//dani3.png","file:Data//dani4.png",

                        "file:Data//jon0p2.png", "file:Data//jon1p2.png","file:Data//jon2p2.png","file:Data//jon3p2.png",
                        "file:Data//jon4p2.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",
                        "file:Data//fire.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (dani.isSelected()&& jon1.isSelected()&&arena2.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//winter.jpg",
                        "file:Data//dani0.png","file:Data//dani1.png",
                        "file:Data//dani2.png","file:Data//dani3.png","file:Data//dani4.png",

                        "file:Data//jon0p2.png", "file:Data//jon1p2.png","file:Data//jon2p2.png","file:Data//jon3p2.png",
                        "file:Data//jon4p2.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",
                        "file:Data//fire.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (dani.isSelected()&& dani1.isSelected()&&arena1.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//wall.jpg",
                        "file:Data//dani0.png","file:Data//dani1.png",
                        "file:Data//dani2.png","file:Data//dani3.png","file:Data//dani4.png",

                        "file:Data//dani0p2.png", "file:Data//dani1p2.png","file:Data//dani2p2.png","file:Data//dani3p2.png",
                        "file:Data//dani4p2.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",
                        "file:Data//fire.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (dani.isSelected()&& dani1.isSelected()&&arena2.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//winter.jpg",
                        "file:Data//dani0.png","file:Data//dani1.png",
                        "file:Data//dani2.png","file:Data//dani3.png","file:Data//dani4.png",

                        "file:Data//dani0p2.png", "file:Data//dani1p2.png","file:Data//dani2p2.png","file:Data//dani3p2.png",
                        "file:Data//dani4p2.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",
                        "file:Data//fire.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }
            if (dani.isSelected()&& nk1.isSelected()&&arena1.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//wall.jpg",
                        "file:Data//dani0.png","file:Data//dani1.png",
                        "file:Data//dani2.png","file:Data//dani3.png","file:Data//dani4.png",

                        "file:Data//KN0.png", "file:Data//KN1.png","file:Data//KN2.png","file:Data//KN3.png",
                        "file:Data//KN4.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",
                        "file:Data//fire.png", "file:Data//ice.png"
                );
                window.setScene(m5);
            }

            if (dani.isSelected()&& nk1.isSelected()&&arena2.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//winter.jpg",
                        "file:Data//dani0.png","file:Data//dani1.png",
                        "file:Data//dani2.png","file:Data//dani3.png","file:Data//dani4.png",

                        "file:Data//KN0.png", "file:Data//KN1.png","file:Data//KN2.png","file:Data//KN3.png",
                        "file:Data//KN4.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",
                        "file:Data//fire.png", "file:Data//ice.png"
                );
                window.setScene(m5);
            }

            if (nk.isSelected()&& jon1.isSelected()&&arena1.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//wall.jpg",
                        "file:Data//KN0p1.png", "file:Data//KN1p1.png","file:Data//KN2p1.png","file:Data//KN3p1.png",
                        "file:Data//KN4p1.png",

                        "file:Data//jon0p2.png", "file:Data//jon1p2.png","file:Data//jon2p2.png","file:Data//jon3p2.png",
                        "file:Data//jon4p2.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",
                        "file:Data//icep1.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (nk.isSelected()&& jon1.isSelected()&&arena2.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//winter.jpg",
                        "file:Data//KN0p1.png", "file:Data//KN1p1.png","file:Data//KN2p1.png","file:Data//KN3p1.png",
                        "file:Data//KN4p1.png",

                        "file:Data//jon0p2.png", "file:Data//jon1p2.png","file:Data//jon2p2.png","file:Data//jon3p2.png",
                        "file:Data//jon4p2.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",

                        "file:Data//jonblood1.png","file:Data//jonblood2.png","file:Data//jonblood3.png",
                        "file:Data//jonblood4.png","file:Data//jonblood5.png","file:Data//jonblood6.png",
                        "file:Data//jonblood7.png","file:Data//jonblood8.png","file:Data//jonblood9.png",
                        "file:Data//jonblood10.png",
                        "file:Data//icep1.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (nk.isSelected()&& dani1.isSelected()&&arena1.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//wall.jpg",
                        "file:Data//KN0p1.png", "file:Data//KN1p1.png","file:Data//KN2p1.png","file:Data//KN3p1.png",
                        "file:Data//KN4p1.png",

                        "file:Data//dani0p2.png", "file:Data//dani1p2.png","file:Data//dani2p2.png","file:Data//dani3p2.png",
                        "file:Data//dani4p2.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",
                        "file:Data//icep1.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (nk.isSelected()&& dani1.isSelected()&&arena2.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//winter.jpg",
                        "file:Data//KN0p1.png", "file:Data//KN1p1.png","file:Data//KN2p1.png","file:Data//KN3p1.png",
                        "file:Data//KN4p1.png",

                        "file:Data//dani0p2.png", "file:Data//dani1p2.png","file:Data//dani2p2.png","file:Data//dani3p2.png",
                        "file:Data//dani4p2.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",

                        "file:Data//daniblood1.png","file:Data//daniblood2.png",
                        "file:Data//daniblood3.png","file:Data//daniblood4.png","file:Data//daniblood5.png",
                        "file:Data//daniblood6.png","file:Data//daniblood7.png","file:Data//daniblood8.png",
                        "file:Data//daniblood9.png","file:Data//daniblood10.png",
                        "file:Data//icep1.png", "file:Data//firep2.png"
                );
                window.setScene(m5);
            }

            if (nk.isSelected()&& nk1.isSelected()&&arena1.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//wall.jpg",
                        "file:Data//KN0p1.png", "file:Data//KN1p1.png","file:Data//KN2p1.png","file:Data//KN3p1.png",
                        "file:Data//KN4p1.png",

                        "file:Data//KN0.png", "file:Data//KN1.png","file:Data//KN2.png","file:Data//KN3.png",
                        "file:Data//KN4.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",
                        "file:Data//icep1.png", "file:Data//ice.png"
                );
                window.setScene(m5);
            }
            if (nk.isSelected()&& nk1.isSelected()&&arena2.isSelected()){
                Scene m5 = MultiGame.MultiPlayer(window,"file:Data//winter.jpg",
                        "file:Data//KN0p1.png", "file:Data//KN1p1.png","file:Data//KN2p1.png","file:Data//KN3p1.png",
                        "file:Data//KN4p1.png",

                        "file:Data//KN0.png", "file:Data//KN1.png","file:Data//KN2.png","file:Data//KN3.png",
                        "file:Data//KN4.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",

                        "file:Data//NKblood1.png","file:Data//NKblood2.png",
                        "file:Data//NKblood3.png","file:Data//NKblood4.png","file:Data//NKblood5.png",
                        "file:Data//NKblood6.png","file:Data//NKblood7.png","file:Data//NKblood8.png",
                        "file:Data//NKblood9.png","file:Data//NKblood10.png",
                        "file:Data//icep1.png", "file:Data//ice.png"
                );
                window.setScene(m5);
            }


        });


        HBox h = new HBox();
        h.getChildren().addAll(back,start);
        h.setSpacing(350);
        h.setPadding(new Insets(700,10,10,500));




        Group root = new Group();
        root.getChildren().addAll(bg1,h,jon,dani,nk,jon1,dani1,nk1,
                arena1,arena2);







        Scene scene = new Scene(root,1200,800);

        return  scene;
    }


}


