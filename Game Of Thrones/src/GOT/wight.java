package GOT;


import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class wight extends Group {

    public wight(Group g)
    {

        ImageView w1 = new ImageView(new Image("file:Data/1.png"));
        ImageView w2 = new ImageView(new Image("file:Data/2.png"));
        ImageView w3 = new ImageView(new Image("file:Data/3.png"));
        this.getChildren().setAll(w1);
        this.setTranslateY(550);
        this.setTranslateX(1200);

        Timeline t = new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);

        t.getKeyFrames().add(new KeyFrame(Duration.millis(100),
                event ->
                {
                    this.getChildren().setAll(w1);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(250),
                event ->
                {
                    this.getChildren().setAll(w2);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(400),
                event ->
                {
                    this.getChildren().setAll(w3);
                }));
        t.getKeyFrames().add(new KeyFrame(Duration.millis(550),
                event ->
                {
                    this.getChildren().setAll(w2);
                }));
        t.play();
        PathTransition tt = new PathTransition(Duration.millis(5000),
                new Line(this.getTranslateX(),this.getTranslateY(),-100,this.getTranslateY()),this);
        tt.setCycleCount(1);
        tt.play();
        g.getChildren().add(this);
    }

}
