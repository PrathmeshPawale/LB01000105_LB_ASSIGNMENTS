// Take an input number from user and check whether number is Perfect

import java.util.Scanner;

class NumberX
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        
        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program50
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;
        
        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        bRet = nobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println("It is a Perfect Number");
        }
        else
        {
            System.out.println("It is not Perfect Number");
        }
        sobj.close();
    }
}

// Time Complexity : O(N/2)
// Where N > = 0