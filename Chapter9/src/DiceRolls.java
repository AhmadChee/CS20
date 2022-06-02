/*

Program: DiceRolls.java      Last Date of this Revision: May 31, 2022

Purpose: Modify the DiceRolls application to roll three dice  

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 _

*/

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiceRolls {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceRolls window = new DiceRolls();
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
	public DiceRolls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 555, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Title = new JLabel("DiceRoll Application");//Title of GUI
		Title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		Title.setBounds(136, 11, 259, 40);
		frame.getContentPane().add(Title);
		
		
		
		JLabel di = new JLabel("Role #: ");
		di.setFont(new Font("Tahoma", Font.PLAIN, 15));
		di.setBounds(184, 76, 53, 14);
		frame.getContentPane().add(di);
		
		JLabel d = new JLabel("New label");//tells you the result of the roll
		d.setBounds(259, 78, 46, 14);
		frame.getContentPane().add(d);
		
		JButton rollbutton = new JButton("ROLL");//button to roll 
		rollbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				
				int first_op = (int)((10 - 0 + 1) * Math.random() + 0);//three random numbers generated to roll the dice 
				
				d.setText(Integer.toString(first_op));
				
			}
		});
		rollbutton.setBounds(136, 120, 259, 156);
		frame.getContentPane().add(rollbutton);
		
		
		
		
	}
}
