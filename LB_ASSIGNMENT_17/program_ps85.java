// ------------------------------------------------------------
// Problem Statement:
// Write a program to print the multiplication table of a number.
//
// Time Complexity : O(1)
// ------------------------------------------------------------

class Logic
{
    void printTable(int iNum)
    {
        int iCount = 0;

        for(iCount = 1; iCount <= 10; iCount++)
        {
            System.out.println(iNum + " x " + iCount + " = " + (iNum * iCount));
        }
    }
}

class program_ps85
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}