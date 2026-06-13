// ------------------------------------------------------------
// Problem Statement:
// Write a program to display all factors of a given number.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    String displayFactors(int iNum)
    {
        String strResult = "";
        int iCount = 0;

        for(iCount = 1; iCount <= iNum; iCount++)
        {
            if(iNum % iCount == 0)
            {
                strResult = strResult + iCount + " ";
            }
        }

        return strResult;
    }
}

class program_ps103
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        String strOutput = obj.displayFactors(12);

        System.out.println(strOutput);
    }
}