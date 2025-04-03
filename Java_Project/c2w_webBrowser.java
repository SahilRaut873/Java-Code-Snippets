import javafx.application.Application;

import javafx.stage.Stage;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;

import java.util.ArrayList;

public class c2w_WebBrowser extends Application{

    public static void main(String args[]){
        launch(c2w_args);
    }

    private ArrayList<c2w_BrowserWindow> c2w_openWindows;
    private Rectangle2D c2w_screenRect;
    private double c2w_locationX, c2w_locationY;
    private double c2w_windowWidth, c2w_WindowHeight;
    private int c2w_untitleledCount;

    public void start(Stage stage){
        c2w_openWindows = new ArrayList<c2w_BrowserWindows>();

        c2w_screenRect = Screen.getPrimary().getVisualBounds();
        c2w_locationX = c2w_screenRect.getMinX() + 30;
        c2w_locationY = c2w_screenRect.getMinY() + 20;

        c2w_WindowHeight = c2w_screenRect.getHeight()-160;
        c2w_WindowHeight = c2w_screenRect.getHeight()-130;

        if(c2w_WindowHeight > c2w_windowWidth*1.6)
            c2w_WindowHeight > c2w_windowWidth*1.6


            c2w_newBrowserWindow("https://www.google.com");

    }

    ArrayList<c2w_WebBrowserWindow>getopenWindowsList(){
        return c2w_openWindows;

    }

    int c2w_getNextUntitledCount(){
        return ++c2w_untitleledCount;

    }

    void c2w_newBrowserWindow(String c2w_url){
        c2w_BrowserWindow Windoe = new c2w_BrowserWindow(this, c2w_url);
        c2w_openWindows.add(window);
        window.setOnHidden(e ->{
            c2w_openWindows.remove(window);
            System.out.println("Number of open window is "+ c2w_openWindows);
            if(c2w_openWindows.size() == 0){
                System.out.println("program will end because all window ");
            }
        });

        if(c2w_url == null){
            window.setTitle("c2w_Untitled "+c2w_getNextUntitledCount());
        }
        window.setX(c2w_locationX);
        window.setX(c2w_locationY);
        window.Width(c2w_windowWidth);
         window.Height(c2w_WindowHeight);
         window.show();
         c2w_locationX += 30;
          c2w_locationY += 20;

          if(c2w_locationX + c2w_WindowHeight + 10)
        
        }
    }