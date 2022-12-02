package javafx;

import com.example.demo.HelloApplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import  javafx.stage.Stage;

public class e_mail extends Application
{

    public void start(Stage stage)throws  Exception{
        GridPane gridPane=new GridPane();

         Label go=new Label("                     GOOGLE");
         go.setTextFill(Color.ROYALBLUE);
         go.setFont(new Font(32));
         go.setStyle("-fx-font-weight: bold");


        Label top=new Label("                                                   Sign in to continue to Gmail");
        top.setStyle("-fx-font-weight: serif, sans-serif");
        top.setPadding(new Insets(10));
        top.setAlignment(Pos.CENTER);

        Label label1 =new Label("Email id :");label1.setPadding(new Insets(20));
        label1.setStyle("-fx-font-weight: bold");
        TextField text =new TextField();

        PasswordField passwordFields=new PasswordField();
        Label labpas=new Label("Enter password :");
        labpas.setStyle("-fx-font-weight: bold");
        labpas.setPadding(new Insets(20));

        Button submit=new Button("Submit");
        submit.setStyle("-fx-font-weight: bold");
        submit.setAlignment(Pos.CENTER);
        submit.setBackground(Background.fill(Color.ROYALBLUE));
        submit.setCenterShape(true);
        submit.setTextFill(Color.WHITE);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tq.fxml"));

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tq e=new tq();
                try
                {
                    e.start(stage);

                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        Label ne=new Label("Create account");
        ne.setStyle("-fx-font-weight: bold");
        ne.setTextFill(Color.ROYALBLUE);

        Scene scene =new Scene(gridPane,500,500);
        gridPane.setBackground(Background.fill(Color.WHITE));
        gridPane.setBorder(Border.stroke(Color.BLACK));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.addRow(0,go);
        gridPane.addRow(1,top);
        gridPane.addRow(2,label1,text);
        gridPane.addRow(3,labpas,passwordFields);
        gridPane.addRow(4,ne,submit);
        stage.setTitle("tspsram");
        stage.setScene(scene);
        stage.show();
    }
    public  static void main(String [] args){
        launch(args);
    }
}
