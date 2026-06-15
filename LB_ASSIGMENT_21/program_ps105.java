// ------------------------------------------------------------
// Problem Statement:
// Write a program to print all numbers from 1 to N
// that are divisible by both 2 and 3.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    String printDivisibleBy2and3(int iNum)
    {
        String strResult = "";
        int iCount = 0;

        for(iCount = 1; iCount <= iNum; iCount++)
        {
            if((iCount % 2 == 0) && (iCount % 3 == 0))
            {
                strResult = strResult + iCount + " ";
            }
        }

        return strResult;
    }
}

class program_ps105
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        String strOutput = obj.printDivisibleBy2and3(30);

        System.out.println(strOutput);
    }
}