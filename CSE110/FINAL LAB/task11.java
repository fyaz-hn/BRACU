import java.util.Scanner;
public class task11
{
  public static void main(String[]args)
  {
   Scanner sc= new Scanner(System.in);
   System.out.println("Number of vowels in the string: "+isVowel(sc.nextLine()));
   System.out.println("Number of consonant in the string: "+isConsonant(sc.nextLine()));
   String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
   System.out.println( "The total number of vowels in the array is:" + vowelSum(names));
   System.out.println( "The total number of consonants in the array is:" + consonantSum(names));
  }
  //A
  public static int isVowel(String s1)
  {
   int count=0;
   char ch;
   for (int i=0; i<=s1.length()-1; i++)
   {
   ch= s1.charAt(i);
   if(ch==65||ch==97||ch==69||ch==73||ch==79||ch==85||ch==101
     ||ch==105||ch==111||ch==117)
    {
    count++;
    }
   }
   return count;
  }
  //B
  public static int isConsonant(String s2)
  {
   int count2=0;
   char ch2;
   for (int i=0; i<=s2.length()-1; i++)
   {
   ch2= s2.charAt(i);
   if(ch2!=65&&ch2!=97&&ch2!=69&&ch2!=73&&ch2!=79&&ch2!=85&&ch2!=101
     &&ch2!=105&&ch2!=111&&ch2!=117&&ch2!=32) // || operator use korle 43 ashe
    {
     count2++;
    }
   }
   return count2;
  }
  //C
  public static int vowelSum(String [] names)
  {
   int count=0;
   for (int i=0; i<names.length; i++)
   {
    String s1="";
    s1+=names[i];
    count+=isVowel(s1);
   }
  return count;
  }
  public static int consonantSum(String [] names)
  {
   int count=0;
   for (int i=0; i<names.length; i++)
   {
    String s1="";
    s1+=names[i];
    count+=isConsonant(s1);
   }
  return count;
  }
}
  