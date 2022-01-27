import java.util.Scanner;
public class PrimeNumber {
    static void find_prime(int A, int B) {
//        Deklarasi variabel
        int x, y, flg;

//        Print display message
        System.out.println("Bilangan prima antara " + A + " dan " + B + " adalah");

//        using for loop for traversing all
//        the number from A to B
        for (x = 2; x <= B; x++) {
//            using flag variable to check
//            if x is prime or not
            flg = 1;
            for (y = 2; y * y <= x; y++) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
//            if flag is 1 then x is prime but
//            if flag is 0 then x is not prime
            if (flg == 1)
                System.out.print(x + " ");
        }
    }

//    The Driver Code
    public static void main(String[] args) {
        int A, B;
        System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
        System.out.println("PROGRAM STUDI S1 INFORMATIKA");
        System.out.println("FAKULTAS TEKNOLOGI SAINS DAN KESEHATAN");
        System.out.println("ITSPKU MUHAMMADIYAH SURAKARTA");
        System.out.println("--------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nilai Terkecil : ");
        A = scan.nextInt();
        System.out.print("Masukkan Nilai Terbesar : ");
        B = scan.nextInt();
        System.out.println("--------------------------------------------------");

        find_prime(A,B);
    }
}
