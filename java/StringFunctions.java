import java util.Scanner;
public class StringFunctions
{
 public static void main(String args[])
 {
  System.out.println("enter the String")
  Scanner sc=newScanner(System.in);
  String str1=sc.nextline();
  System.out.println("length of String="+str1.length());
  System.out.println("charcter at first position="+str1.charAt(1));
  System.out.println("string end with e:"+str1.endsWith("e"));
  System.out.println("LOWERCASE:"+str1.toLowercase());
  System.out.println("UPPERCASE:"+str1.toUppercase());
  System.out.println("character at 2nd and 4th position is:"+str1.charAt(1)+","str1.charAt(3));
  System.out.println("The sub string using the start index only is"+str1.substring(5));
  System.out.println("The sub string using the start index only is"+str1.substring(0,4));
 }
}
