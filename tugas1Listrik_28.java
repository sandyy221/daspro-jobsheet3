import java.util.Scanner;

public class tugas1Listrik_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           int tarifListrik = 1500;
           boolean penggunaaListrik;
           double totalTagihan, jumlahPenggunaan;

           System.out.print("Jumlah penggunaan listrik: ");
           jumlahPenggunaan = input.nextDouble();
           penggunaaListrik = jumlahPenggunaan > 500;
           totalTagihan = tarifListrik * jumlahPenggunaan;
           System.out.println("Jumlah penggunaan " + totalTagihan);
           System.out.println("Apakah jumlah penggunaan listrik 500" + penggunaaListrik);
           System.out.print("Total tagihan listrik: Rp " + totalTagihan);
           


    }


}