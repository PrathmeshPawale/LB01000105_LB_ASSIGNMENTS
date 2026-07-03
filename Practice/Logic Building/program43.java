// Take an input number from user and accept it if it is divisible by 3 and 5

// Type 2 (Final Complete code acc to industrial standards)
import java.util.Scanner;

class program43
{
    public static boolean CheckDivisible(int iNo)
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet =  false;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        bRet = CheckDivisible(iValue);         

        if(bRet == true)
        {
            System.out.println("Number is divisible by 3 and 5");
        }
        else
        {
            System.out.println("Number is not divisible by 3 and 5");
        }
    }
}