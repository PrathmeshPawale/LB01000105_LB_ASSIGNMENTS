// ------------------------------------------------------------
// Problem Statement:
// Write a program to find the sum of even and odd digits
// separately in a number.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    int[] sumEvenOddDigits(int iNum)
    {
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            iNum = iNum / 10;
        }

        return new int[]{iEvenSum, iOddSum};
    }
}

class program_ps89
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int Arr[] = obj.sumEvenOddDigits(123456);

        System.out.println("Sum of Even Digits : " + Arr[0]);
        System.out.println("Sum of Odd Digits  : " + Arr[1]);
    }
}