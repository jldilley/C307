/*This code is written by Joshua Dilley
Date: 3/6/2026
Compiler: Apache NetBeans IDE 24
Source Code: DilleyVotes.java
Action: a program that uses arrays to tally and display votes.
 */
package c307;

import java.util.Scanner;
public class DilleyVotes 
{
    private static int totalVotes = 0;
    private static int winningVotes = 0;
    private static int winningIndex = 0;
    
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        String[] lastNames = new String[5];
        int[] votes = new int[5];
        double[] percentages = new double[5];        
        
        System.out.println("Please enter the last names of the candidates: ");
        
        for(int i = 0; i < lastNames.length; ++i) //fill lastNames[]
        {
            lastNames[i] = Input.next();
        }
        
        System.out.println("Please enter the number of votes for each "
                + "candidate");
        
        for(int j = 0; j < votes.length; ++j) //fill votes[]
        {
            votes[j] = Input.nextInt();
            totalVotes = totalVotes + votes[j];
        }
        
        for(int k = 0; k < percentages.length; ++k) //fill percentages[]
            percentages[k] = votes[k]/(float)totalVotes;
 
        
        System.out.println("Candidate       " + "Votes Received       " 
                + "% of Total Votes");
        
        for(int m = 0; m < lastNames.length; ++m) //display table
        {    
            System.out.printf("%-20s %-20d %.2f", 
                    lastNames[m], votes[m], (percentages[m]*100));
            System.out.println();
        }
        

        for(int p = 0; p < votes.length; ++p) //search routine
        {
            if(winningVotes < votes[p])
            {    
                winningVotes = votes[p]; //update winning number of votes
                winningIndex = p; //index associated with winning number of votes
            }    
        }    
        
        System.out.printf("%-20s %-20d", "Total", totalVotes);
        System.out.println();
        System.out.println("The Winner of the Election is " 
                + lastNames[winningIndex] + ".");
        System.out.println();

    }// end main
}
/* ******************************Program Output********************************
-------------------Professor Abiona's trial:-----------------------------------
Please enter the last names of the candidates: 
Johnson
Miller
Duffy
Robinson
Ashtony
Please enter the number of votes for each candidate
5000
4000
6000
2500
1800
Candidate       Votes received       % of Total Votes
Johnson              5000                 25.91
Miller               4000                 20.73
Duffy                6000                 31.09
Robinson             2500                 12.95
Ashtony              1800                 9.33
Total                19300               
The Winner of the Election is Duffy.

---------------------Trial 2: index 4 wins-------------------------------------
Please enter the last names of the candidates: 
A
B
C
D
E
Please enter the number of votes for each candidate
1
2
3
4
5
Candidate       Votes Received       % of Total Votes
A                    1                    6.67
B                    2                    13.33
C                    3                    20.00
D                    4                    26.67
E                    5                    33.33
Total                15                  
The Winner of the Election is E.

---------------------------Trial 3: index 3 wins-------------------------------
Please enter the last names of the candidates: 
A
B
C
D
E
Please enter the number of votes for each candidate
2
3
4
5
1
Candidate       Votes Received       % of Total Votes
A                    2                    13.33
B                    3                    20.00
C                    4                    26.67
D                    5                    33.33
E                    1                    6.67
Total                15                  
The Winner of the Election is D.

--------------------------Trial 4: index 2 wins--------------------------------
Please enter the last names of the candidates: 
A
B
C
D
E
Please enter the number of votes for each candidate
3
4
5
1
2
Candidate       Votes Received       % of Total Votes
A                    3                    20.00
B                    4                    26.67
C                    5                    33.33
D                    1                    6.67
E                    2                    13.33
Total                15                  
The Winner of the Election is C.

-----------------------------Trial 5: index 1 wins-----------------------------
Please enter the last names of the candidates: 
A
B
C
D
E
Please enter the number of votes for each candidate
4
5
1
2
3
Candidate       Votes Received       % of Total Votes
A                    4                    26.67
B                    5                    33.33
C                    1                    6.67
D                    2                    13.33
E                    3                    20.00
Total                15                  
The Winner of the Election is B.

-------------------------Trial 6: index 0 wins---------------------------------
Please enter the last names of the candidates: 
A
B
C
D
E
Please enter the number of votes for each candidate
5
1
2
3
4
Candidate       Votes Received       % of Total Votes
A                    5                    33.33
B                    1                    6.67
C                    2                    13.33
D                    3                    20.00
E                    4                    26.67
Total                15                  
The Winner of the Election is A.

-----------------------------------------------------------------------------*/
