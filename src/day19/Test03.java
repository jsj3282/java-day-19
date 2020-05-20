package day19;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Test03 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);	//세로로 정렬
		//flowPane.setColumnHalignment(HPos.LEFT); //모든 값들을 왼쪽으로 맞춰주겠다(버튼사이즈가 모두 같아서 실행x)
		//flowPane.setColumnHalignment(HPos.CENTER);
		/*
		Button btn01 = new Button("버튼01");
		Button btn02 = new Button("버튼02");
		Button btn03 = new Button("버튼03");
		Button[] btn = new Button[3];
		btn[0] = btn01;
		btn[1] = btn02;
		btn[2] = btn03;
		for(int i = 0; i < btn.length; i++) {
			flowPane.getChildren().add(btn[i]);
		}
		*/
		flowPane.setPadding(new Insets(10, 10, 10, 30));	//시계방향으로 여백을 준다
		for(int i = 0; i < 10; i++) {
			flowPane.getChildren().add(new Button("버튼" + i*i*i*i*i*10));
		}
		//flowPane.setVgap(80);  //세로
		//flowPane.setHgap(10); //가로
		//flowPane.getChildren().add(btn01);
		//flowPane.getChildren().add(btn02);
		//flowPane.getChildren().add(btn03);
		Scene sc = new Scene(flowPane, 300, 200);
		primaryStage.setTitle("flowpane test");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);

	}


}
