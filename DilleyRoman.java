/*This code is written by Joshua Dilley
Date: 02/16/2026
Compiler: Apache NetBeans IDE 24
Assignment: Assignment Three 
Source Code: DilleyRoman.java
Action: create and test a class that converts a Roman numeral from a String
to an integer. The object will allow the user to create a Roman numeral. The 
roman numeral will be stored in to memory as a String. When prompted, the 
Roman numeral will be converted and stored as an integer. The class allows
the object to be displayed as a Roman numeral or an integer.
 */
package c307;

import java.util.Scanner;

class Roman
{
    private String numeral;
    private int decimal;

// *************************Default Constructor********************************    
    public Roman()
    {
        numeral = "";
    }

// **************************Parameterized Constructor*************************    
    public Roman(String X)
    {
        numeral = X;
        decimal = romanToDecimal(numeral);
    }
    
/* ****************************setNumeral*************************************
    Action: create an object in memory using a previously declared variable
    Parameter IN: String X
    return: nothing returned to the main
    Precondition: none
----------------------------------------------------------------------------*/
    public void setNumeral(String X)
    {
        numeral = X;
        decimal = romanToDecimal(numeral);
    }

/* ***************************getNumeral**************************************
    Action: return object as a Roman numeral
    Parameters: none
    return: numeral field is returned to the main
    Preconditions: none
-----------------------------------------------------------------------------*/    
    public String getNumeral()
    {
        return numeral;
    } 
    
/* *******************************getDecimal***********************************
    Action: return object as a decimal
    Parameters: none
    return: decimal field is returned to the main
    Preconditions: none
-----------------------------------------------------------------------------*/
    public int getDecimal()
    {
        return decimal;
    }

/* *****************************romanToDecimal********************************
    Action: converts numeral field to a decimal and stores in a seperate 
            memory address
    Parameters IN: Actual parameter numeral is passed in to the formal
                   parameter X
    return: returns sum to the calling constructor or method to be stored
            into the decimal field
    Precondition: object is instantiated with the parameterized constructor
                  or setNumeral method
-----------------------------------------------------------------------------*/    
    private int romanToDecimal(String X) 
    {
        int sum = 0;
        int[] Array = new int[X.length()];
        
        for(int i = 0; i < X.length(); ++i) //convert character to integer
        {
            if(X.charAt(i) == 'M')
                Array[i] = 1000;
            else if(X.charAt(i) == 'D')
                Array[i] = 500;
            else if(X.charAt(i) == 'C')
                Array[i] = 100;
            else if(X.charAt(i) == 'L')
                Array[i] = 50;
            else if(X.charAt(i) == 'X')
                Array[i] = 10;
            else if(X.charAt(i) == 'V')
                Array[i] = 5;
            else if(X.charAt(i) == 'I')
                Array[i] = 1;
        }    
        
        for(int j = 0; j < X.length()-1; ++j) //check order of numerals to 
        {                                     //determine arithmetic
            if(Array[j] >= Array[j+1])
                Array[j] = Array[j];          //no change, advance pointer
            else
            {
                Array[j] = Array[j] *(-1);  //prepare for subtraction
            }    
        }
        
        for(int y = 0; y < Array.length; ++y) //perform arithmetic
            sum = sum + Array[y];           
        
        return sum;
    }        
}        

public class DilleyRoman 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        String str;
        Roman Numeral = new Roman();
        char choice;
        
        System.out.println("Please enter a Roman numeral: ");
        
        str = Input.next();        
        
        Numeral.setNumeral(str.toUpperCase()); 
                
        do
        {
            System.out.println("How would you like to display the output?");
            System.out.println("R for Roman numeral. D for decimal form.");
        
            choice = Input.next().charAt(0);
            choice = Character.toUpperCase(choice);
            
            if(!(choice == 'R' || choice == 'D'))
            {    
                System.out.println("Input error.");
            }    
        
        }while(!(choice == 'R' || choice == 'D'));
        
        switch (choice)
        {
            case 'R':System.out.println(Numeral.getNumeral());break; 
            case 'D':System.out.println(Numeral.getDecimal());break;  
        }   
    }
    
}//end main

/* ****************************Program Output*********************************
MCXIV
----------------------------Trial 1: MCXIV-------------------------------------
Please enter a Roman numeral: 
mcxiv
How would you like to display the output?
R for Roman numeral. D for decimal form.
d
1114

Please enter a Roman numeral: 
mcxiv
How would you like to display the output?
R for Roman numeral. D for decimal form.
r
MCXIV

----------------------------Trial 2: CCCLIX------------------------------------
Please enter a Roman numeral: 
ccclix
How would you like to display the output?
R for Roman numeral. D for decimal form.
r
CCCLIX

Please enter a Roman numeral: 
ccclix
How would you like to display the output?
R for Roman numeral. D for decimal form.
d
359

----------------------------Trial 3: MDCLXVI-----------------------------------
Please enter a Roman numeral: 
mdclxvi
How would you like to display the output?
R for Roman numeral. D for decimal form.
r
MDCLXVI

Please enter a Roman numeral: 
mdclxvi
How would you like to display the output?
R for Roman numeral. D for decimal form.
d
1666

------------------------------------------------------------------------------*/
