//task1
public class Student
{
 public String name,prog;
 public Student(String name,String prog)
 {
  this.name=name;
  this.prog=prog;
 }
 public void updateName(String name)
 {
  this.name=name; 
 }
 public String accessProgram()
 {
  return prog;
 }
 public void updateProgram(String up)
 {
  prog=up;
 }
}