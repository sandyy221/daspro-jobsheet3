import java.util.Scanner;
public class Siakad28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai Ujian: ");
        nilaiUjian = sc.nextDouble();
        nilaiAkhir = (nilaiKuis) + (nilaiTugas)  + (nilaiUjian);
        System.out.println("Nama: " + nama + " NIM: " + nim); 
        System.out.println("Kelas: " + kelas + "absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

            
    }
}