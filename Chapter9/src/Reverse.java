/*

Program: Reverse.java      Last Date of this Revision: May 31, 2022

Purpose: Create a Reverse application that stores the number corresponding 
to the element's index in an integer array of 10 elements. For example, the 
second element, which has index 1, should store one. 


Author: Ahmad Cheema, 
School: CHHS
Course: Computer Science  20
 _

*/

import javax.swing.*;
import java.awt.*;

public class Reverse {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Countdown");//frames name is "Countdown"
        int[] arr = new int[10];//Array has been initialized

        for (int i = 0; i < arr.length; ++i) {//adder for the countdown
            arr[i] = i;
        }
        JTextArea reverseListArea = new JTextArea();//GUI creation 
        reverseListArea.setEditable(false);//GUI creation 

        for (int i = arr.length - 1; i >= 0; --i) {//count down creator using array 
            reverseListArea.append("  " + arr[i] + "\n");//display message of count down
        }
        
        frame.add(reverseListArea);//GUI frame

        frame.setSize(250, 250);//GUI size 
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
