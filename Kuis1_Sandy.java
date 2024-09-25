import java.util.Scanner;

public class Kuis1_Sandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahProduksiKaos28;
        double bahanPerKaos28 = 50000;
        
        System.out.print("Jumlah kaos yang di produksi: ");
        jumlahProduksiKaos28 = sc.nextInt();
        double biayaKaos28 = jumlahProduksiKaos28 * bahanPerKaos28;
        System.out.println("Total biaya bahan: " + biayaKaos28);
        
        double totalPajak28 = (bahanPerKaos28*0.8) - (biayaKaos28*0.8);
        System.out.println("Jumlah pajak biaya bahan: " + totalPajak28);
        sc.close();


        //input    : jumlah produksi kaos 
        //output   : hasil setelah pajak
        //algoritma: 
        //1. tentukan jumlah kaos yang diproduksi
        //2. hitung jumlah biaya bahan dengan, jumlahProduksiKaos28 * bahanPerKaos28
        //3. hitung hasil pajak dengan, bahanPerKaos28*0.8 - biayaKaos28*0.8

    }
    
}
