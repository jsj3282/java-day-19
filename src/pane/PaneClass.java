package pane;


import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

class PaneClass {
	public FlowPane getFlowTop() {
		FlowPane flowTop = new FlowPane();
		flowTop.setPadding(new Insets(10, 10, 10, 250));
		flowTop.setHgap(10);
		flowTop.setStyle("-fx-background-color:pink;");
		ArrayList<Label> lb = new ArrayList<>();
		lb.add(new Label("�޴�"));
		lb.add(new Label("Ȩ"));
		lb.add(new Label("�α���"));
		flowTop.getChildren().addAll(lb);
		
		return flowTop;
		
	}
	public FlowPane getFlowLeft() {
		FlowPane flowLeft = new FlowPane(new Button("�޴� ����"));
		flowLeft.setPrefWidth(100);
		flowLeft.setStyle("-fx-background-color:skyblue;");
		return flowLeft;
	}
	public FlowPane getFlowCenter() {
		FlowPane flowCenter = new FlowPane(new Button("���� ���� ��"));
		flowCenter.setStyle("-fx-background-color:#BCE55C;");
		return flowCenter;
	}
	public FlowPane getFlowBottom() {
		FlowPane flowBottom = new FlowPane(new Button("�ٴڱ� ���� ��"));
		flowBottom.setPrefWidth(400);
		flowBottom.setAlignment(Pos.CENTER);
		flowBottom.setStyle("-fx-background-color:#D2916C;");
		return flowBottom;
	}
	public ArrayList<Button> getButton(){
		ArrayList<Button> arrBtn = new ArrayList<Button>();
		Button bt01 = new Button("���̵� �Է�");
		bt01.setPrefSize(100, 25);
		Button bt02 = new Button("��й�ȣ �Է�");
		bt02.setPrefSize(100, 25);
		Button bt03 = new Button("�α���");
		bt03.setPrefSize(60, 50);
		arrBtn.add(bt01);
		arrBtn.add(bt02);
		arrBtn.add(bt03);
		return arrBtn;
	}
	public GridPane getGrid() {
		GridPane grid = new GridPane();
		grid.setStyle("-fx-background-color:#FAF4C0");
		grid.setPadding(new Insets(20));
		ArrayList<Button> arrBtn = getButton();
		grid.add(arrBtn.get(0), 0, 0);
		grid.add(arrBtn.get(1), 0, 1);
		grid.add(arrBtn.get(2), 1, 0, 1, 2);		//�α���
		return grid;
	}

}
