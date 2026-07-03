// ------------------------------------------------------------
// Problem Statement:
// Write a program to print all even numbers up to N.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    String printEvenNumbers(int iNum)
    {
        String strResult = "";
        int iCount = 0;

        for(iCount = 2; iCount <= iNum; iCount = iCount + 2)
        {
            strResult = strResult + iCount + " ";
        }
        return strResult;
    }
}

class program_ps87
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        String strOutput = obj.printEvenNumbers(20);

        System.out.println(strOutput);
    }
}