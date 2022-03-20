import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class RoomHandler implements EventHandler<ActionEvent>{
    private boolean isOn = false;
    private Rectangle rect;
    private Color color;
 

    public RoomHandler(Rectangle rect, Color color){
        this.rect = rect;
        this.color = color;
    }
    
    @Override
    public void handle(ActionEvent event){
        if(isOn){
            off();
        }
        else{
            on();
        }
    }

    public void off(){
        this.rect.setFill(Color.GREY);
        isOn = false;
    }

    public void on(){
        this.rect.setFill(color);
        isOn = true;
    }
    public boolean bulbIsOn(){
        return this.isOn;
    }
  }
    