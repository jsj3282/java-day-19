package day19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Test04 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		Button button = new Button("Button");
		GridPane.setRowIndex(button, 0);
		GridPane.setColumnIndex(button, 0);

		Label label = new Label("Label");
		Label label01 = new Label("Label01");
		GridPane.setRowIndex(label01, 1);
		GridPane.setColumnIndex(label01, 1);
		
		GridPane.setConstraints(label, 0, 2);		//가로, 세로
		gridPane.getChildren().addAll(button, label, label01);
		primaryStage.setTitle("GridPane test");
		primaryStage.setScene(new Scene(gridPane, 300, 100));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}


}
