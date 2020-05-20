package day19;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Test05 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		GridPane gridpane = new GridPane();
		
		gridpane.setPadding(new Insets(20)); 	//숫자가 하나이면 네군데 모두 여백 20
		
		gridpane.setHgap(50);
		gridpane.setVgap(10);
		Button button = new Button("Button");
		GridPane.setRowIndex(button, 0); 	//세로
		GridPane.setColumnIndex(button, 0);  //가로
		
		Label label = new Label("Label");
		gridpane.setConstraints(label, 1, 1);		//가로, 세로
		gridpane.getChildren().addAll(button, label);
		gridpane.add(new Button("1, 0"), 1, 0);
		gridpane.add(new Label("0, 1"), 0, 1);
		
		primaryStage.setTitle("GridPaneEx");
		primaryStage.setScene(new Scene(gridpane, 300, 300));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);

	}


}
