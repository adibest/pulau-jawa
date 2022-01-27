// Program Java untuk metode overloading
// dengan menggunakan tipe argumen yang berbeda

// Class 1
// Helper class
public class Helper {

    // Metode dengan 2 parameter integer
    static int Multiply(int a, int b)
    {
        // Mengembalikan hasil dari nilai integer
        return a * b;
    }

    // Metode 2
    // Dengan nama yang sama tapi menggunakan parameter double
    static double Multiply(double a, double b)
    {
        // Mengembalikan hasil dari nilai double
        return a * b;
    }
}
