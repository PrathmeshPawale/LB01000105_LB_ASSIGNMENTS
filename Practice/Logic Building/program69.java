// Take an input number from user and check whether number it is Prime

import java.util.Scanner;

class NumberX
{
    public boolean CheckPrime(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;

        for(bFlag = true, iCnt = 2; iCnt <= (iNo / 2); iCnt++)      // Recommended ki false set krun true karne
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;                // Not Recommended
    }
}

class program68
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;
        
        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        bRet = nobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("It is a Prime Number");
        }
        else
        {
            System.out.println("It is not Prime Number");
        }
        sobj.close();
    }
}

// Time Complexity : O(N/2)
// Where N > = 0