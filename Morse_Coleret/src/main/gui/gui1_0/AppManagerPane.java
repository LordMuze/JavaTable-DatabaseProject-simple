package gui1_0;

import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class AppManagerPane extends JPanel {
	private Refresh refreshButton;
	private Settings settingsButton;
	private Website websiteButton;
	public AppManagerPane(ActionListener guiController) {
		refreshButton = new Refresh();
		settingsButton = new Settings();
		websiteButton = new Website();
		refreshButton.addActionListener(guiController);
		settingsButton.addActionListener(guiController);
		websiteButton.addActionListener(guiController);
		add(refreshButton);
		add(settingsButton);
		add(websiteButton);
	}

}
