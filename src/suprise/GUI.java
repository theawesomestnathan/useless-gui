package suprise;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	private String sum = "???";
	private JLabel answer;
	
	public GUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JLabel question = new JLabel("What is 25 + 25?");
		JButton button = new JButton("Compute");
		answer = new JLabel("The sum is " + sum);
		
		button.addActionListener(this);
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(question);
		panel.add(button);
		panel.add(answer);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My first GUI");
		frame.pack();
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		sum = "50";
		answer.setText("The sum is " + sum);
	}
	
}
