import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         char[] str = input.toCharArray();
         Deque<Character> stack = new ArrayDeque<Character>();
         boolean matched = true;
         for (int i = 0; i < str.length; i++) {
            switch(str[i]) {
                case '(':
                case '[':
                case '{':
                    stack.push(str[i]);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                      matched = false;  
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[' ) {
                      matched = false;  
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                      matched = false;  
                    }
                    break;
                default:
                    break;
            }
            
            if (!matched) {
                System.out.println("false");  
                break;
            }
            
         }
         if (!matched) {
             continue;
         } 
          
         if (stack.isEmpty()) {
            System.out.println("true"); 
         } else {
            System.out.println("false");  
         }
      
      }
      
   }
}

// Use ArrayDeque instead of Stack. (A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations)
// fail to match, break the character iteration loop immedietaly. 