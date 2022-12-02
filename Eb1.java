package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Eb extends Application {
    Scene scene1;
    public void start(Stage stage) throws  Exception{
        GridPane root=new GridPane();
        Label ser=new Label("SERVICE DETAILS");
        ser.setStyle("-fx-font-weight: bold");
        ser.setPrefWidth(300);
        ser.setAlignment(Pos.CENTER);
        ser.setFont(new Font(20));
        ser.setBackground(Background.fill(Color.GRAY));

        Label conn=new Label("Service Connection Number");
        conn.setTextFill(Color.BLUE);
        TextField ctxt=new TextField();
        Button Enter=new Button("Enter");
        Enter.setTextFill(Color.WHITE);
        Enter.setMaxWidth(100);
        Enter.setBackground(Background.fill(Color.BLUE));

        Enter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                eb2 e=new eb2();
                try {
                    e.start(stage);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        Scene scene =new Scene(root,700,800);
        root.getChildren().add(ser);
        root.setBackground(Background.fill(Color.LIGHTYELLOW));
        root.setAlignment(Pos.CENTER);
        root.setVgap(20);
        root.addRow(1,conn,ctxt);
        root.addRow(2,Enter);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }

}

