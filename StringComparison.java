/*Name: Joshua Dilley
Date: 1/30/2026
Compiler: Apache NetBeans IDE 24
Source Code: StringComparison.java
Assignment: String Comparison
Action: Create a class for objects that will compare the length of two Strings. 
The objects will utilize a GUI that accepts two strings. The user then presses 
a button that will display the largest string in a text field in the dialog
box. The dialog box has an exit button to leave the program.
 */
package c307;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringComparison extends JFrame 
{
//* ***********************Fields**********************************************    
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    
    private JLabel StringOneL, StringTwoL, LargestStringL;
    private JTextField StringOneTF, StringTwoTF, LargestStringTF;
    private JButton FindLargestStringB, ExitB;
    
    private FindLargestStringButtonHandler flsHandler;
    private ExitButtonHandler ebHandler;
    
//* *************************Constructor***************************************
    public StringComparison()
    {
        setTitle("String Comparison");
        
        StringOneL = new JLabel("Enter String one: ", 
                SwingConstants.RIGHT);
        StringTwoL = new JLabel("Enter String two: ",
                SwingConstants.RIGHT);
        LargestStringL = new JLabel("Display larger String: ", 
                SwingConstants.RIGHT);
        
        StringOneTF = new JTextField(10);
        StringTwoTF = new JTextField(10);
        LargestStringTF = new JTextField(10);
        
        FindLargestStringB = new JButton("Find larger String");
        flsHandler = new FindLargestStringButtonHandler();
        FindLargestStringB.addActionListener(flsHandler);
        
        ExitB = new JButton("Exit");
        ebHandler = new ExitButtonHandler();
        ExitB.addActionListener(ebHandler);
        
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4,2));
        
        pane.add(StringOneL);
        pane.add(StringOneTF);
        pane.add(StringTwoL);
        pane.add(StringTwoTF);
        pane.add(LargestStringL);
        pane.add(LargestStringTF);
        pane.add(FindLargestStringB);
        pane.add(ExitB);
        
        setSize(WIDTH,HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
/* ***************FindLargestStringButtonHandler*******************************
    Action: after entering two Strings, the button will determine which one 
            has the most characters.
    Parameters IN: Str1 and Str2 hold the entries of StringOneTF and 
                   StringTwoTF, respctively
    Parameters OUT: The String with the most characters is output by the 
                    LargestStringTF. If the Strings are the same length, a
                    message indicating equal amount of characters is displayed.
    return: nothing is returned to the main
    Preconditions: none
-----------------------------------------------------------------------------*/    
    private class FindLargestStringButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String Str1, Str2;
            
            Str1 = StringOneTF.getText();
            Str2 = StringTwoTF.getText();
            
            if(Str1.length() > Str2.length())
                LargestStringTF.setText(Str1);
            else if(Str1.length() == Str2.length())
                LargestStringTF.setText("The Strings are the same length. ");
            else
                LargestStringTF.setText(Str2);
        }        
    }
/* *******************ExitButtonHandler****************************************
    Author: Dr. Olatunde Abiona
    Action: closes out program when pressed
    Parameters: none
    return: nothing is returned to the main
    Preconditions: none    
-----------------------------------------------------------------------------*/
    private class ExitButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }        
    }        
    public static void main(String[] args) 
    {StringComparison strComp = new StringComparison();}

}
