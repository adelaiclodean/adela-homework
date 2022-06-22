package homework01;

public class Sum {
    public static void main(String[] args) {
        int i;
        int suma = 0;

        for (i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println("Suma primelor 100 de numere este: " + suma);
    }
}
