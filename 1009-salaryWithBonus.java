//problem number 1009
//Uri online judge
//solved: July 5-2021

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double sale = scanner.nextDouble();
        double moneyExtraEarn = sale * 15/100;
        double finalSalary = salary+moneyExtraEarn;
        DecimalFormat df = new DecimalFormat("#.00");
        String roundfinal = df.format(finalSalary);
        System.out.println("TOTAL = R$ "+roundfinal);
    }
}
