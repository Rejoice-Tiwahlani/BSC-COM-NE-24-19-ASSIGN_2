import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
        Text file = new Text("File");
        file.setX(10);
        file.setY(20);

        Text edit = new Text("Edit");
        edit.setX(60);
        edit.setY(20);

        Text format = new Text("Format");
        format.setX(110);
        format.setY(20);

        Text view = new Text("View");
        view.setX(160);
        view.setY(20);

        Text help = new Text("Help");
        help.setX(210);
        help.setY(20);

        pane.getChildren().addAll(file, edit, format, view, help);


        //first room
        Rectangle room1 = new Rectangle(100,120);
        room1.setFill(Color.YELLOW);
        room1.setStroke(Color.BLACK);
        room1.setX(90);
        room1.setY(60);
        pane.getChildren().add(room1);

        //second room
        Rectangle room2 = new Rectangle(120,40);
        room2.setFill(Color.GREEN);
        room2.setStroke(Color.BLACK);
        room2.setX(190);
        room2.setY(125);
        pane.getChildren().add(room2);

        //third room
        Rectangle room3 = new Rectangle(60,85);
        room3.setFill(Color.ORANGE);
        room3.setStroke(Color.BLACK);
        room3.setX(190);
        room3.setY(60);
        pane.getChildren().add(room3);

        //fourth room
        Rectangle room4 = new Rectangle(60,85);
        room4.setFill(Color.ORANGE);
        room4.setStroke(Color.BLACK);
        room4.setX(250);
        room4.setY(60);
        pane.getChildren().add(room4);

        //fifth room
        Rectangle room5 = new Rectangle(80,105);
        room5.setFill(Color.YELLOW);
        room5.setStroke(Color.BLACK);
        room5.setX(310);
        room5.setY(60);
        pane.getChildren().add(room5);

        //sixth room
        Rectangle room6 = new Rectangle(90,110);
       room6.setFill(Color.RED);
       room6.setStroke(Color.BLACK);
       room6.setX(190);
       room6.setY(165);
       pane.getChildren().add(room6);

       //seventh and last room
       Rectangle room7 = new Rectangle(110,110);
       room7.setFill(Color.YELLOW);
       room7.setStroke(Color.BLACK);
       room7.setX(280);
       room7.setY(165);
       pane.getChildren().add(room7);



        Scene scene = new Scene(pane,600,600);
        primaryStage.setTitle("My House Lights");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}