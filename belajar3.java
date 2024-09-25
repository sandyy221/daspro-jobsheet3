import java.util.Scanner;

public class belajar3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input biaya suku cadang
        System.out.print("Masukkan biaya suku cadang: Rp ");
        double biayaSukuCadang = scanner.nextDouble();

        // Biaya jasa tetap sebesar Rp 50.000
        double biayaJasa = 50000;

        // Potongan 5% untuk biaya suku cadang
        double potonganSukuCadang = biayaSukuCadang * 0.05;
        double biayaSukuCadangSetelahPotongan = biayaSukuCadang - potonganSukuCadang;

        // Total biaya sebelum pajak
        double totalBiayaSebelumPajak = biayaSukuCadangSetelahPotongan + biayaJasa;

        // Pajak 7% dari total biaya sebelum pajak
        double pajak = totalBiayaSebelumPajak * 0.07;

        // Total biaya setelah pajak
        double totalBiayaSetelahPajak = totalBiayaSebelumPajak + pajak;

        // Menampilkan hasil
        System.out.println("\nRincian Biaya Perbaikan:");
        System.out.printf("Biaya suku cadang (setelah potongan): Rp %.2f\n", biayaSukuCadangSetelahPotongan);
        System.out.printf("Biaya jasa: Rp %.2f\n", biayaJasa);
        System.out.printf("Total biaya sebelum pajak: Rp %.2f\n", totalBiayaSebelumPajak);
        System.out.printf("Pajak (7%%): Rp %.2f\n", pajak);
        System.out.printf("Total biaya perbaikan (setelah pajak): Rp %.2f\n", totalBiayaSetelahPajak);
    }
}