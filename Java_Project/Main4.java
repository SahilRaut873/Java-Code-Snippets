import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Main4 extends Application {
   public void start(Stage stage) throws IOException {
      InputStream stream = new FileInputStream("/Users/kunalmadhukarraut/Documents/PXL_20221225_090701974.jpg");
      Image image = new Image(stream);
    
      ImageView imageView1 = new ImageView(image);
      //Setting the image view parameters
      imageView1.setX(10);
      imageView1.setY(10);
      imageView1.setFitWidth(200);
      imageView1.setPreserveRatio(true);
      ImageView imageView2 = new ImageView(image);
      //Setting the image view parameters
      imageView2.setX(230);
      imageView2.setY(10);
      imageView2.setFitWidth(350);
      imageView2.setPreserveRatio(true);
      //Setting the view port
      Image image2 = new Image(new FileInputStream("/Users/kunalmadhukarraut/Desktop/Deskstop/Sant/27b99b853cb97a4cb9df95419973ff03.jpg"));
      //Creating the image view
      ImageView imageView3 = new ImageView(image2);
      //Setting the image view parameters
      imageView3.setX(10);
      imageView3.setY(200);
      imageView3.setFitWidth(200);
      imageView3.setPreserveRatio(true);
      //Setting the Scene object
      Group root = new Group(imageView1, imageView2, imageView3);
      Scene scene = new Scene(root, 595, 370, Color.BEIGE);
      stage.setTitle("Multiple Images");
      stage.setScene(scene);
      stage.show();
   }
   public static void main(String args[]) {
      launch(args);
   }
}