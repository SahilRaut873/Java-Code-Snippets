import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;

import java.util.ArrayList;
class c2w_BrowserWindow extends Stage{
    private c2w_WebBrowser c2w_owner;
    private WebEngine c2w_webEngine;
    private Menu c2w_windowMenu;

    c2w_BrowserWindow(c2w_WebBrowser c2w_browser, String c2w_initialURL){
        c2w_owner=c2w_browser;

        WebView webview =new WebView();
        c2w_webEngine=webview.getEngine();

        Label status =nerw Label(Text:"Status : Idie");
        status.setMaxWidth(Double.POSITIVE_INFINITY);
        Label location=neew Label(text:"Location : (empty)");
        location.setMaxWidth(Double.POSITIVE_INFINITY);
        TextField urlInput=new TextField();
        urlInput.setMaxWidth(value:600);
        Button loadButton=new Button(Text: "Load");
        loadButton.setOnAction(e -> doLoad(urlInput.getText()));
        loadButton.defaultButtonProperty().bind(urlInput.focusedProperty());
        Button canceButton=new Button(text:"Cancel");
        canceButton.setDisable(value:true);

        HBox loader = new HBox(spacing:0,new Label(text:"URL:"),urlInput,loadButton,canceButton);
        HBox.setHgrow(urlInput, Priority.ALWAYS);

        VBox bottom = new VBox(spacing:10, location , status, loader);
        bottom.setStyle(value: "-fx-padding: 10px; -fx-border-color:black; -fx border width:3px");

        BorderPane root= new BorderPane(webview);
        root.setBottom(bottom);
        root.setTop(makeMenuBar());

        setScene(new Scene(root));

        c2w_webEngine.locationProperty().addListener((o,oldVal,newVal)->{

        
        if(newVal==null || newVal.equals(anObject:"about:blank"));
            location.setText(value:"Location: (empty)");
        else
            location.setText("Location:"+ newVal);


    });
    c2w_webEngine.titleProperty().addListener((O,oldVal,newVal)->{
        if(newVal==null)
            setTitle("Untitled"+c2w_owner.c2w_getNextUntitledCount());
        else
            location.setText("Location:(empty)");
    });
    c2w_webEngine.getLoadWorker().stateProperty().addListener(o,oldVal,newVal);
    status.setText("Status:"+newVal);
    switch(newVal){
        case 
    }

    
}
}