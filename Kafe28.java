import java.util.Scanner;

public class Kafe28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100;

        System.out.print("Masukan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukan jumlah pembeli teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        double totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        byte totalByte = (byte) totalHarga;
        double nominalBayar = totalByte - (diskon * totalByte);
        int nominalint = (int) nominalBayar;

        System.out.println("Keanggotaan pelangaan");
        System.out.println("Item pembelian " + jmlKopi +"  kopi," + jmlTeh + " teh," + jmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
        System.out.println("Nominal bayar Rp " + nominalint );



    }

}
