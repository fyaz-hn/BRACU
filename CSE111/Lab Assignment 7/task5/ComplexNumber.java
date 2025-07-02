//task5code
public class ComplexNumber extends RealNumber
{
 public double img;
 public ComplexNumber()
 {
  super(1.0);
  img=1.0;
 }
 public ComplexNumber(double real,double img)
 {
  super(real);
  this.img=img;
 }  
 public String toString()
 {
   return "RealPart: " + realValue+"\nImaginaryPart: "+img;
  }
}