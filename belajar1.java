import java.util.Scanner;

public class belajar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerKg = 2000;
        System.out.print("Masukan jumlah berat laundry (dalam kg) ");
        int beratLaundry = input.nextInt();
        int totalBiaya = beratLaundry * hargaPerKg;
        System.out.println("Total biaya laundry: " + totalBiaya);
        input.close();

    }
}
