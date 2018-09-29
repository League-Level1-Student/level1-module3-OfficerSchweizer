import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JButton buttonJoke = new JButton();
	JButton buttonPunchline = new JButton();

	public ChuckleClicker() {

	}

	private void makeButtons() {

		System.out.println("Made buttons");

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(200, 100);

		JPanel panel = new JPanel();
		panel.setName("Chuckle Clicker");

		buttonJoke.setText("Joke");
		buttonPunchline.setText("Punchline");

		frame.add(panel);
		panel.add(buttonJoke);
		panel.add(buttonPunchline);

		buttonJoke.addActionListener(this);
		buttonPunchline.addActionListener(this);


		
	}



	public static void main(String[] args) {

		ChuckleClicker clicker = new ChuckleClicker();

		clicker.makeButtons();

	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == buttonJoke) {
			System.out.println("Why did the chicken cross the road?");
		}
		
		if (e.getSource() == buttonPunchline) {
			System.out.println("To get to the other side!");
		}
	}
}
