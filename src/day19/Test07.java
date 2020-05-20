package day19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Test07 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		Button[] btn = new Button[5];
		String[] strBtn = {"Top", "Center", "Bottom", "Left", "Right"};
		for(int i = 0; i<btn.length; i++) {
			btn[i] = new Button(strBtn[i]);
		}
		btn[0].setPrefSize(100, 100);
		//버튼사이즈 : btn.setPrefSize
		//pane사이즈 : pane.setPrefSize
		borderPane.setTop(btn[0]);
		borderPane.setCenter(btn[1]);
		borderPane.setBottom(btn[2]);
		borderPane.setLeft(btn[3]);
		borderPane.setRight(btn[4]);
		
		primaryStage.setTitle("BorderPaneEx");
		primaryStage.setScene(new Scene(borderPane, 300, 100));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		
		launch(args);

	}


}
