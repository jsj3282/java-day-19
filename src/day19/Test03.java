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
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);	//���η� ����
		//flowPane.setColumnHalignment(HPos.LEFT); //��� ������ �������� �����ְڴ�(��ư����� ��� ���Ƽ� ����x)
		//flowPane.setColumnHalignment(HPos.CENTER);
		/*
		Button btn01 = new Button("��ư01");
		Button btn02 = new Button("��ư02");
		Button btn03 = new Button("��ư03");
		Button[] btn = new Button[3];
		btn[0] = btn01;
		btn[1] = btn02;
		btn[2] = btn03;
		for(int i = 0; i < btn.length; i++) {
			flowPane.getChildren().add(btn[i]);
		}
		*/
		flowPane.setPadding(new Insets(10, 10, 10, 30));	//�ð�������� ������ �ش�
		for(int i = 0; i < 10; i++) {
			flowPane.getChildren().add(new Button("��ư" + i*i*i*i*i*10));
		}
		//flowPane.setVgap(80);  //����
		//flowPane.setHgap(10); //����
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
