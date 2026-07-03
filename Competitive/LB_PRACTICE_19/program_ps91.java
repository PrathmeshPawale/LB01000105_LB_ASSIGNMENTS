// ------------------------------------------------------------
// Problem Statement:
// Write a program to check whether a given year is a leap year or not.
//
// Time Complexity : O(1)
// ------------------------------------------------------------

class Logic
{
    boolean checkLeapYear(int iYear)
    {
        if((iYear % 400 == 0) || ((iYear % 4 == 0) && (iYear % 100 != 0)))
        {
            return true;
        }

        return false;
    }
}

class program_ps91
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        boolean bResult = obj.checkLeapYear(2024);

        if(bResult == true)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}