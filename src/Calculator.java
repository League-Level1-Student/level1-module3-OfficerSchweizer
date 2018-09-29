import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {
	

	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mult = new JButton();
	JButton div = new JButton();
	
	
	
	public int firstNumber;
	public int secondNumber;
	
	public Calculator() {
		
	}
	
	public void start() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(450,500);
		
		
		JPanel panel = new JPanel();
		panel.setName("Calculator");
		
	    add.setBounds(50, 50, 50, 50);
	    sub.setBounds(150, 50, 50, 50);
	    mult.setBounds(250, 50, 50, 50);
	    div.setBounds(350, 50, 50, 50);
		
		add.setText("add");
		sub.setText("sub");
		mult.setText("mult");
		div.setText("div");
		
		frame.add(panel);
		frame.add(add);
		frame.add(sub);
		frame.add(mult);
		frame.add(div);
		
		
	}
	
	public void add(int firstNumber, int secondNumber) {
		System.out.println((firstNumber + secondNumber));
	}
	
	public void sub(int firstNumber, int secondNUmber) {
		
	}
	
	public void mult(int firstNumber, int secondNumber) {
		
	}
	
	public void div(int firstNumber, int secondNumber) {
		
	}
	
	
	
}
