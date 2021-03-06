package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setStyle("-fx-background-color: #333333");
        

        Text scenetitle = new Text("Analytics Text");
        scenetitle.setId("analyticstitle");
        grid.add(scenetitle, 0, 0, 2, 1);

        
        Label inputFile = new Label("Input File:");
        grid.add(inputFile, 0, 1);
        
        TextField inputFileTextField = new TextField();
        grid.add(inputFileTextField, 1, 1);
        
        Label outputFile = new Label("Output File:");
        grid.add(outputFile, 0, 2);
        
        PasswordField outputFileTextField = new PasswordField();
        grid.add(outputFileTextField, 1, 2);
       
        Button btn = new Button("Run");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.WHITE);
                actiontarget.setText("Check in directory...");
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene); 
        
        scene.getStylesheets().add
        (Main.class.getResource("Front.css").toExternalForm());
        
        primaryStage.show();
    }
	
	public static void main(String[] args) {
        launch(args);
    }
    
    
}