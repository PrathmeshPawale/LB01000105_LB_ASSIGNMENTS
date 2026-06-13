// ------------------------------------------------------------
// Problem Statement:
// Write a program to check whether a number is a perfect number or not.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    boolean checkPerfect(int iNum)
    {
        int iCount = 0;
        int iSum = 0;

        for(iCount = 1; iCount <= (iNum / 2); iCount++)
        {
            if(iNum % iCount == 0)
            {
                iSum = iSum + iCount;
            }
        }

        return (iSum == iNum);
    }
}

class program_ps98
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        boolean bResult = obj.checkPerfect(6);

        if(bResult == true)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not a Perfect Number");
        }
    }
}