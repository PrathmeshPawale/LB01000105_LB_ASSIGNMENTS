// ------------------------------------------------------------
// Problem Statement:
// Write a program to find the maximum of two numbers.
//
// Time Complexity : O(1)
// ------------------------------------------------------------

class Logic
{
    void findMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println("Maximum number is : " + iNo1);
        }
        else
        {
            System.out.println("Maximum number is : " + iNo2);
        }
    }
}

class program_ps83
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}