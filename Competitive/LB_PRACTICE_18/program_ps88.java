// ------------------------------------------------------------
// Problem Statement:
// Write a program to print all odd numbers up to N.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    String printOddNumbers(int iNum)
    {
        String strResult = "";
        int iCount = 0;

        for(iCount = 1; iCount <= iNum; iCount = iCount + 2)
        {
            strResult = strResult + iCount + " ";
        }

        return strResult;
    }
}

class program_ps88
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        String strOutput = obj.printOddNumbers(20);

        System.out.println(strOutput);
    }
}