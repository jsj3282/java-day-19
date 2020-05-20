package day19;

import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Test02 extends Application {
//������ Quiz01���� ǥ���ϰ�, â�� ũ��� 1000, 700���� �ϰ�
//�۾� ũ��� 100���� �����, ���� ������ "Infiscap world!"
//ȭ���� ���߾ӿ� ������ â�� ������� ����ÿ�
	
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
