//task7
public class Fruit{
  private boolean formalin = false;
  private String name = "";
  public Fruit(boolean formalin, String name){
    this.formalin = formalin;
    this.name = name; 
  }   
  public String getName(){
    return name;
  }
  public boolean hasFormalin(){
    return formalin;
  }
}
