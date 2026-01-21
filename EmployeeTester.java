/*Name: Joshua Dilley
Primary Author: Dr. Olatunde Abiona
Date; 1/21/2026
Compiler: Apache Net Beans IDE 24
Source Code: EmployeeTester.java
Project: Example Program EmployeeTester
Action: This is a driver for the class Employee.
*/
package c307;

public class EmployeeTester 
{
    public static void main(String[] args) 
    {
        Employee Joe = new Employee("Joe", 30, "Fork lift operator");
        Employee Mike = new Employee("Mike", 27, "Electrician");
        
        Joe.Greet();
        Mike.Greet();
        
        Joe.Work();
        Mike.Work();
    }
}
/* *********************************Program Output*****************************
Good day, I am Joe.
Good day, I am Mike.
Joe is working as a/an Fork lift operator.
Mike is working as a/an Electrician.
*/