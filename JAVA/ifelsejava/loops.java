package ifelsejava;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int  = sc.nextInt();
        // for (int i = 10; i >= 1; i=i-1){
        //     System.out.println(i);
        // }
        // for (int i=1;i<=100;i++){
        //     System.out.println(i);
        // }
        //   for (int i=2;i<=100;i+=2){
        //     System.out.println(i);
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number : ");
        // int n = sc.nextInt();
        // for (int i = 4; i <= 3*n-1; i+=3){
        //     System.out.println(i);}
       // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter no of rows  : ");
        // int m = sc.nextInt();
        // int a =1 , r=2;
        // for(int i=1 ; i<=n;i++){
        //     System.out.println(a);
        //     a*=r;
        // }
        // int hf = 1;
        // for(int i=n-1;i>=1;i--){
        //     if(n%i==0){
        //         hf = i;   
        //     break;}
        // }
        // System.out.println(hf);
        // for (int i = 2; i < n ;i++){
        //     if(n%i==0){
        //         System.out.println("Composite number ");
        //         break;
        //     }
        // boolean flag = false ; // false means prime 
        // for (int i = 2 ; i<Math.sqrt(n); i++){//i<n
        //     if(n%i==0){// i is factor of n 
        //         flag = true; //true means composite 
        //         break;
        //     }
        // }
        // if(n==1)
        //     System.out.println("not prime or composite ");
        // else if(flag==false)
        //     System.out.println("prime ");
        // else 
        // System.out.println("composite ");

        // System.out.print("Enter no of cols :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i <= n ; i++){
        //     for (int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }//*****************************
        //     System.out.println();
        // }
      

        //   System.out.print("Enter no of n :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i <= n ; i++){
        //     for (int j=1;j<=n;j++){
        //         System.out.print(i+" ");
        //     }//1111122222333334444455555
        //     System.out.println();
        // }
        // System.out.print("Enter no of N :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i <= n ; i++){
        //     for (int j=1;j<=n;j++){
        //         System.out.print((j+64)+" ");
        //     }//65,66,67,68,69
        //     System.out.println();
        // }
        //  System.out.print("Enter no of cols :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i <= n ; i++){
        //     for (int j=1;j<=n;j++){
        //         System.out.print((char)(j+64)+" ");
        //     }//ABCD
        //     System.out.println();
        // }
        //   System.out.print("Enter no of N :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i <= n ; i++){
        //     for (int j=1;j<=n;j++){
        //         System.out.print((char)(i+64)+" ");
        //     }//AAAAABBBBBCCCCCDDDDDEEEEE
        //     System.out.println();
        
        // }
        //  System.out.print("Enter no of N :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i <= n ; i++){
        //     for (int j=1;j<=n;j++){
        //         System.out.print((char)(j+96)+" ");
        //     }//abcde,abcde,abcde,abcde,abcde
        //     System.out.println();
        
        // }
        //   System.out.print("Enter no of N :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i <= n ; i++){
        //     for (int j=1;j<=n;j++){
        //         System.out.print((char)(i+96)+" ");
        //     }//aaaaa,bbbbb,ccccc,ddddd,eeeee
        //     System.out.println();
        // }
        // Scanner sc = new Scanner (System.in);//RIGHT ANGLE STAR 
        // System.out.println("Enter the N :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i<=n; i++){
        //     for(int j = 1 ; j<= i ; j++ ){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        //  Scanner sc = new Scanner (System.in);// 1AB,123ABCD12345
        // System.out.println("Enter the N :");
        // int n = sc.nextInt();
        // for (int i = 1 ; i<=n; i++){
        //     for(int j = 1 ; j<= i ; j++ ){
        //        if(i%2!=0) System.out.print(j+" ");
        //        else System.out.print((char)(j+64)+" ");
        //     }
        //     System.out.println();
        // }
        // Scanner sc = new Scanner (System.in);// ulta right angle star
        // System.out.println("Enter the N :");
        // int n = sc.nextInt();
        // for (int j = 1 ; j<=n; j++){
        //     for(int i = 1 ; j+i<=n+1 ; i++ ){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //  Scanner sc = new Scanner (System.in);//RIGHT ANGLE STAR 
        //  System.out.println("Enter the N :");
        //  int n = sc.nextInt();
        //  for (int i = 1 ; i<=n; i++){
        //     for(int j = 1 ; j<= i ; j++ ){
        //         System.out.print((2*j-1)+" ");
        //    }
        //     System.out.println();
        //  }
        //   Scanner sc = new Scanner (System.in);//RIGHT ANGLE STAR 
        //  System.out.println("Enter the N :");
        //  int n = sc.nextInt();
        //   int a = 1;
        //  for (int i = 1 ; i<=n; i++){
        //     for(int j = 1 ; j<= i ; j++ ){
        //         System.out.print(a+" ");
        //         a++;
        //    }
        //     System.out.println();
        //  }
          Scanner sc = new Scanner (System.in);//RIGHT ANGLE STAR 
         System.out.println("Enter the N :");
         int n = sc.nextInt();
         for (int i = 1 ; i<=n; i++){
            for(int j = 1 ; j<= i ; j++ ){
              if((i+j)%2==0)
                System.out.print(1+" ");
                else
                  System.out.print(0+" ");
               
           }
            System.out.println();
         }

    }
    
}
