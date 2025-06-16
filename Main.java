// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    static int fibo(int n){
        int result =1;
        if(n==0){
            return 1;
        }
        
        for(int i=1;i<=n;i++){
            result =result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int n=sc.nextInt();
        int rem=n%2;
        int n1=n/2;
        int result=0;
        while(true){
          result=result+ fibo(n1+rem)/ fibo(n1)*fibo(rem);
          n1=n1-1;
          rem=rem+2;
          if(n1<0){
              break;
          
        }
        System.out.println(result);
    }}
}