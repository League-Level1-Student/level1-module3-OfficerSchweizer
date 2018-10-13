import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

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

	public static void main(String[] args) {

		Random rand = new Random();
		int randomNumber = rand.nextInt(24);

		WhackAMole mole = new WhackAMole();

		mole.drawButtons(randomNumber);
		System.out.println(randomNumber);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {

		}

	}

}
