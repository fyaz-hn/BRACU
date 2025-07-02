//task1 and continued
public class Song
{
 public Song next;
 public String song,art;
 public int lgth;
 public static int count;
 public Song(String song,String art,int lgth)
 {
  this.song=song;
  this.art=art;
  this.lgth=lgth;
 }
 public void songInfo()
 { 
   System.out.println("Title: "+song);
   System.out.println("Artist: "+art);
   System.out.println("Length: "+lgth+" minutes");
   if(next!=null)
   {
    System.out.println("Song- "+(++count));
    next.songInfo();
   }
 } 
}