// ------------------------------------------------------------
// Problem Statement:
// Write a program to count total number of factors
// of a given number.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    int countFactors(int iNum)
    {
        int iCount = 0;
        int iFactorCount = 0;

        for(iCount = 1; iCount <= iNum; iCount++)
        {
            if(iNum % iCount == 0)
            {
                iFactorCount++;
            }
        }

        return iFactorCount;
    }
}

class program_ps104
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int iResult = obj.countFactors(20);

        System.out.println("Total factors are : " + iResult);
    }
}