package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Epass extends Application {
    public void  start(Stage stage){


        Tooltip to=new Tooltip("Enter the value");
        GridPane stk=new GridPane();
        ScrollPane sc=new ScrollPane();

        Label top=new Label("                                 GOVERNMENT OF TAMILNADU\n" +
                "\n" +
                "APPLICATION FORM FOR VEHICLE e-PASS FOR ESSENTIAL SERVICES");
        top.setPrefHeight(80);
        top.setPrefWidth(700);
        top.setTextFill(Color.WHITE);
        top.setAlignment(Pos.BASELINE_CENTER);
        top.setGraphicTextGap(10);
        top.setBackground(Background.fill(Color.TURQUOISE));
        top.setStyle("-fx-font-style: Arial Narrow");
        Line ln=new Line();
        ln.setStartX(0);
        ln.setEndX(700);
        ln.setStroke(Color.BLACK);

        Label App=new Label("Applicant Details");
        App.setPrefWidth(700);
        App.setPrefHeight(30);
        App.setGraphicTextGap(20);
        App.setStyle("-fx-font-weight: bold");
        App.setAlignment(Pos.BASELINE_CENTER);
        App.setTextFill(Color.WHITE);
        App.setBackground(Background.fill(Color.PURPLE));
        Text t=new Text();
        Text t1=new Text();
        Text t2=new Text();

        Label Full=new Label("Full Name of the Applicant ");
        TextField text1=new TextField();
        Label Moblie=new Label("Mobile Number");
        TextField text2=new TextField();
        Label DOB=new Label("Date of Birth");
        TextField text3=new TextField();
        Label E_mali=new Label("E-Mail");
        TextField text4=new TextField();
        Label type =new Label("Type of Applicant");
        ChoiceBox choiceBox=new ChoiceBox();
        choiceBox.getItems().add("Please Select");
        choiceBox.getItems().add("GOVERNMENT ");
        choiceBox.getItems().add("PRIVATE");
///////////////////////////////////////////////////////////////
        Label Add=new Label("Applicant Details");
        Add.setPrefWidth(700);
        Add.setPrefHeight(30);
        Add.setGraphicTextGap(20);
        Add.setStyle("-fx-font-weight: bold");
        Add.setAlignment(Pos.BASELINE_CENTER);
        Add.setTextFill(Color.WHITE);
        Add.setBackground(Background.fill(Color.PURPLE));


        Label hous=new Label("House No/Bylane No/Street Name");
        TextField htext1=new TextField();
        Label Land=new Label("House No/Bylane No/Street Name");
        TextField ltext1=new TextField();
        Label  District =new Label("District ");
        ChoiceBox choiceBoxDistrict =new ChoiceBox();
        choiceBoxDistrict .getItems().add("Please Select");
        choiceBoxDistrict .getItems().add("Ariyalur");
        choiceBoxDistrict .getItems().add("Chengalpattu");
        choiceBoxDistrict .getItems().add("Chennai");
        choiceBoxDistrict .getItems().add("Coimbatore");
        choiceBoxDistrict .getItems().add("Dharmapuri");
        choiceBoxDistrict .getItems().add("Dindigul");
        choiceBoxDistrict .getItems().add("Erode");
        choiceBoxDistrict .getItems().add("Kallakurichi");
        choiceBoxDistrict .getItems().add("Kanchipuram");
        choiceBoxDistrict .getItems().add("Nagercoil");
        choiceBoxDistrict .getItems().add("Karur");
        choiceBoxDistrict .getItems().add("Krishnagiri");
        choiceBoxDistrict .getItems().add("Madurai");
        choiceBoxDistrict .getItems().add("Namakkal");
        choiceBoxDistrict .getItems().add("Perambalur");
        choiceBoxDistrict .getItems().add("Ramanathapuram");
        choiceBoxDistrict .getItems().add("Ranipet");
        choiceBoxDistrict .getItems().add("Salem");
        choiceBoxDistrict .getItems().add("Sivagangai");
        choiceBoxDistrict .getItems().add("Tenkasi");

        Label Tehsil=new Label("Tehsil");
        ChoiceBox choiceBoxTehsil=new ChoiceBox();
        choiceBoxTehsil .getItems().add("Please Select");
        Label Police=new Label("Police Station");
        TextField ptext1=new TextField();
        Label Post=new Label("Post Office");
        TextField posttext1=new TextField();
        Label pin=new Label("Pin Code");
        TextField pintext1=new TextField();

        Label mAdd=new Label("Members Travelling");
       mAdd.setPrefWidth(700);
        mAdd.setPrefHeight(30);
       mAdd.setGraphicTextGap(20);
        mAdd.setStyle("-fx-font-weight: bold");
        mAdd.setAlignment(Pos.BASELINE_CENTER);
        mAdd.setTextFill(Color.WHITE);
        mAdd.setBackground(Background.fill(Color.PURPLE));
        Label Name,Age,Mobl;
        Name=new Label("Name");
        TextField ntext1=new TextField();
        TextField atext1=new TextField();
        Age=new Label("Age");
        Button sub=new Button("submit");
        sub.setAlignment(Pos.CENTER);
        sub.setMaxWidth(100);
        sub.setBackground(Background.fill(Color.BLUEVIOLET));
        sub.setTextFill(Color.WHITE);
        sub.setOnAction(new EventHandler<ActionEvent>() {
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

        Label dApp=new Label("Declaration");
        dApp.setPrefWidth(700);
        dApp.setPrefHeight(30);
        dApp.setGraphicTextGap(20);
        dApp.setStyle("-fx-font-weight: bold");
        dApp.setAlignment(Pos.BASELINE_CENTER);
        dApp.setTextFill(Color.WHITE);
        dApp.setBackground(Background.fill(Color.PURPLE));
        Text ter=new Text("All the information provided in the form is correct to the best of my knowledge.\n If any information furnished here is found incorrect or falsely represented, I understand that legal action will be initiated against me.\n" +
                "\n" +
                "I understand that the authorities decide on pass availability and validity and may accept or\n reject my application without giving any reason thereof. I accept that pass if issued is liable for cancellation as authority may please.");
        CheckBox ch=new CheckBox(" I Agree");




        Scene scene =new Scene(stk,700,800);
        Full.setTooltip(to);
            ntext1.setTooltip(to);
            atext1.setTooltip(to);
        stk.addRow(0,top);
        stk.addRow(1,t1);
        stk.addRow(2,App);
        stk.addRow(3,Full);
        stk.addRow(4,text1);
        stk.addRow(5,Moblie);
        stk.addRow(6,text2);
        stk.addRow(7,DOB);
        stk.addRow(8,text3);
        stk.addRow(9,E_mali);
        stk.addRow(10,text4);
        stk.addRow(11,type);
        stk.addRow(12,choiceBox);
        stk.addRow(13,t);
        stk.addRow(14,Add);
        stk.addRow(15,hous);
        stk.addRow(16,htext1);
        stk.addRow(17,Land);
        stk.addRow(18,ltext1);
        stk.addRow(19,District);
        stk.addRow(20,choiceBoxDistrict);
        stk.addRow(21,Tehsil);
        stk.addRow(22,choiceBoxTehsil);
        stk.addRow(23,Police);
        stk.addRow(24,ptext1);
        stk.addRow(25,Post);
        stk.addRow(26,posttext1);
        stk.addRow(27,pin);
        stk.addRow(28,pintext1);
        stk.addRow(29,t2);
        stk.addRow(30,mAdd);
        stk.addRow(31,Name);
        stk.addRow(32,ntext1);
        stk.addRow(33,Age);
        stk.addRow(34,atext1);
        //stk.addRow(35,Mobl,mtext1);
        stk.addRow(36,sub);
        stk.setAlignment(Pos.CENTER);
       // stk.addRow(37,dApp);
        //stk.addRow(38,ter);
       // stk.addRow(39,ch);












        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
