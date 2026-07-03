// Accept string from user and Count Capital and small letters in the string
import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int i = 0;
        int iCount = 0;
        
        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                iCount++;
            }
        }
        return iCount;
    }
    public int CountSmall(String str)
    {
        int i = 0;
        int iCount = 0;
        
        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class program271
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
    }
}