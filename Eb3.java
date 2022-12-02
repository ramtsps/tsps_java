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

public class eb3 extends Application {
    public void start(Stage stage) throws  Exception{
        Text t=new Text();
        Text t1=new Text();
        GridPane root=new GridPane();
        Label ser=new Label("SERVICE DETAILS");
        ser.setStyle("-fx-font-weight: bold");
        ser.setPrefWidth(300);
        ser.setAlignment(Pos.CENTER);
        ser.setFont(new Font(20));
        ser.setBackground(Background.fill(Color.GRAY));
ToggleGroup group=new ToggleGroup();
        Label conn=new Label("Service Connection Number");
        conn.setTextFill(Color.BLUE);
        TextField ctxt=new TextField("302466566553");
        Label reg=new Label("Name of th consumer");
        reg.setTextFill(Color.BLUE);
        TextField ttxt=new TextField("Parasuram");
        Label occupant_details=new Label("Occupant details");
        occupant_details.setTextFill(Color.BLUE);
        RadioButton ne1=new RadioButton("owner");
        RadioButton ne2=new RadioButton("Tenant");
        RadioButton ne3=new RadioButton("Owner but service connection name not transferred");
        ne1.setToggleGroup(group);
        ne2.setToggleGroup(group);
        ne3.setToggleGroup(group);

        Label addh=new Label("Aadhar number");
        addh.setTextFill(Color.BLUE);
        TextField atxt=new TextField();

        Label name=new Label("Name Aadhar");
        name.setTextFill(Color.BLUE);
        TextField ntxt=new TextField();

        Label upload=new Label("Upload Aadhar ID");
        upload.setTextFill(Color.BLUE);

        Button up=new Button("+ Browser");
        up.setTextFill(Color.WHITE);
        up.setMaxWidth(100);
        up.setBackground(Background.fill(Color.BLUE));

        CheckBox ch=new CheckBox("i have give my consent to link my aadhar to \n above service connection number");
        Button Enter=new Button("Enter");
        Enter.setTextFill(Color.WHITE);
        Enter.setMaxWidth(100);
        Enter.setBackground(Background.fill(Color.BLUE));

        Enter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                tq e=new tq();
                try {
                    e.start(stage);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        Scene scene =new Scene(root,700,800);
        root.getChildren().add(ser);
        root.setAlignment(Pos.CENTER);
        root.setVgap(20);
        root.setBackground(Background.fill(Color.LIGHTYELLOW));
        root.addRow(1,conn,ctxt);
        root.addRow(3,reg,ttxt);
        root.addRow(4,occupant_details,ne1);
        root.addRow(5,t,ne2);
        root.addRow(6,t1,ne3);
        root.addRow(8,addh,atxt);
        root.addRow(9,name,ntxt);
        root.addRow(10,upload,up);
        root.addRow(11,ch);
        root.addRow(12,Enter);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
