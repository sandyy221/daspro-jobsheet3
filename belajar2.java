import java.util.Scanner;

public class belajar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerliter = 9000;
        System.out.print("Masukan jumlah uang Bensin: ");

        float jumlahUang = input.nextFloat();
        float literBensin = jumlahUang / hargaPerliter;
        System.out.println("Liter bensin anda: " + literBensin);
        input.close();

    }
}
