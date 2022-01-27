import java.io.Console;
public class LatihanConsole {
    public static void main(String[] args) {
        String nama;

        Console con = System.console();
        System.out.print("Inputkan nama : ");
        nama = con.readLine();

        System.out.println("Nama kamu adalah : " + nama);
    }
}
