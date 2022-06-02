/*

Program: AddG.java      Last Date of this Revision: May 24, 2022

Purpose: The Adder game prompts a player for the answer
to an additional problem. The Adder game creates a problem
from two randomly selected integers between 0 and 20. 
Adder allows the player three tries to enter a correct
answer. If the correct answer is entered on the first try, 
the player is awarded 5 points. If the correct answer is entered 
on the second try, 3 points are awarded. 
If answer is correct on third try, 1 point is awarded. If the 
answer is still not correct after 3 tries, no poiunts will be given. 

Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 _

*/



import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.Random;

public class AddG {

        private JFrame frame;
        private JTextField tf1;
        private JTextField tf2;
        private JTextField tf3;
        private int score,d1,d2,count;
        private JTextField tf4;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        AddG window = new AddG();
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
        public AddG() {
                initialize();
        }
       
        private void setExp()
        {
                Random rand=new Random();
                d1=rand.nextInt(20);
                d2=rand.nextInt(20);
                tf1.setText(d1+"+"+d2);
        }

        /**
         * Initialize the contents of the frame.
         */
        private void initialize() {
                score=0;
                count=0;
               
                frame = new JFrame();
                frame.setBounds(100, 100, 510, 319);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().setLayout(null);
               
                JLabel lblCalculateExpression = new JLabel("Calculate Expression:");
                lblCalculateExpression.setFont(new Font("Dialog", Font.BOLD, 16));
                lblCalculateExpression.setBounds(55, 70, 207, 15);
                frame.getContentPane().add(lblCalculateExpression);
               
                tf1 = new JTextField();
                tf1.setEditable(false);
                tf1.setBounds(271, 66, 133, 25);
                frame.getContentPane().add(tf1);
                tf1.setColumns(10);
               
                JLabel lblAnswer = new JLabel("Answer:");
                lblAnswer.setFont(new Font("Dialog", Font.BOLD, 16));
                lblAnswer.setBounds(171, 131, 81, 15);
                frame.getContentPane().add(lblAnswer);
               
                JLabel lblYourScore = new JLabel("Your Score:");
                lblYourScore.setFont(new Font("Dialog", Font.BOLD, 16));
                lblYourScore.setBounds(155, 220, 107, 25);
                frame.getContentPane().add(lblYourScore);
               
                tf3 = new JTextField();
                tf3.setEditable(false);
                tf3.setBounds(271, 221, 114, 25);
                frame.getContentPane().add(tf3);
                tf3.setColumns(10);
                
                tf4 = new JTextField();
                tf4.setEditable(false);
                tf4.setBounds(124, 171, 249, 26);
                frame.getContentPane().add(tf4);
                tf4.setColumns(10);
               
                setExp();
                tf2 = new JTextField();
                tf2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                if(Integer.parseInt(tf2.getText())!=999)
                                {
                                        count++;
                                        if(count!=3)
                                        {
                                                if((d1+d2)==Integer.parseInt(tf2.getText()))
                                                {                                                      
                                                        if(count==1)
                                                                score+=5;
                                                        else if(count==2)
                                                                score+=3;
                                                        else
                                                                score+=1;
                                                        tf4.setText("Right Answer.");
                                                        setExp();
                                                }
                                                else
                                                {
                                                        tf4.setText("Wrong answer.Enter another Answer.");
                                                }
                                        }
                                        else {
                                                count=0;
                                                setExp();
                                        }
                                        tf2.setText("");
                                }        
                                else {
                                        tf4.setText("Exiting Game");
                                        tf3.setText(String.valueOf(score));
                                        tf2.setEnabled(false);
                                }
                        }
                });
                tf2.setBounds(271, 121, 114, 25);
                frame.getContentPane().add(tf2);
                tf2.setColumns(10);    
                
                
                
				

        }
}

