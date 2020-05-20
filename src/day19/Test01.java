package day19;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("자동 실행되는 코드");
		Label lb = new Label("Hello World");
		lb.setFont(new Font(20));
		Scene scene = new Scene(lb, 200, 100);
		primaryStage.setScene(scene);
		
		primaryStage.show();
		Thread.sleep(2000);
		primaryStage.setX(200);
		primaryStage.setY(200);
		
		primaryStage.setTitle("연습 중!!!");
		primaryStage.show();
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		System.out.println("width : " + screenSize.width);
		System.out.println("height : " + screenSize.height);
	}
	public static void main(String[] args) {
		launch(args);
	}


}
