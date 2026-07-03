// Accept string from user and Count Capital letters ,small letters ,digits ,spaces,special characters in the string 
// Covers almost all aspects of string wrt to ascii table
import java.util.*;
import Marvellous.StringX;

class program275
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;

        int iRet = 0;

        StringX strobj = new StringX();

        System.out.println("Enter string : ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);

        System.out.println("Number of Capital letters is :"+iRet);

        iRet = strobj.CountSmall(data);

        System.out.println("Number of Small letters is :"+iRet);

        iRet = strobj.CountDigits(data);

        System.out.println("Number of Digits are :"+iRet);

        iRet = strobj.CountSpace(data);

        System.out.println("Number of white spaces are :"+iRet);

        iRet = strobj.CountSpecial(data);

        System.out.println("Number of special symbols are :"+iRet);
    }
}