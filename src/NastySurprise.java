import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton();
	JButton treat = new JButton();
	
	
	public void initialize() {

		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		trick.setText("Trick");
		treat.setText("Treat");
		trick.addActionListener(this);
		treat.addActionListener(this);
		
		panel.add(treat);
		panel.add(trick);
		frame.add(panel);
		frame.pack();
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == trick) {
			System.out.println("trick");
			showPictureFromTheInternet("https://i.ytimg.com/vi/szirzqvdfFw/maxresdefault.jpg");
		}
		if (e.getSource() == treat) {
			System.out.println("treat");
			showPictureFromTheInternet("https://i0.wp.com/togetherasfamily.com/wp-content/uploads/2017/10/leftover-halloween-candy-cookie-bars-1.jpg?ssl=1");
		}
		
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	

	public static void main(String[] args) {

		NastySurprise surprise = new NastySurprise();
		
		surprise.initialize();
		
	}
}
