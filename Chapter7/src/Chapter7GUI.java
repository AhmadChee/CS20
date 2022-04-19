import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Chapter7GUI {

	private JFrame frame;
	private JTextField ln;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chapter7GUI window = new Chapter7GUI();
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
	public Chapter7GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 514, 316);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel fn = new JLabel("First name:");
		fn.setBounds(101, 39, 102, 14);
		fn.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 12));
		panel_1.add(fn);
		
		JTextField textField = new JTextField();
		textField.setBounds(159, 39, 185, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		ln = new JTextField();
		ln.setBounds(159, 84, 185, 34);
		panel_1.add(ln);
		ln.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 12));
		lblLastName.setBounds(101, 84, 102, 14);
		panel_1.add(lblLastName);
		
		JLabel c1m = new JLabel("Course 1 mark: ");
		c1m.setBounds(31, 162, 102, 14);
		panel_1.add(c1m);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 159, 41, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel c2m = new JLabel("Course 2 mark: ");
		c2m.setBounds(31, 187, 85, 14);
		panel_1.add(c2m);
		
		textField_2 = new JTextField();
		textField_2.setBounds(117, 185, 41, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String firstN = fn.getText();
				String lastN = ln.getText();
			}
		});
		btnNewButton.setBounds(214, 148, 102, 57);
		panel_1.add(btnNewButton);
	}
}
