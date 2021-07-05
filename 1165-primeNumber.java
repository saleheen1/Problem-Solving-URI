import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        int count = scanner.nextInt();
        for(int n=0;n<count;n++){
            a = scanner.nextInt();
            numbers.add(a);
        }
        for (Integer number : numbers) {
            if (number == 2) {
                isPrime = true;
            } else {
                for (int q = 2; q < number; q++) {
                    if (number % q == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println(number + " eh primo");
            } else {
                System.out.println(number + " nao eh primo");
                isPrime = true;
            }
        }
    }
}
