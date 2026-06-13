// ------------------------------------------------------------
// Problem Statement:
// Write a program to find the largest digit in a given number.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    int findLargestDigit(int iNum)
    {
        int iDigit = 0;
        int iMax = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNum = iNum / 10;
        }

        return iMax;
    }
}

class program_ps99
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int iResult = obj.findLargestDigit(83429);

        System.out.println("Largest digit is : " + iResult);
    }
}