/*Name: Joshua Dilley 
Primary Author: Dr. Olatunde Abiona
Date: 1/21/2026
Compiler: Apache Net Beans IDE 24
Source Code: Employee.java
Project: Example Program Employee
Action: Creates a class for Employee objects
*/
package c307;

public class Employee 
{
    String Name;
    int Age;
    String Job;
//---------------------------Constructor---------------------------------------    
    public Employee (String EmpName, int EmpAge, String EmpJob)
    {
        Name = EmpName;
        Age = EmpAge;
        Job = EmpJob;
    }        
//---------------------------Methods-------------------------------------------
    public void Greet()
    {System.out.println("Good day, I am " + Name + ".");}
    
    public void Work()
    {System.out.println(Name + " is working as a/an " + Job + ".");}        
    
}

