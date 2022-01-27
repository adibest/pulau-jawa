package com.itspku.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 8;
        double l = 5.5;
        double hasil = hitungLuas(p,l); // memanggil fungsi
        System.out.println("Hasilnya adalah = " + hasil);
    }
    // fungsi dengan nilai balik
    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }
}
