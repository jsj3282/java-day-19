package day19;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Test06 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridpane = new GridPane();
		
		gridpane.setPadding(new Insets(20)); 	//���ڰ� �ϳ��̸� �ױ��� ��� ���� 20
		
		gridpane.setHgap(50);
		gridpane.setVgap(10);
		
		gridpane.add(new Button("Button"), 0, 0);
		gridpane.add(new Button("1, 0"), 1, 0);
		gridpane.add(new Label("0, 1"), 0, 1);
		gridpane.add(new Label("Label"), 1, 1);
		
		FlowPane canvas = new FlowPane();
		canvas.getChildren().add(new Button("merge col(0), row(2)"));
		canvas.setAlignment(Pos.CENTER);
		//canvas.setStyle("-fx-background-color: black;");
		canvas.setStyle("-fx-background-color: #FF0000;");
		gridpane.add(canvas, 0, 2, 2, 1);   //����, ����, ���κ���, ���κ���
		
		primaryStage.setTitle("GridPaneEx");
		primaryStage.setScene(new Scene(gridpane, 300, 300));
		primaryStage.show();
	}
	public static void main(String[] args) {
		
		launch(args);
	}


}
