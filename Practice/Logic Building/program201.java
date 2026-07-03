/*
    iRow = 4 
    iCol = 4
    (Variety in approach of logic than prev code)
    (better cause if-else get evaluated only 6 times in prev code it got evaluated 36 times)
    $   $   $   $
    #   #   #   #
    $   $   $   $
    #   #   #   #
*/
import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0;
        int j = 0;
        for(i = 1;i <= iRow; i++)
        {
            if(i % 2 == 0)
            {
                for(j = 1)
                {
                    System.out.print("#\t");
                }
                } 
            }
            else
            {
                for(j=1; j <= iCol; j++)
                {
                    System.out.print("#\t");
                } 
                System.out.println();
            }
        }
            
        }
    }
}
class program201
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);
    }
}