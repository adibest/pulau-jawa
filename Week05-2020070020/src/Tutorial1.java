import java.util.Scanner;
public class Tutorial1 {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);

        String[] matkulSem1={
                "Kewarganegaraan",
                "Algoritma dan Pemograman",
                "Bahasa Indonesia"
        };
        String[] matkulSem2={
                "Praktikum Algoritma dan Pemograman",
                "Algoritma Pemograman",
                "Basis Data"
        };
        String[] matkulSem3={
                "Sistem Operasi",
                "Praktikum Sistem Operasi",
                "Praktikum Pemograman Berbasis Objek"
        };
        System.out.println("Pilih Semester :");
        System.out.println("1. Semester I\n2. Semester II\n3. Semester III");
        System.out.print("Pilih : ");
        input = scanner.nextInt();
        switch (input) {
            case 1 -> {
                System.out.println("Daftar Mata Kuliah Semester I :");
                show(matkulSem1);
            }
            case 2 -> {
                System.out.println("Daftar Mata Kuliah Semester II : ");
                show(matkulSem2);
            }
            case 3 -> {
                System.out.println("Daftar Mata Kuliah Semester III : ");
                show(matkulSem3);
            }
            default -> System.out.println("Pilihan tidak valid");
        }
    }

    public static void show(String[] matkul) {
        for (String eachMatkul : matkul) {
            System.out.println("- " + eachMatkul);
        }
    }
}
