//Скелет JаvаFХ-приложения

import javafx.application.*;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.event.*;
public class Main extends Application {

    private static Button btnAlfa = new Button("Alpha");
    private static Button btnBeta = new Button("Beta");

    public static void main(String[] args) {
        System.out.println("Зaпycк JаvаFХ-приложения.");
        //запустить JаvаFХ-приложение , вызвав ме тод launch()
        launch(args);
    }

    public void init() {
        char[] z = {1059, 1076, 1086, 1074, 1077, 1085, 1082, 1086, 32, 1055, 1069, 45, 49, 55, 49};
        for (char c : z) {
            System.out.print(c);
        }
        System.out.print("\n");
        System.out.println("B теле метода iпit().");
    }

    //переопределить метод start ()
    public void start(Stage myStage) {
        System.out.println("B теле метода start().");
        myStage.setTitle("JavaFX Skeleton.");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode, 300, 200);
        myStage.setScene(myScene);
        Label myLabel = new Label("This is а JavaFX label");
        btnAlfa.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myLabel.setText("Alpha was pressed.");
            }
        });
        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myLabel.setText("Beta was pressed.");
            }
        });
        btnBeta.setOnMouseEntered(event -> {
            double a1 = btnBeta.getMaxWidth();
            double a2 = btnBeta.getMaxHeight();
            double b1 = (myScene.getWidth() - btnBeta.getMaxWidth());
            double b2 = (myScene.getHeight() - btnBeta.getMaxHeight());
            double x = a1 + (int) (Math.random() * b1);
            double y = a2 + (int) (Math.random() * b2);
            btnBeta.setLayoutX(x);
            btnBeta.setLayoutY(y);
        });
        Pane pane = new Pane();
        pane.getChildren().addAll(btnBeta);
        rootNode.getChildren().addAll(btnAlfa, pane, myLabel);
        //показать подмостки и сцену на них
        myStage.show();
    }

    //переопределить метод stop ()
    public void stop() {
        char[] z = {1059, 1076, 1086, 1074, 1077, 1085, 1082, 1086, 32, 1055, 1069, 45, 49, 55, 49};
        for (char c : z) {
            System.out.print(c);
        }
        System.out.print("\n");
        System.out.println("B теле ме тода stop(}.");
    }
}