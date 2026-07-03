// ------------------------------------------------------------
// Problem Statement:
// Write a program to check whether a number is prime or not.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    boolean checkPrime(int iNum)
    {
        int iCount = 0;

        if(iNum <= 1)
        {
            return false;
        }

        for(iCount = 2; iCount < iNum; iCount++)
        {
            if(iNum % iCount == 0)
            {
                return false;
            }
        }

        return true;
    }
}

class program_ps86
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        boolean bRet = obj.checkPrime(11);

        if(bRet == true)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
    }
}