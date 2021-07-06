//Uri online judge
//Problem number 1961 (jumping frog)
//Solved: July 6,2021

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Integer> allPipes = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int frogAbility = scanner.nextInt();
        int totalPipe = scanner.nextInt();
        boolean win =true;
        for(int g=0;g<totalPipe;g++){
           allPipes.add( scanner.nextInt());
        }
        for(int k=0;k<totalPipe-1;k++){
            if ( Math.abs(allPipes.get(k) - (allPipes.get(k+1))) > frogAbility) {
                win = false;
                break;
            }
        }
        if(win){
            System.out.println("YOU WIN");
        }else{
            System.out.println("GAME OVER");
        }
    }
}
