// ------------------------------------------------------------
// Problem Statement:
// Write a program to check whether a number is divisible
// by 5 and 11 or not.
//
// Time Complexity : O(1)
// ------------------------------------------------------------

class Logic
{
    boolean checkDivisible(int iNum)
    {
        return ((iNum % 5 == 0) && (iNum % 11 == 0));
    }
}

class program_ps93
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        boolean bResult = obj.checkDivisible(55);

        if(bResult == true)
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
    }
}