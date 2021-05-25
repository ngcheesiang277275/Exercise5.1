package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Calculator {

	private JFrame frame;
	private JTextField num1Text;
	private JTextField num2Text;
	private JTextField answerText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		num1Text = new JTextField();
		num1Text.setBounds(94, 73, 86, 20);
		frame.getContentPane().add(num1Text);
		num1Text.setColumns(10);
		
		num2Text = new JTextField();
		num2Text.setBounds(289, 73, 86, 20);
		frame.getContentPane().add(num2Text);
		num2Text.setColumns(10);
		
		JButton addButton = new JButton("ADD");
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				int num2;
				int answer;
				
				try {
					num1 = Integer.parseInt(num1Text.getText());
					num2 = Integer.parseInt(num2Text.getText());
					answer = num1 + num2;
					answerText.setText(Integer.toString(answer));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "You've entered an invalid integer. Please try again.");
				}
			}
		});
		addButton.setBounds(68, 125, 115, 54);
		frame.getContentPane().add(addButton);
		
		JButton minusButton = new JButton("MINUS");
		minusButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int answer;
				
				try {
					num1 = Integer.parseInt(num1Text.getText());
					num2 = Integer.parseInt(num2Text.getText());
					answer = num1 - num2;
					answerText.setText(Integer.toString(answer));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "You've entered an invalid integer. Please try again.");
				}
			}
		});
		minusButton.setBounds(242, 125, 115, 54);
		frame.getContentPane().add(minusButton);
		
		answerText = new JTextField();
		answerText.setFont(new Font("Tahoma", Font.PLAIN, 13));
		answerText.setColumns(10);
		answerText.setBounds(166, 219, 124, 20);
		frame.getContentPane().add(answerText);
		
		JLabel lblNewLabel = new JLabel("Integer:");
		lblNewLabel.setBounds(49, 76, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Integer:");
		lblNewLabel_1.setBounds(233, 76, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAnswer = new JLabel("Answer:");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAnswer.setBounds(105, 222, 51, 14);
		frame.getContentPane().add(lblAnswer);
		
		JLabel lblNewLabel_2 = new JLabel("ADD & MINUS CALCULATOR");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(94, 22, 249, 31);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
