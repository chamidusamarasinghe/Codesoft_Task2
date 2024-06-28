import java.util.Scanner;
public class StudentGradeCalculator 
{
    public static void main(String[] args) 
    {
        
        Scanner sc =new Scanner(System.in);
        
        int total_subjets,sub_marks,sum =0;
        String grade=" ";

        System.out.print("How many numbers Do you have? ");
        total_subjets = sc.nextInt();

        for(int i=1; i <= total_subjets; i++)
        {
            System.out.print("enter yoyr Subjets marks : ");
            sub_marks = sc.nextInt();
            sum+=sub_marks;
        }

        double average = sum / total_subjets;
        if(average < 100 && average >= 85 )
        {
            grade ="A+";
        }
        else if(average < 85 && average >= 80)
        {
            grade ="A";
        }
        else if(average < 80 && average >= 75)
        {
            grade ="A-";
        }
        else if(average < 75 && average >= 70)
        {
            grade ="B+";
        }
        else if(average < 70 && average >= 65)
        {
            grade ="B";
        }
        else if(average < 65 && average >= 60)
        {
            grade ="B-";
        }
        else if(average < 60 && average >= 55)
        {
            grade ="C+";
        }
        else if(average < 55 && average >= 50)
        {
            grade ="C";
        }
        else if(average < 50 && average >= 45)
        {
            grade ="C-";
        }
        else if(average < 45 && average >= 40)
        {
            grade ="D+";
        }
        else if(average < 40 && average >= 35)
        {
            grade ="D-";
        }
        else if(average < 35)
        {
            grade ="E2";
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Your Total Marks : "+sum );
        System.out.println("Average of the Marks : "+average+"%");
        System.out.println("Your Marks Grade : "+grade);

    }
}
