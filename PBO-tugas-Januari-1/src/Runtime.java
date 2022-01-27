public class Runtime {
    // main driver method
    public static void main(String[] args) {
        // Creating object of class 1
        Parent a;

        // Now we will be calling print methods
        // di dalam main() method

        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}
