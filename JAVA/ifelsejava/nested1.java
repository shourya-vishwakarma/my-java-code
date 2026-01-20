package ifelsejava;
import java.util.Scanner;
public class nested1 {
    
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println("divisible by 3 and 5 but not 15");
            }
            else {System.out.println("not matching the require condition ");}
        }
        else {
            System.out.println("not matching the require condition");
        }
    
}
}}