//task6
public class Assignment
{
 public int tasks;
 public String difficulty;
 public boolean submission=false;
 public void printDetails()
 {
   System.out.println("Number of tasks: "+tasks);
   System.out.println("Difficulty level: "+difficulty);
   System.out.println("Submission required: "+submission);
 }
 public String makeOptional()
 {
   String returnstr;
   if(submission==false)
   {
    returnstr="Submission is already not required";
   }
   else
   {
    returnstr="Assignment will not require submission";
    submission=false;
   }
 return returnstr;
 }
}
 