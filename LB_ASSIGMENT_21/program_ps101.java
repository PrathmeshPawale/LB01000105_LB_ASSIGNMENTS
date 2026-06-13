// ------------------------------------------------------------
// Problem Statement:
// Write a program to calculate the product of digits of a number.
//
// Time Complexity : O(N)
// ------------------------------------------------------------

class Logic
{
    int productOfDigits(int iNum)
    {
        int iDigit = 0;
        int iProduct = 1;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iProduct = iProduct * iDigit;
            iNum = iNum / 10;
        }

        return iProduct;
    }
}

class program_ps101
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        int iResult = obj.productOfDigits(234);

        System.out.println("Product of digits is : " + iResult);
    }
}