// ------------------------------------------------------------
// Problem Statement:
// Write a program to print each digit of a number separately.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    String printDigits(int iNum)
    {
        int iDigit = 0;
        String strResult = "";

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            strResult = strResult + iDigit + "\n";
            iNum = iNum / 10;
        }

        return strResult;
    }
}

class program_ps94
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        String strOutput = obj.printDigits(9876);

        System.out.println(strOutput);
    }
}