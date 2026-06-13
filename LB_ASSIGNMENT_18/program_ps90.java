// ------------------------------------------------------------
// Problem Statement:
// Write a program to check whether a number is positive,
// negative, or zero.
//
// Time Complexity : O(1)
// ------------------------------------------------------------

class Logic
{
    int checkSign(int iNum)
    {
        if(iNum > 0)
        {
            return 1;
        }
        else if(iNum < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

class program_ps90
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int iResult = obj.checkSign(-8);

        if(iResult == 1)
        {
            System.out.println("Number is Positive");
        }
        else if(iResult == -1)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}