package day19;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Test08 extends Application{
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		BorderPane borderPane = new BorderPane();
	
		GridPane canvas0 = new GridPane();
		Button btn1 = new Button("아이디 입력");
		Button btn2 = new Button("비밀번호 입력");
		Button btn3 = new Button("로그인");
		btn1.setPrefSize(100, 25);
		btn2.setPrefSize(100, 25);
		btn3.setPrefSize(70, 50);
		canvas0.add(btn1, 0, 0);
		canvas0.add(btn2, 0, 1);
		canvas0.add(btn3, 1, 0, 1, 2);
		//canvas0.getChildren().addAll(btn1, btn2, btn3);
		canvas0.setAlignment(Pos.CENTER);
		canvas0.setStyle("-fx-background-color: #FAECC5;");
		canvas0.setPrefSize(400, 600);
		//gridPane.add(canvas0, 1, 3, 3, 3);
		//버튼사이즈 : btn.setPrefSize
		//pane사이즈 : pane.setPrefSize
		FlowPane canvas1 = new FlowPane();
		canvas1.getChildren().add(new Label("메뉴 홈 로그인"));
		canvas1.setAlignment(Pos.TOP_RIGHT);
		canvas1.setStyle("-fx-background-color: #FFB2D9;");
	
		//gridPane.add(canvas1, 0, 0, 3, 1);   //가로, 세로, 가로병합, 세로병합
		
		FlowPane canvas2 = new FlowPane();
		canvas2.getChildren().add(new Button("메뉴 나열"));
		canvas2.setAlignment(Pos.TOP_LEFT);
		canvas2.setStyle("-fx-background-color: #3DB7CC;");
		gridPane.add(canvas2, 0, 1, 1, 1);
		canvas2.setPrefSize(150, 600);
		//
		FlowPane canvas3 = new FlowPane();
		canvas3.getChildren().add(new Button("내용 들어가는 곳"));
		canvas3.setAlignment(Pos.TOP_CENTER);
		canvas3.setStyle("-fx-background-color: #BCE55C;");
		canvas3.setPrefSize(150, 600);
		//gridPane.add(canvas3, 1,  1, 1, 1);
		
		FlowPane canvas4 = new FlowPane();
		canvas4.getChildren().add(new Button("바닥글 들어가는 곳"));
		canvas4.setAlignment(Pos.BOTTOM_CENTER);
		canvas4.setStyle("-fx-background-color: #F29661;");
		
		borderPane.setTop(canvas1);
		borderPane.setLeft(canvas2);
		borderPane.setCenter(canvas3);
		borderPane.setRight(canvas0);
		borderPane.setBottom(canvas4);
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(borderPane, 700, 300));
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
