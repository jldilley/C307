/*This code is written by Joshua Dilley
Date: 2/6/2026
Compiler: Apache NetBeans IDE 24
Source Code: DilleySquareRoot.java
Assignment: Square Root program
Action: Write a program that features the Math.sqrt() method to calculate the 
square root of the first 25 positive integers. Display the number along with
its square root.
 */
package c307;


public class DilleySquareRoot 
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 25; i++)
            System.out.println("The squre root of " + i + " is " + 
                    Math.sqrt(i));
    }
    
}
/* *********************Program Output*****************************************
The squre root of 1 is 1.0
The squre root of 2 is 1.4142135623730951
The squre root of 3 is 1.7320508075688772
The squre root of 4 is 2.0
The squre root of 5 is 2.23606797749979
The squre root of 6 is 2.449489742783178
The squre root of 7 is 2.6457513110645907
The squre root of 8 is 2.8284271247461903
The squre root of 9 is 3.0
The squre root of 10 is 3.1622776601683795
The squre root of 11 is 3.3166247903554
The squre root of 12 is 3.4641016151377544
The squre root of 13 is 3.605551275463989
The squre root of 14 is 3.7416573867739413
The squre root of 15 is 3.872983346207417
The squre root of 16 is 4.0
The squre root of 17 is 4.123105625617661
The squre root of 18 is 4.242640687119285
The squre root of 19 is 4.358898943540674
The squre root of 20 is 4.47213595499958
The squre root of 21 is 4.58257569495584
The squre root of 22 is 4.69041575982343
The squre root of 23 is 4.795831523312719
The squre root of 24 is 4.898979485566356
The squre root of 25 is 5.0
*/
