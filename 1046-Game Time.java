import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int scanner = new Scanner(System.in).nextInt();
        int scanner2 = new Scanner(System.in).nextInt();
        int gametime;
        if(scanner > scanner2){
            gametime = (24- scanner)+scanner2;
        }else if(scanner < scanner2){
            gametime = scanner2- scanner;
        }else{
            gametime=24;
        }
        System.out.println("O JOGO DUROU " + gametime + " HORA(S)");

    }
}
