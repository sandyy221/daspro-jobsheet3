import java.util.Scanner;
public class tugas2GajiKaryawan_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jamKerja, upahPerJam, totalGaji, semuaGaji;
        
        System.out.print("Jam kerja: ");
        jamKerja = input.nextDouble();
        System.out.print("Upah per jam: ");
       
        upahPerJam = input.nextDouble();
        totalGaji = upahPerJam * jamKerja;
        semuaGaji = totalGaji + (totalGaji*0.1) - (totalGaji*0.05);
        System.out.print("Total gaji: Rp " + semuaGaji);

    }
}