import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class ButtonExample extends Application {
   @Override
   public void start(Stage stage) {
      //Creating toggle buttons
      ToggleButton button1 = new ToggleButton("Create");
      ToggleButton button2 = new ToggleButton("Fork");
      ToggleButton button3 = new ToggleButton("Exit");
      //Toggle button group
      ToggleGroup group = new ToggleGroup();
      button1.setToggleGroup(group);
      button2.setToggleGroup(group);
      button3.setToggleGroup(group);
      //Adding the toggle button to the pane
      VBox box = new VBox(5);
      box.setFillWidth(false);
      box.setPadding(new Insets(5, 5, 5, 50));
      box.getChildren().addAll(button1, button2, button3);
      //Setting the stage
      Scene scene = new Scene(box, 595, 150, Color.BEIGE);
      stage.setTitle("Toggled Button Example");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[]){
      launch(args);
   }
}