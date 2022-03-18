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

        Rectangle room1 = new Rectangle(100,120);
        room1.setFill(Color.YELLOW);
        room1.setStroke(Color.BLACK);
        room1.setX(90);
        room1.setY(60);
        pane.getChildren().add(room1);

        

        Scene scene = new Scene(pane,600,600);
        primaryStage.setTitle("My House Lights");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}