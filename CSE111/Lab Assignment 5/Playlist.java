//task2 and continued
public class Playlist
{
 public String name;
 public int scount,total;
 public Song start,current,temp;
 public Playlist(String s)
 {
  name=s;
  System.out.println(name+" is created.");
 }
 public void info()
 {
  System.out.println(name+" has the following songs:");
  if(scount==0)
  {
   System.out.println("No songs in "+name+".");
  }
  else
  {
    start.count=0;
    System.out.println("Song- "+(++start.count));
    start.songInfo();
   }
  }
 public void addSong(Song s)
 {
   if(start==null)
   {
    start=s;
    current=start;
   }
   else if(current.next==null)
   {
    current.next=s;
    current=current.next;
   }
   scount++;
   System.out.println(s.song+" added to "+name+".");
 }
 //task5
 public void addSong(Song s,int a)
 {
  if(a<=scount)
  {
   if(a==0)
   {
    temp=start;
    start=s;
    start.next=temp;
   }
   else if(a==scount)
   {
    current=start;
    for(int i=0;i<scount;i++)
    {
     if (i==scount-1)
     {
      current.next=s;
     }
     current=current.next;
    }
   }
   else
   {
    current=start;
    for(int i=0;i<a;i++)
    {
     if(current.next!=null)
     {
      temp=current.next;
      if(i==a-1)
      {
      current.next=s;
      current=current.next;
      current.next=temp;
      }
      current=current.next;
     }
    }
   }
   scount++;
   System.out.println(s.song+" added to "+name+".");
  }
  else
  {
   System.out.println("Cannot add song to Index "+a+".");
  }
 }
 public void playSong(String s)//task6
 {
  current=start;
  boolean found=false;
  for(int i=0;i<scount;i++)
  {
   if(current.song.equals(s))
   {
    found=true;
    System.out.println("Playing "+current.song+" by "+current.art+".");
   }
   current=current.next;
  }
  if(found==false)
  {
   System.out.println(s+" not found in playlist "+name+".");
  }
 }
 //task7
 public void playSong(int i)
 {
  if(i<scount)
  {
   current=start;
   for(int j=0;j<scount;j++)
   {
    if(i==j)
    {
    System.out.println("Playing "+current.song+" by "+current.art+".");
    }
   current=current.next;
   }
  }
  else
  {
   System.out.println("Song at Index "+i+" not found in "+name+".");
  } 
 }
 //task8
 public void deleteSong(String s)
 {
  current=start;
  boolean found=false;
  for(int i=0;i<scount;i++)
  {    
    if(i==0 && current.song.equals(s))
    {
     scount--;
     found=true;
     start=start.next;    
     System.out.println(current.song+" deleted from "+name+".");
    }
   else if(i<scount-2 && current.next!=null && current.next.song.equals(s))
   {
    System.out.println(current.next.song+" deleted from "+name+".");
    scount--;
    found=true;
    temp=current.next;
    current.next=temp.next;
   }
   else if(i==scount-2 && current.next.song.equals(s))
   {
    scount--;
    found=true; 
    System.out.println(current.next.song+" deleted from "+name+".");
    current.next=null;
   }
   if(current.next!=null)
   {
   current=current.next;
   }
   else
   {
    break;
   }
  }
   if(found==false)
   {
   System.out.println(s+" not found in "+name+".");
   }
 }
 //task9
  public int totalSong()
  {
   current=start;
   total++;
   for(;;)
   {
    if(current.next!=null)
    { 
     total++;
     current=current.next;
    }
    else
    {
    break;
    }
   }
  return total;
  }
  //task10
  public void merge(Playlist p)
  {
   current=start;
   for(;;)
   {
    if(current.next!=null)
    { 
     total++;
     current=current.next;
    }
    else
    {
     current.next=p.start;
     System.out.println("Merge Completed!");
     break;
    }
   }
  }
}
    
    
    
    
    
    
    
    
    
  

