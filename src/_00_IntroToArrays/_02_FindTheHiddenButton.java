package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] alexLovesSpiders;
	// 2 create an integer variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		int alexLovesUranium = 10;
		try {
			alexLovesUranium = Integer.parseInt(JOptionPane.showInputDialog("Enter a number greater than 0."));
			if (alexLovesUranium <= 0) {
				alexLovesUranium = 10;
			}
		} catch (Exception e) {

		}
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		alexLovesSpiders = new JButton[alexLovesUranium];
		// 5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < alexLovesUranium; i++) {
			// 6. initialize each JButton in the array
			alexLovesSpiders[i] = new JButton();
			// 7. add the ActionListener to each JButton
			alexLovesSpiders[i].addActionListener(this);
			// 8. add each JButton to the panel
			panel.add(alexLovesSpiders[i]);
		}
		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null,
				"Here are the instructions:\n Click the button that\n flashes to WINNNNNNNN!");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3
		hiddenButton = new Random().nextInt(alexLovesUranium);
		// 14. Set the text of the JButton located at hiddenButton to read "ME"
		alexLovesSpiders[hiddenButton].setText("ME");
		// 15. Use Thread.sleep(100); to pause the program.
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		alexLovesSpiders[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (buttonClicked.equals(alexLovesSpiders[hiddenButton])) {
			JOptionPane.showMessageDialog(null,
					"Computer: Hey!\n You: Hi.\n Computer: You win!\n You: Cool!\n Computer: How dare you not be more excited! I will unleash my evil -\n You: [shuts down computer]\n Computer: [silence]\n Orangutan: Huh.\n You: AH!");
		} else {
			// 18. else tell them to try again
			JOptionPane.showMessageDialog(null,
					"Computer: Try again!\n You: [sobs with despair]\n Computer: Cheer up! Wanna hear a knock-knock joke?\n You: [sniff] Okay...\n Computer: Boo.\n You: Ah! You scared me!\n Computer: That's not how it goes. Say \"Boo who.\"\n You: Boo who?\n Computer: Don't cry, it's just a joke!\n You: AH! A BAD PUN! MY WEAKNESS! [hissss...]\n Computer: Stop deflating.");
		}
	}
}
