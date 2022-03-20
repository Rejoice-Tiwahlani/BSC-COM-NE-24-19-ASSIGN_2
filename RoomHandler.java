import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

class RoomHandler implements EventHandler<ActionEvent>{
    private boolean bulb1IsOn = false;
    private Rectangle rect;
    private Color color;
 

    public RoomHandler(Rectangle rect, Color color){
        this.rect = rect;
        this.color = color;
    }
    @Override
    public void handle(ActionEvent event){
        if(bulb1IsOn){
            off();
        }
        else{
            on();
        }
    }

    public void off(){
        this.rect.setFill(Color.GREY);
        bulb1IsOn = false;
    }

    public void on(){
        this.rect.setFill(color);
        bulb1IsOn = true;
    }
    public boolean bulbIsOn(){
        return this.bulb1IsOn;
    }
  }
    