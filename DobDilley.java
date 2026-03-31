/*Name: This code is written by Joshua Dilley
Date: 3/30/2026
Compiler: Apache NetBeans IDE 24
Source Code: DobDilley.java
Action: The user is prompted to enter his or her birthday. The code will check 
for input errors concerning day, month, and year and throw an exception 
accordingly.
 */
package c307;
import java.util.*;
public class DobDilley 
{
    static Scanner Input = new Scanner(System.in).useDelimiter("[\\s,-]");
    
    public static void main(String[] args) 
    {
        int day = 0, month = 0, year = 0;        
        
        String monthStr = " "; 
        String yearStr;
        
        try
        {    
            System.out.print("Please enter your birthday! MM-DD-YYYY format: ");
        
            month = Input.nextInt();
            day = Input.nextInt();
            year = Input.nextInt();
            
            yearStr = String.valueOf(year);
            
            if(yearStr.length() < 4 || yearStr.length() > 4)
                throw new InvalidYearException(); //assumes birthday in the 
                                                  //last 1000 years or so
            if(month < 1 || month > 12)
                throw new InvalidMonthException();               
            
            switch(month)
            {    
                case 1: monthStr = "January";
                if(day < 1 || day > 31)                    
                    throw new InvalidDayException();break;
                    
                case 2: monthStr = "February";
                if(day < 1 || day > 28)
                    if(day == 29)  //handle Leap years
                        if(year % 4 != 0) 
                            throw new InvalidDayException();
                        else if(year % 4 == 0 && year % 100 == 0 
                                     && year % 400 != 0)
                            throw new InvalidDayException();
                        else
                            break;
                else
                    throw new InvalidDayException();break;
                
                case 3: monthStr = "March";
                if(day < 1 || day > 31)
                    throw new InvalidDayException();break;
                    
                case 4: monthStr = "April";
                if(day < 1 || day > 30)
                    throw new InvalidDayException();break;
                    
                case 5: monthStr = "May";
                if(day < 1 || day > 31)
                    throw new InvalidDayException();break;
                    
                case 6: monthStr = "June";
                if(day < 1 || day > 30)
                    throw new InvalidDayException();break;
                    
                case 7: monthStr = "July";
                if(day < 1|| day > 31)
                    throw new InvalidDayException();break;
                    
                case 8: monthStr = "August";
                if(day < 1 || day > 31)
                    throw new InvalidDayException();break;
                    
                case 9: monthStr = "September";
                if(day < 1 || day > 30)
                    throw new InvalidDayException();break;
                    
                case 10: monthStr = "October";
                if(day < 1 || day > 31)
                    throw new InvalidDayException();break;
                    
                case 11: monthStr = "November";
                if(day < 1 || day > 30)
                    throw new InvalidDayException();break;
                    
                case 12: monthStr = "December";
                if(day < 1 || day > 31)
                    throw new InvalidDayException();break;
                    
                default:System.out.println("Invalid. "); //not sure that this                         
            }                                            //is necessary                     
       
        System.out.println(monthStr + " " + day + ", " + year);

        }
        catch(InvalidMonthException imE)
        {
            System.out.println(imE.toString());
        }
        catch(InvalidDayException idE)
        {
            System.out.println(idE.toString());
        }
        catch(InvalidYearException iyE)
        {
            System.out.println(iyE.toString());
        }    
        catch(InputMismatchException inputmE)
        {
            System.out.println(inputmE.toString());
        }    
    }//end main
}
/* **************************Program Output************************************
Test general output:

Please enter your birthday! MM-DD-YYYY format: 8-27-1980
August 27, 1980

Test InvalidDayException:
Please enter your birthday! MM-DD-YYYY format: 1-32-1980
c307.InvalidDayException: Invalid day for this month.

Test InvalidMonthException:
Please enter your birthday! MM-DD-YYYY format: 13-9-1980
c307.InvalidMonthException: Invalid month entry.

Test InvalidYearException:
Please enter your birthday! MM-DD-YYYY format: 07-19-19800
c307.InvalidYearException: Invalid entry for the year.

Test InputMismatchException Trial 1:
Please enter your birthday! MM-DD-YYYY format: h-09-1980
java.util.InputMismatchException

Trial 2: 
Please enter your birthday! MM-DD-YYYY format: 07-t-1980
java.util.InputMismatchException

Trial 3:
Please enter your birthday! MM-DD-YYYY format: 07-09-W
java.util.InputMismatchException

Test Leap Year: Trial 1
Please enter your birthday! MM-DD-YYYY format: 02-29-2024
February 29, 2024

Trial 2:
Please enter your birthday! MM-DD-YYYY format: 02-29-2022
c307.InvalidDayException: Invalid day for this month.

Trial 3: 
Please enter your birthday! MM-DD-YYYY format: 02-29-3200
February 29, 3200

Trial 4: 
Please enter your birthday! MM-DD-YYYY format: 02-29-3000 //divisible by 4 and
c307.InvalidDayException: Invalid day for this month.     //100, but not 400
-----------------------------------------------------------------------------*/