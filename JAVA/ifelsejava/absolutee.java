package ifelsejava;
import java.util.Scanner;
public class absolutee {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the integer");
        // int n = sc.nextInt();
        // if(n<0){
        //   n =  n * (-1);
        // }
        // System.out.println( "the absolute value is :"+n);
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter cost price");
         int cp = sc.nextInt();
         System.out.println("Enter selling price");
         int sp = sc.nextInt();
         if(sp>cp){
          System.out.println("You made the profit ");
         }
         //if(cp>sp)
         else
         {
          System.out.println("You incurred a loss ");
         }

      }
    
}
