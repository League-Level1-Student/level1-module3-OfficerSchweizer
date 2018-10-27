import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements ActionListener, KeyListener {

	int correctCharactersPressed;
	int charactersPressed;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter = generateRandomLetter();

	public void initialize() {

		frame.setVisible(true);
		frame.setSize(100, 75);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(30.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

		panel.add(label);
		frame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {

		TypingTutor tutor = new TypingTutor();

		tutor.initialize();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyChar() == currentLetter) {

			panel.setBackground(Color.GREEN);
			System.out.println("Correct You typed: " + currentLetter);
			correctCharactersPressed +=1;
			charactersPressed +=1;

		} else {

			panel.setBackground(Color.RED);
			System.out.println("Incorrect You typed: " + currentLetter);
			charactersPressed +=1;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		if (charactersPressed == 30) {
			showTypingSpeed(correctCharactersPressed);
			frame.dispose();
		}
		
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}
	
	Date timeAtStart = new Date();

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

}
