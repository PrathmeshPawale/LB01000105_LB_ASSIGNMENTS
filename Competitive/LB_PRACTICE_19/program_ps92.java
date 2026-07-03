// ------------------------------------------------------------
// Problem Statement:
// Write a program to display the grade of a student based on marks.
//
// Time Complexity : O(1)
// ------------------------------------------------------------

class Logic
{
    String displayGrade(int iMarks)
    {
        if(iMarks >= 75)
        {
            return "Distinction";
        }
        else if(iMarks >= 65)
        {
            return "First Class";
        }
        else if(iMarks >= 55)
        {
            return "Second Class";
        }
        else if(iMarks >= 40)
        {
            return "Pass Class";
        }
        else
        {
            return "Fail";
        }
    }
}

class program_ps92
{
    public static void main(String args[])
    {
        Logic obj = new Logic();

        String strResult = obj.displayGrade(82);

        System.out.println("Grade : " + strResult);
    }
}