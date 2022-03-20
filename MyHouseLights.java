import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;
import javafx.stage.Stage;


//extending the default application class
public class MyHouseLights extends Application{
    public static void main(String [] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Exception for auto generation of the method stubs
        Pane pane = new Pane();

        //Adding Text files to the window
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu format = new Menu("Format");
        Menu view = new Menu("View");
        Menu help = new Menu("Help");

        file.getItems().addAll(new MenuItem("Rejoce is programmer"), new MenuItem("Exit"));

        MenuBar menuBar = new MenuBar(file, edit, format, view, help);


        //The first room
        Rectangle room1 = new Rectangle(100,120);
        room1.setFill(Color.YELLOW);
        room1.setStroke(Color.BLACK);
        room1.setX(90);
        room1.setY(60);
        Label room1Label = new Label("Room 1");
        room1Label.setLayoutX(140);
        room1Label.setLayoutY(100);
        pane.getChildren().addAll(room1,room1Label);

        //The second room
        Rectangle room2 = new Rectangle(120,40);
        room2.setFill(Color.GREEN);
        room2.setStroke(Color.BLACK);
        room2.setX(190);
        room2.setY(125);
        Label room2Label = new Label("Room 2");
        room2Label.setLayoutX(260);
        room2Label.setLayoutY(150);
        pane.getChildren().addAll(room2, room2Label);

        //The third room
        Rectangle room3 = new Rectangle(60,85);
        room3.setFill(Color.ORANGE);
        room3.setStroke(Color.BLACK);
        room3.setX(190);
        room3.setY(60);
        Label room3Label = new Label("Room 3");
        room3Label.setLayoutX(200);
        room3Label.setLayoutY(110);
        pane.getChildren().addAll(room3, room3Label);

        // The fourth room
        Rectangle room4 = new Rectangle(60,85);
        room4.setFill(Color.ORANGE);
        room4.setStroke(Color.BLACK);
        room4.setX(250);
        room4.setY(60);
        Label room4Label = new Label("Room 4");
        room4Label.setLayoutX(260);
        room4Label.setLayoutY(110);
        pane.getChildren().addAll(room4, room4Label);

        // The fifth room
        Rectangle room5 = new Rectangle(80,105);
        room5.setFill(Color.YELLOW);
        room5.setStroke(Color.BLACK);
        room5.setX(310);
        room5.setY(60);
        Label room5Label = new Label("Room 5");
        room5Label.setLayoutX(320);
        room5Label.setLayoutY(120);
        pane.getChildren().addAll(room5, room5Label);

        // The sixth room
        Rectangle room6 = new Rectangle(90,110);
       room6.setFill(Color.RED);
       room6.setStroke(Color.BLACK);
       room6.setX(190);
       room6.setY(165);
       Label room6Label = new Label("Room 6");
       room6Label.setLayoutX(220);
       room6Label.setLayoutY(200);
       pane.getChildren().addAll(room6, room6Label);

       //The seventh and last room
       Rectangle room7 = new Rectangle(110,110);
       room7.setFill(Color.YELLOW);
       room7.setStroke(Color.BLACK);
       room7.setX(280);
       room7.setY(165);
       //adding a label to the created window
       Label room7Label = new Label("Room 7");
       room7Label.setLayoutX(340);
       room7Label.setLayoutY(210);
       pane.getChildren().addAll(room7, room7Label);

       //Adding the buttons to the window
       // button 1, this one is controlling all the rooms 
        Button buttonRoomAll = new Button("AllRooms ON/OFF");
        buttonRoomAll.setPrefSize(120, 20);
        buttonRoomAll.setLayoutY(400);
        buttonRoomAll.setLayoutX(130);
        pane.getChildren().add(buttonRoomAll);

        //button for controlling room 2
        Button buttonRoom2 = new Button("Room 2 ON/OFF");
        buttonRoom2.setPrefSize(120, 20);
        buttonRoom2.setLayoutY(400);
        buttonRoom2.setLayoutX(260);
        pane.getChildren().add(buttonRoom2);
        RoomHandler handler2 = new RoomHandler(room2, Color.GREEN);
        buttonRoom2.setOnAction(handler2);

        //Buttton for controlling room 5 
        Button buttonRoom5 = new Button("Room 5 ON/OFF");
        buttonRoom5.setPrefSize(120, 20);
        buttonRoom5.setLayoutY(400);
        buttonRoom5.setLayoutX(390);
        pane.getChildren().add(buttonRoom5);
        RoomHandler handler5 = new RoomHandler(room5, Color.YELLOW);
        buttonRoom5.setOnAction(handler5);


        //button for controlling room 1 and 2
        Button buttonRoom1and2 = new Button("Room 1&2 ON/OFF");
        buttonRoom1and2.setPrefSize(120, 20);
        buttonRoom1and2.setLayoutY(440);
        buttonRoom1and2.setLayoutX(130);
        pane.getChildren().add(buttonRoom1and2);

        //Button for controlling room 3
        Button buttonRoom3 = new Button("Room 3 ON/OFF");
        buttonRoom3.setPrefSize(120, 20);
        buttonRoom3.setLayoutY(440);
        buttonRoom3.setLayoutX(260);
        pane.getChildren().add(buttonRoom3);
        RoomHandler handler3 = new RoomHandler(room3, Color.ORANGE);
        buttonRoom3.setOnAction(handler3);

        //Button for room 6 
        Button buttonRoom6 = new Button("Room 6 ON/OFF");
        buttonRoom6.setPrefSize(120, 20);
        buttonRoom6.setLayoutY(440);
        buttonRoom6.setLayoutX(390);
        pane.getChildren().add(buttonRoom6);
        RoomHandler handler6 = new RoomHandler(room6, Color.RED);
        buttonRoom6.setOnAction(handler6);

        //Button for room 1
        Button buttonRoom1 = new Button("Room 1 ON/OFF");
        buttonRoom1.setPrefSize(120, 20);
        buttonRoom1.setLayoutY(480);
        buttonRoom1.setLayoutX(130);
        pane.getChildren().add(buttonRoom1);
        RoomHandler handler1 = new RoomHandler(room1, Color.YELLOW);
        buttonRoom1.setOnAction(handler1);

        //Button for room 4 
        Button buttonRoom4 = new Button("Room 4 ON/OFF");
        buttonRoom4.setPrefSize(120, 20);
        buttonRoom4.setLayoutY(480);
        buttonRoom4.setLayoutX(260);
        pane.getChildren().add(buttonRoom4);
        RoomHandler handler4 = new RoomHandler(room4, Color.ORANGE);
        buttonRoom4.setOnAction(handler4);

        //Button 5 for room 7
        Button buttonRoom7 = new Button("Room 7 ON/OFF");
        buttonRoom7.setPrefSize(120, 20);
        buttonRoom7.setLayoutY(480);
        buttonRoom7.setLayoutX(390);
        pane.getChildren().add(buttonRoom7);
        RoomHandler handler7 = new RoomHandler(room7, Color.YELLOW);
        buttonRoom7.setOnAction(handler7);
    
        buttonRoom1and2.setOnAction(new Handler1And2(handler1, handler2));
        // buttonRoomAll.setOnAction(new Handler1And2(handler1, handler2, handler3, handler4, handler5, handler6, handler7));

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(pane);

        Scene scene = new Scene(borderPane, 600, 600);
        primaryStage.setTitle("My House Lights");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}