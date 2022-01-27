import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferedKaryawan {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama;
        String jenis_kelamin;
        String alamat;
        int umur;
        int gaji;
        String divisi;

        try {
            System.out.print("Masukkan Nama anda : ");
            nama = br.readLine();
            System.out.print("Masukkan jenis kelamin anda : ");
            jenis_kelamin = br.readLine();
            System.out.print("Masukkan alamat anda : ");
            alamat = br.readLine();
            System.out.print("Masukkan umur anda : ");
            umur = Integer.parseInt(br.readLine());
            System.out.print("Masukkan gaji anda : ");
            gaji = Integer.parseInt(br.readLine());
            System.out.print("Masukkan divisi anda : ");
            divisi = br.readLine();

            System.out.println("-------------------------------");
            System.out.println("Nama : " + nama);
            System.out.println("Jenis Kelamin : " + jenis_kelamin);
            System.out.println("Alamat : " + alamat);
            System.out.println("Umur : " + umur);
            System.out.println("Gaji : " + gaji);
            System.out.println("Divisi : " + divisi);
            System.out.println("-------------------------------");
        } catch (IOException eox) {
            System.out.println(eox);
        }
    }
}
