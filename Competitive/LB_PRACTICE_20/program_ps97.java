// ------------------------------------------------------------
// Problem Statement:
// Write a program to print numbers from N down to 1 in reverse order.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    String printReverse(int iNum)
    {
        String strResult = "";
        int iCount = 0;

        for(iCount = iNum; iCount >= 1; iCount--)
        {
            strResult = strResult + iCount + " ";
        }

        return strResult;
    }
}

class program_ps97
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        String strOutput = obj.printReverse(10);

        System.out.println(strOutput);
    }
}