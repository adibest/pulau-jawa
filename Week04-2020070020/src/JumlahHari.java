import java.util.Scanner;
public class JumlahHari {
    public static void main(String[] args) {
        int month;
        Scanner choose = new Scanner(System.in);
        System.out.print("Masukkan nomor bulan : ");
        month = choose.nextInt();
        switch (month) {
            case 1 -> System.out.println("Januari | 31");
            case 2 -> System.out.println("Februari | 28/29");
            case 3 -> System.out.println("Maret | 31");
            case 4 -> System.out.println("April | 30");
            case 5 -> System.out.println("Mei | 31");
            case 6 -> System.out.println("Juni | 30");
            case 7 -> System.out.println("Juli | 31");
            case 8 -> System.out.println("Agustus | 31");
            case 9 -> System.out.println("September | 30");
            case 10 -> System.out.println("Oktober | 31");
            case 11 -> System.out.println("November | 30");
            case 12 -> System.out.println("Desember | 31");
        }
    }
}
