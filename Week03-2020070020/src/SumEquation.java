import java.util.Scanner;

public class SumEquation {
    public static void main(String[] args) {
        int angka_1;
        int angka_2;
        int sum_return;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number value : ");
        angka_1 = input.nextInt();
        System.out.print("Enter second number value : ");
        angka_2 = input.nextInt();
        sum_return = angka_1 + angka_2;
        System.out.println("--------------");
        System.out.println("The sum between " + angka_1 + " and " + angka_2 + " is " + sum_return);
    }
}
