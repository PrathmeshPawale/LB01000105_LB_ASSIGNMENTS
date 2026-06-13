// ------------------------------------------------------------
// Problem Statement:
// Write a program to calculate the power of a number using loops.
//
// Time Complexity : O(N)
// Space Complexity : O(1)
// ------------------------------------------------------------

class Logic
{
    int calculatePower(int iBase, int iExponent)
    {
        int iCount = 0;
        int iResult = 1;

        for(iCount = 1; iCount <= iExponent; iCount++)
        {
            iResult = iResult * iBase;
        }

        return iResult;
    }
}

class program_ps95
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int iResult = obj.calculatePower(2, 5);

        System.out.println("Power is : " + iResult);
    }
}