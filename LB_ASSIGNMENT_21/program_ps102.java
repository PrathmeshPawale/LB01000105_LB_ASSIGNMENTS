// ------------------------------------------------------------
// Problem Statement:
// Write a program to count how many even and odd numbers
// are present between 1 and N.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    int[] countEvenOddRange(int iNum)
    {
        int iCount = 0;
        int iEvenCount = 0;
        int iOddCount = 0;

        for(iCount = 1; iCount <= iNum; iCount++)
        {
            if(iCount % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }

        return new int[]{iEvenCount, iOddCount};
    }
}

class program_ps102
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int Arr[] = obj.countEvenOddRange(50);

        System.out.println("Even Count : " + Arr[0]);
        System.out.println("Odd Count  : " + Arr[1]);
    }
}