// ------------------------------------------------------------
// Problem Statement:
// Write a program which displays ASCII table.
// Table contains Symbol, Decimal, Hexadecimal and Octal
// representation of every member from 0 to 255.
// ------------------------------------------------------------

class DisplayX
{
    public void DisplayASCII()
    {
        int i = 0;

        for(i = 0; i <= 255; i++)
        {
            System.out.printf("%c\t%d\t%X\t%o\n",
                    (char)i, i, i, i);
        }
    }
}

class program_ps146
{
    public static void main(String A[])
    {
        DisplayX dobj = new DisplayX();

        dobj.DisplayASCII();
    }
}