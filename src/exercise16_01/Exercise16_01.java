package exercise16_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Exercise16_01 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    BorderPane pane = new BorderPane();
    Pane paneForTextField = new Pane();
    HBox paneForButtons = new HBox(10);
    HBox paneForRadioButtons = new HBox(20);
    
    /** Create text box */
    Text text = new Text(75, 100, "Programming is fun"); 
    text.setFont(new Font(20));
    pane.setCenter(paneForTextField);
    pane.getChildren().add(text);
    
    /** Create color options */
    paneForRadioButtons.setPadding(new Insets(20));
    RadioButton red = new RadioButton("Red");
    red.setEllipsisString("Red");
    RadioButton yellow = new RadioButton("Yellow");
    yellow.setEllipsisString("Yellow");
    RadioButton black = new RadioButton("Black");
    black.setEllipsisString("Black");
    RadioButton orange = new RadioButton("Orange");
    orange.setEllipsisString("Orange");
    RadioButton green = new RadioButton("Green");
    green.setEllipsisString("Green");
    paneForRadioButtons.getChildren().addAll(red, yellow, black, orange, green);
    pane.getChildren().add(paneForRadioButtons);
    
    ToggleGroup group = new ToggleGroup();
    red.setToggleGroup(group);
    yellow.setToggleGroup(group);
    black.setToggleGroup(group);
    orange.setToggleGroup(group);
    green.setToggleGroup(group);

    red.setOnAction(e -> {if (red.isSelected()) {
                            text.setFill(Color.RED);
                         }
                         });
    
    yellow.setOnAction(e -> {if (yellow.isSelected()) {
                              text.setFill(Color.YELLOW);
                            }
                            });
    
    black.setOnAction(e -> {if (black.isSelected()) {
                              text.setFill(Color.BLACK);
                            }
                            });
    
    orange.setOnAction(e -> {if (orange.isSelected()) {
                              text.setFill(Color.ORANGE);
                            }
                            });
    
    green.setOnAction(e -> {if (green.isSelected()) {
                              text.setFill(Color.GREEN);
                            }
                            });
    
    /**Create buttons */
    Button left = new Button("<=");
    Button right = new Button("=>");
    paneForButtons.getChildren().addAll(left, right);
    paneForButtons.setAlignment(Pos.CENTER);
    pane.setBottom(paneForButtons);
    left.setOnAction(e -> text.setX(text.getX() - 10));
    right.setOnAction(e -> text.setX(text.getX() + 10));
    
    /** Set scene */
    Scene scene = new Scene(pane, 425, 175);
    primaryStage.setTitle("Exercise16_01");
    primaryStage.setScene(scene);
    primaryStage.show();

    }
    
    public static void main(String[] args) {

        launch(args);

    }
    
}