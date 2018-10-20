import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	Date date = new Date();
	int missed = 0;
	int whacked = 0;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void drawButtons(int moleButton) {

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 330);

		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);

			button.addActionListener(this);

			if (i == moleButton) {
				button.setText("Mole");
			}

		}

		frame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Random rand = new Random();
		int randomNumber = rand.nextInt(24);

		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed.getText().equals("Mole")) {

			System.out.println("correct");

			whacked += 1;
			if (whacked == 10) {

				endGame(date, whacked);
				System.out.println("asdf");
			}

			panel.removeAll();
			frame.dispose();
			randomNumber = rand.nextInt(24);
			drawButtons(randomNumber);

		} 
		else {
			System.out.println("incorrect");
			missed += 1;

			if (missed == 5) {

				speak("You lost");
				endGame(date, missed);
			}

		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Random rand = new Random();
		int randomNumber = rand.nextInt(24);

		WhackAMole mole = new WhackAMole();

		mole.drawButtons(randomNumber);
		System.out.println(randomNumber);

	}

	public void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}
}
