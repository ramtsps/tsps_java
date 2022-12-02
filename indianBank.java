package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class indianBank extends Application {
    public void  start (Stage stage){
        GridPane root=new GridPane();
        Tooltip to=new Tooltip("Enter the value");
        Label ino=new Label("Indian Bank");
        ino.setPrefWidth(300);
        ino.setAlignment(Pos.BASELINE_CENTER);
        ino.setTextFill(Color.YELLOW);
        ino.setBackground(Background.fill(Color.BLUE));
        ino.setFont(new Font(20));
        ino.setStyle("-fx-font-weight: bold");

        Label name=new Label("Enter your Name");
        TextField txf=new TextField();
        name.setStyle("-fx-font-weight: bold");
        txf.setTooltip(to);

        Label Acco=new Label("Account Number");
        TextField Atxf=new TextField();
        Acco.setStyle("-fx-font-weight: bold");
        Atxf.setTooltip(to);

        Label pass=new Label("Enter your PIN");
        PasswordField ptxf=new PasswordField();
        pass.setStyle("-fx-font-weight: bold");
        ptxf.setTooltip(to);

        Button with=new Button("Withdrawal");with.setMaxWidth(100);
        with.setBackground(Background.fill(Color.CYAN));
        with.setOnAction(new EventHandler<ActionEvent>() {
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
        Button dep=new Button("Deposit");dep.setMaxWidth(100);
        dep.setBackground(Background.fill(Color.TURQUOISE));
        dep.setOnAction(new EventHandler<ActionEvent>() {
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
        Button bala=new Button("Balance");bala.setMaxWidth(100);
        bala.setBackground(Background.fill(Color.GOLD));
        bala.setOnAction(new EventHandler<ActionEvent>() {
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
        Button cancle=new Button("Cancel");
        cancle.setOnAction(new EventHandler<ActionEvent>() {
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
        cancle.setBackground(Background.fill(Color.INDIGO));
        cancle.setTextFill(Color.WHITE);
        cancle.setMaxWidth(100);
        Text t=new Text();
        Text t1=new Text();
        Text t2=new Text();



        Scene scene =new Scene(root,700,800);
        root.setVgap(40);
        root.setBackground(Background.fill(Color.LAVENDER));
        root.getChildren().add(ino);
        root.addRow(1,name,txf);
        root.addRow(2,Acco,Atxf);
        root.addRow(3,pass,ptxf);
        root.addRow(4,with,dep,bala);
        root.addRow(5,t, cancle);

        root.setAlignment(Pos.CENTER);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
