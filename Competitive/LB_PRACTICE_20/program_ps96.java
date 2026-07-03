// ------------------------------------------------------------
// Problem Statement:
// Write a program to find the sum of all even numbers up to N.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    int sumEvenNumbers(int iNum)
    {
        int iCount = 0;
        int iSum = 0;

        for(iCount = 2; iCount <= iNum; iCount = iCount + 2)
        {
            iSum = iSum + iCount;
        }

        return iSum;
    }
}

class program_ps96
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int iResult = obj.sumEvenNumbers(10);

        System.out.println("Sum of even numbers is : " + iResult);
    }
}