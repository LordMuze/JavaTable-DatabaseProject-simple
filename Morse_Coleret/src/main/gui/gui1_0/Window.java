package gui1_0;
import java.awt.FlowLayout;

import javax.swing.*;
public class Window extends JFrame {
	GUI_Controller controller;
	public Window() {
		super("Bleus Database");
		controller = new GUI_Controller();
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JScrollPane(new JTable()));
		add(new DbManagerPane(controller));
		add(new AppManagerPane(controller));
		setVisible(true);
	}
	public static void main(String[] args) {
		new Window();
	}
}
