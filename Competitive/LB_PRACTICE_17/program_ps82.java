// ------------------------------------------------------------
// Problem Statement:
// Write a program to check whether a number is a palindrome or not.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    void checkPalindrome(int iNum)
    {
        int iNo = iNum;
        int iDigit = 0;
        int iReverse = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iReverse = (iReverse * 10) + iDigit;
            iNum = iNum / 10;
        }

        if(iNo == iReverse)
        {
            System.out.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Palindrome");
        }
    }
}

class program_ps82
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}