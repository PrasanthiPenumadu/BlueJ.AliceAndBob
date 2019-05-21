/**
 * Alice and Bob
 */
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args ){
         String a;
  
        Scanner ui=new Scanner(System.in);
        System.out.println("Enter your name: ");
        a=ui.next();
        
        if(a.equals("Alice")||a.equals("alice"))
        {
             System.out.println("Hello Alice ");
        }
        
         else if(a.equals("Bob")||a.equals("bob"))
        {
             System.out.println("Hello Bob ");
        }
        else
          System.out.println("Hello there ");
        
    }
}
