import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SwitchHandler implements EventHandler<ActionEvent>{
    private RoomHandler[] allRooms;

    public SwitchHandler(RoomHandler...allRooms){
        this.allRooms = new RoomHandler[allRooms.length];

        for(int i=0; i<allRooms.length; i++){
            this.allRooms[i] = allRooms[i];
        }

        
    }

    // overriding the default handle method in the EventHandler class
    @Override
    public void handle(ActionEvent event){
        if(allRoomsAreOff()){
            on();
        }else{
            off();
        }
    }

    public void on(){
        for(int i=0; i<allRooms.length; i++){
            this.allRooms[i].on();
        }
    }

    public void off(){
        for(int i=0; i<allRooms.length; i++){
            this.allRooms[i].off();
        }
    }
// returning true if all the lights are off and false if that is not the case
    public boolean allRoomsAreOff(){
        for(int i=0; i<allRooms.length; i++){
            if(this.allRooms[i].bulbIsOn()){
                return false;
            }
        }
        return true;
    }
}