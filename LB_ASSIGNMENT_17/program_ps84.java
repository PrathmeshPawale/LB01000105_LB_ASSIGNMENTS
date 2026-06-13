// ------------------------------------------------------------
// Problem Statement:
// Write a program to find the minimum of three numbers.
//
// Time Complexity : O(1)
// ------------------------------------------------------------

class Logic
{
    void findMin(int iNo1, int iNo2, int iNo3)
    {
        int iMin = iNo1;

        if(iNo2 < iMin)
        {
            iMin = iNo2;
        }

        if(iNo3 < iMin)
        {
            iMin = iNo3;
        }

        System.out.println("Minimum number is : " + iMin);
    }
}

class program_ps84
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3, 7, 2);
    }
}