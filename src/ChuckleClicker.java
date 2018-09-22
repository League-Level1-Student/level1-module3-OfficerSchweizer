import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker {

	public ChuckleClicker() {

	}

	private void makeButtons() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);
		
		JPanel panel = new JPanel();
		panel.setName("Chuckle Clicker");
				
		JButton button1 = new JButton();
		JButton button2 = new JButton();

		button1.setText("asdf");
		button2.setText("asdf2");

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);

	}

	public static void main(String[] args) {

		ChuckleClicker clicker = new ChuckleClicker();

		clicker.makeButtons();

	}
}
