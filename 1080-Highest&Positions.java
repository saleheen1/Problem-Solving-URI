//uri onlinejudge
//problem no: 1080
//solved: July 6,2021

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int position=0;
        for(int k=0;k<100;k++){
            myArray.add(scanner.nextInt());
        }
        int highestNum = myArray.get(0);
        for(int j=0;j<100;j++){
            for (int m=0;m<100;m++){
                if(myArray.get(j) > highestNum){
                    highestNum=myArray.get(j);
                    position = j+1;
                }
            }
        }
        System.out.println(highestNum);
        System.out.println(position);
    }
}
