//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Birth Year: ");
        int birthYear = scanner.nextInt();

        int futureYear = 2050 - birthYear;

        System.out.println(name + ", you will be " + futureYear + " years old in 2050.");
    }
}
