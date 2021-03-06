import java.util.*;
import java.io.*;

/**
 * Simple, just use java map collection add and delete element. 
 */

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      HashMap<String, Integer> map = new HashMap<String, Integer>();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         map.put(name, phone);
         in.nextLine();
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if (!map.containsKey(s)) {
            System.out.println("Not found");
         } else {
            System.out.println(s + "=" + map.get(s)); 
         }
      }
   }
}