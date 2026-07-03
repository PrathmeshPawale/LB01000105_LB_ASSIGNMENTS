// ------------------------------------------------------------
// Problem Statement:
// Write a program to find the smallest digit in a given number.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    int findSmallestDigit(int iNum)
    {
        int iDigit = 0;
        int iMin = 9;

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            iNum = iNum / 10;
        }

        return iMin;
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int iResult = obj.findSmallestDigit(45872);

        System.out.println("Smallest digit is : " + iResult);
    }
}