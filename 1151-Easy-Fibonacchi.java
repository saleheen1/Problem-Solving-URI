//Uri online judge
//problem no- 1151 Easy Fibonacchi
//solved: july 10-2021

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
       int n1=0;
       int n2=1;
       int result;
        System.out.print(n1 + " "+ n2);
       for(int i=0;i<j-2;i++){
           result = n1+n2;
           System.out.print(" "+result);
           n1 = n2;
           n2 = result;
        }
        System.out.println();
    }
}
