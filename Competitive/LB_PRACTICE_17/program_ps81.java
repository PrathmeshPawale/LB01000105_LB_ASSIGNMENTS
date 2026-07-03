// ------------------------------------------------------------
// Problem Statement:
// Write a program to find the sum of digits of a number.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    void sumOfDigits(int iNum)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Sum of digits is : " + iSum);
    }
}

class program_ps81
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}