package gui1_0;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class DbManagerPane extends JPanel {
	private AddData addData;
	private RemoveData removeData;
	private UpdateData updateData;
	public DbManagerPane(ActionListener guiController) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		addData = new AddData();
		removeData = new RemoveData();
		updateData = new UpdateData();
		addData.addActionListener(guiController);
		removeData.addActionListener(guiController);
		updateData.addActionListener(guiController);
		add(addData);
		add(removeData);
		add(updateData);
		
	}

}
