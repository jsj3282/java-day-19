package pane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Quiz extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		PaneClass pc = new PaneClass();
		
		borderPane.setTop(pc.getFlowTop());
		borderPane.setCenter(pc.getFlowCenter());
		borderPane.setBottom(pc.getFlowBottom());
		borderPane.setLeft(pc.getFlowLeft());
		borderPane.setRight(pc.getGrid());
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(borderPane, 400, 200));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
