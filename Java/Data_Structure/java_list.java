import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Simple, just use java linkedlist collection add and delete element. 
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        int nums = in.nextInt();
        for (int i = 0; i < nums; i++) {
            list.add(in.nextInt());
        }
        int operations = in.nextInt();
        in.nextLine();
        for (int i = 0; i < operations; i++) {
            String operation = in.nextLine();
            if (operation.equals("Insert")) {
                int index = in.nextInt();
                int value = in.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")){
                int index = in.nextInt();
                list.remove(index);
            }
            if (in.hasNextLine()) {
                in.nextLine();
            }
            
        }
        
        for(int x : list) {
            System.out.print(x + " ");
        }

    }
}
