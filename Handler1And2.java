import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Handler1And2 implements EventHandler<ActionEvent>{
    private RoomHandler handler1;
    private RoomHandler handler2;
    private RoomHandler handler3;
    private RoomHandler handler4;
    private RoomHandler handler5;
    private RoomHandler handler6;
    private RoomHandler handler7;

    public Handler1And2(RoomHandler handler1, RoomHandler handler2){
        this.handler1 = handler1;
        this.handler2 = handler2;
    }

    public Handler1And2(RoomHandler handler1, RoomHandler handler2, RoomHandler handler3, RoomHandler handler4, 
            RoomHandler handler5, RoomHandler handler6, RoomHandler handler7){
        this.handler1 = handler1;
        this.handler2 = handler2;
        this.handler3 = handler3;
        this.handler4 = handler4;
        this.handler5 = handler5;
        this.handler6 = handler6;
        this.handler7 = handler7;
    }
    @Override
    public void handle(ActionEvent event){
        if(((Button)event.getSource()).getId().equals("Room1And2")){
            if(handler1.bulbIsOn() && handler2.bulbIsOn()){
                handler1.off();
                handler2.off();
            }else{
                handler1.on();
                handler2.on();
            }
        }
        else if(((Button)event.getSource()).getId().equals("AllRooms")){
            if(handler1.bulbIsOn() && handler2.bulbIsOn() && handler3.bulbIsOn() && handler4.bulbIsOn() && handler5.bulbIsOn() && handler6.bulbIsOn() && handler7.bulbIsOn()){
                handler1.off();
                handler2.off();
                handler3.off();
                handler4.off();
                handler5.off();
                handler6.off();
                handler7.off();
            }else{
                handler1.on();
                handler2.on();
                handler3.on();
                handler4.on();
                handler5.on();
                handler6.on();
                handler7.on();
            }
        }
    }
}