import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main1 extends Application {

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Group group = new Group();

    Rectangle rect = new Rectangle(10,10,100,100);
    
    rect.setArcHeight(15);
    rect.setArcWidth(15);

    rect.setStroke(Color.BLACK);
    rect.setFill(Color.RED);
    
    group.getChildren().add(rect);
    
    Scene scene = new Scene(group, 300, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
