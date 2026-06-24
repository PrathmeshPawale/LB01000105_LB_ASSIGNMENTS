// ------------------------------------------------------------
// Problem Statement:
// Accept division of student from user and display exam timing.
//
// A -> 7.00 AM
// B -> 8.30 AM
// C -> 9.20 AM
// D -> 10.30 AM
//
// Application should be case insensitive.
// ------------------------------------------------------------

import java.util.*;

class School
{
    public void DisplaySchedule(char chDiv)
    {
        if(chDiv == 'A' || chDiv == 'a')
        {
            System.out.println("Your exam at 7.00 AM");
        }
        else if(chDiv == 'B' || chDiv == 'b')
        {
            System.out.println("Your exam at 8.30 AM");
        }
        else if(chDiv == 'C' || chDiv == 'c')
        {
            System.out.println("Your exam at 9.20 AM");
        }
        else if(chDiv == 'D' || chDiv == 'd')
        {
            System.out.println("Your exam at 10.30 AM");
        }
        else
        {
            System.out.println("Invalid Division");
        }
    }
}

class program_ps145
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        char cValue = '\0';

        System.out.println("Enter your division :");

        cValue = sobj.next().charAt(0);

        School sobj1 = new School();

        sobj1.DisplaySchedule(cValue);
    }
}