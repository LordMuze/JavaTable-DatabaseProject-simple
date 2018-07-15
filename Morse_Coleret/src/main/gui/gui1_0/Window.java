package gui1_0;
import java.awt.FlowLayout;
import testcode.*;

import javax.swing.*;
public class Window extends JFrame {
	GUI_Controller controller;
	TableModel model;
	public Window() {
		super("Bleus Database");
		model = new TableModel("default");
		controller = new GUI_Controller();
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JScrollPane(new JTable(model)));
		add(new DbManagerPane(controller));
		add(new AppManagerPane(controller));
		setVisible(true);
	}
	public static void main(String[] args) {
		new Window();
	}
}
