import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mult = new JButton();
	JButton div = new JButton();
	JTextField field = new JTextField(5);
	JTextField field2 = new JTextField(5);
	JLabel label = new JLabel();

	public Calculator() {

	}

	public void start() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(200, 500);

		JPanel panel = new JPanel();
		panel.setName("Calculator");

		add.setText("add");
		sub.setText("sub");
		mult.setText("mult");
		div.setText("div");

		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);

		panel.add(field);
		panel.add(field2);
		panel.add(add);
		panel.add(sub);
		panel.add(mult);
		panel.add(div);
		panel.add(label);
		frame.add(panel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == add) {

			label.setText(Integer.toString(Integer.parseInt(field.getText()) + (Integer.parseInt(field2.getText()))));
		}
		if (e.getSource() == sub) {

			label.setText(Integer.toString(Integer.parseInt(field.getText()) - (Integer.parseInt(field2.getText()))));
		}
		if (e.getSource() == mult) {

			label.setText(Integer.toString(Integer.parseInt(field.getText()) * (Integer.parseInt(field2.getText()))));
		}
		if (e.getSource() == div) {

			label.setText(Integer.toString(Integer.parseInt(field.getText()) / (Integer.parseInt(field2.getText()))));
		}
	}

}
