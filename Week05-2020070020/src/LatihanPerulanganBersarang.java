public class LatihanPerulanganBersarang {
    public static void main(String[] args) {
        int i, j, k;
        for (i=1; i<=5; i++) {
            for (j=5; j>1; j--) {
                System.out.print(" ");
            }
            for (k=1; k<(2*i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}