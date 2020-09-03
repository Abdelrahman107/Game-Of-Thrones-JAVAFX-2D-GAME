package GOT;


import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class walker extends Group {
    public walker(Group g) {
        ImageView ww1 = new ImageView(new Image("file:Data/ww1.png"));
        ImageView ww2 = new ImageView(new Image("file:Data/ww2.png"));
        ImageView ww3 = new ImageView(new Image("file:Data/ww3.png"));


        ww1.setFitHeight(250);
        ww2.setFitHeight(250);
        ww3.setFitHeight(250);

        this.getChildren().setAll(ww1);


        this.setTranslateX(2000);
        this.setTranslateY(550);
        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(Duration.millis(100),
                event ->
                {

                    this.getChildren().setAll(ww1);

                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(200),
                event ->
                {

                    this.getChildren().setAll(ww2);

                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(300),
                event ->
                {

                    this.getChildren().setAll(ww3);

                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(400),
                event ->
                {

                    this.getChildren().setAll(ww1);

                }));
        t.play();


        PathTransition tt4 = new PathTransition(Duration.millis(10000),
                new Line(this.getTranslateX(),this.getTranslateY(),-100,this.getTranslateY()),this);
        tt4.play();
        g.getChildren().add(this);
    }
}

