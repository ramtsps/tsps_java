package javafx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Mark_list extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)throws  Exception {



        GridPane gridPane=new GridPane();
        HBox root=new HBox();
        BorderPane rootR=new BorderPane();
        BorderPane rootL=new BorderPane(gridPane);
        rootL.setBackground(Background.fill(Color.SILVER));
        rootR.setBackground(Background.fill(Color.PALETURQUOISE));

        Button button=new Button("SUBMIT");
        button.setBackground(Background.fill(Color.DODGERBLUE));
        button.setTextFill(Color.WHITE);
        button.setPrefWidth(100);
        button.setPrefHeight(30);
        button.setFont(Font.font("Verdana",FontWeight.EXTRA_BOLD, 10));

        Label tlab=new Label("SKP ENGINEERING COLLEGE");
        Label tlab1=new Label("SKP ENGINEERING COLLEGE");
        tlab.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
        tlab.setPadding(new Insets(30));
        tlab1.setAlignment(Pos.CENTER);
        tlab1.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 20));
        tlab1.setPadding(new Insets(30));
        tlab1.setAlignment(Pos.CENTER);

        TextField textField1 = new TextField();
        textField1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField1.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        textField1.setFont(Font.font(15));
        textField1.setPrefWidth(50);
        textField1.setPrefHeight(20);

        TextField textField2 = new TextField();
        textField2.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField2.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        textField2.setFont(Font.font(15));
        textField2.setPrefWidth(50);
        textField2.setPrefHeight(20);

        TextField textField3 = new TextField();
        textField3.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField3.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        textField3.setFont(Font.font(15));
        textField3.setPrefWidth(50);
        textField3.setPrefHeight(20);

        TextField textField4 = new TextField();
        textField4.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField4.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        textField4.setFont(Font.font(15));
        textField4.setPrefWidth(50);
        textField4.setPrefHeight(20);

        TextField textField5 = new TextField();
        textField5.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField5.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        textField5.setFont(Font.font(15));
        textField5.setPrefWidth(50);
        textField5.setPrefHeight(20);

        TextField textField6 = new TextField();
        textField6.setFont(Font.font(15));
        textField6.setPrefWidth(50);
        textField6.setPrefHeight(20);

        TextField textField7 = new TextField();
        textField7.setFont(Font.font(15));
        textField7.setPrefWidth(50);
        textField7.setPrefHeight(20);


        button.setOnAction(new EventHandler<ActionEvent>() {


            @Override
            public void handle(ActionEvent actionEvent) {
                    int total = 0,i=0;
                int []subjedctMark = new int[7];
                String grade[]=new String[7];
                GridPane gridPane1=new GridPane();
                gridPane1.setAlignment(Pos.TOP_CENTER);
                gridPane1.setVgap(20);
                gridPane1.setHgap(50);

                subjedctMark[0]= Integer.parseInt(textField1.getText());
                subjedctMark[1]= Integer.parseInt(textField2.getText());
                subjedctMark[2]= Integer.parseInt(textField3.getText());
                subjedctMark[3]= Integer.parseInt(textField4.getText());
                subjedctMark[4]= Integer.parseInt(textField5.getText());

                for( i=0;i<=6;i++){
                    if(subjedctMark[i]<=100) {
                        if ((subjedctMark[i] <= 100) && (subjedctMark[i] > 95))
                        { System.out.println(" \t\t "+ subjedctMark[i] + "\t\t O PASS ");
                                        grade[i]= "O PASS ";
                        }
                        else if ((subjedctMark[i] <= 95) && (subjedctMark[i] > 90))
                        {  System.out.println( " \t\t "+ subjedctMark[i]+ "\t\t A+ PASS ");
                            grade[i]=  "A+ PASS ";
                        }
                        else if ((subjedctMark[i] <= 90) && (subjedctMark[i] > 85))
                        {  System.out.println( "\t\t " + subjedctMark[i] + "\t\t A PASS ");
                            grade[i] = " A PASS ";
                        }
                        else if ((subjedctMark[i] <= 85) && (subjedctMark[i] > 70))
                        { System.out.println(" \t\t "+ subjedctMark[i] + "\t\t B+ PASS ");
                            grade[i]=  " B+ PASS ";
                        }
                        else if ((subjedctMark[i] <= 70) && (subjedctMark[i] >=50))
                        {  System.out.println(" \t\t "+ subjedctMark [i]+ "\t\t B PASS ");
                            grade[i]=  "B PASS ";
                        }
                        else if (subjedctMark[i] < 50)
                        {  System.out.println(" \t\t "+ subjedctMark[i] + "\t\t FAIL");
                            grade[i]=  " FAIL ";
                        }
                        total+=subjedctMark[i];

                    }
                    else {
                        System.out.println(" \t\t "+subjedctMark[i]+" \t Mark is invalid ");
                    }
                }
                System.out.println(" Total \t\t "+ total);



                gridPane1.addRow(0,labelT("SUBJECT"),labelT("MARKS"),labelT("GRADE"));
                gridPane1.addRow(1,label(textField6.getText().toUpperCase()));
                gridPane1.addRow(2,label(textField7.getText().toUpperCase()));
                gridPane1.addRow(3,label("MATHS"),label(String.valueOf( subjedctMark[0])),label(grade[0]));
                gridPane1.addRow(4,label("JAVA"),label(String.valueOf( subjedctMark[1])),label(grade[1]));
                gridPane1.addRow(5,label("FODS"),label(String.valueOf( subjedctMark[2])),label(grade[2]));
                gridPane1.addRow( 6,label("DS"),label(String.valueOf( subjedctMark[3])),label(grade[3]));
                gridPane1.addRow(7, label("DP&CO"),label(String.valueOf( subjedctMark[4])),label(grade[4]));
                gridPane1.addRow(8,label("TOTAL :"),label(String.valueOf(total)));
                rootR.setCenter(gridPane1);


                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");

            }
        });


        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setVgap(20);
        gridPane.setHgap(50);

        gridPane.addRow(0,labelT("SUBJECT"),labelT("MARKS"));
        gridPane.addRow(1, label("NAME "),textField6 );
        gridPane.addRow(2,label("COURSE"),textField7);
        gridPane.addRow(3, label("MATHS"),textField1 );
        gridPane.addRow(4,label("JAVA"),textField2);
        gridPane.addRow(5,label("FODS"),textField3);
        gridPane.addRow( 6,label("DS"),textField4);
        gridPane.addRow(7, label("DP&CO"),textField5);
        gridPane.add(button,1,8);






        rootL.setTop(tlab);
        rootL.setCenter(gridPane);


         rootR.setTop(tlab1);

        root.getChildren().addAll(rootL,rootR);
        Scene scene=new Scene(root,765,600);
        primaryStage.setResizable(false);
        primaryStage.setMaxHeight(600);
        primaryStage.setMaxWidth(700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mark list");
        primaryStage.show();

    }

    private Label label(String st) {
        Label label = new Label(st);
        label.setFont(Font.font(18));
        label.setAlignment(Pos.CENTER);
        label.setPrefWidth(90);
        label.setPrefHeight(20);
        return label;
    }
    private Label labelT(String st) {
        Label label = new Label(st);

        label.setAlignment(Pos.CENTER);
        label.setFont(Font.font("Verdana", FontWeight.EXTRA_BOLD, 18));
        label.setPrefWidth(99);
        label.setPrefHeight(20);
        return label;
    }



}
