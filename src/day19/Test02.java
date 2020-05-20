package day19;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test02 extends Application {
//제목은 Quiz01으로 표현하고, 창의 크기는 1000, 700으로 하고
//글씨 크기는 100으로 만들고, 안의 내용은 "Infiscap world!"
//화면의 정중앙에 윈도우 창이 띄워지게 만드시오
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label lb = new Label("Infiscap world");
		lb.setFont(new Font(100));
		Scene scene = new Scene(lb,1000, 700);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		int x = screenSize.width;
		int y = screenSize.height;
		primaryStage.setX(x/2 - 500);
		primaryStage.setY(y/2 - 350);
				
		primaryStage.setScene(scene);
		//primaryStage.setX(460);  		//(1920-1000)/2
		//primaryStage.setY(190);  		//(1080-700)/2
		primaryStage.setTitle("Quiz01");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}


}
