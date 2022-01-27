import java.util.Scanner;
public class IsPrimeNumber {
    public static void main(String[] args) {
        int num;
        int flag = 0;
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter number value : ");
        num = enter.nextInt();
        if (num == 0 || num == 1) {
            System.out.println(num + " bukan bilangan prima");
        } else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " bukan bilangan prima");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " bilangan prima");
            }
        }
    }
}
