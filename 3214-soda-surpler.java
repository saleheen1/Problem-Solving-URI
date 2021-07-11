//Uri online judge
//problem no: 3214
//solved: july 11,2021


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialBottle = scanner.nextInt();
        int foundBottle = scanner.nextInt();
        int bottleCanBuy = scanner.nextInt();

        int sodaBoughtTotal =0;

        int totalBottle = initialBottle+foundBottle;
        while(totalBottle>=bottleCanBuy){
            sodaBoughtTotal = sodaBoughtTotal+ totalBottle/bottleCanBuy;
            totalBottle = totalBottle/bottleCanBuy + totalBottle%bottleCanBuy;
        }
        System.out.println(sodaBoughtTotal);
    }
}
