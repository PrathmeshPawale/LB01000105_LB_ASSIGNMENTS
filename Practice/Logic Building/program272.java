// Accept string from user and Count Capital and small letters in the string 
// Converting into character array
import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int i = 0, iCount = 0;
        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCount++;
            }
        }
        return iCount;
    }
    public int CountSmall(String str)
    {
        int i = 0, iCount = 0;
        
        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class program272
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