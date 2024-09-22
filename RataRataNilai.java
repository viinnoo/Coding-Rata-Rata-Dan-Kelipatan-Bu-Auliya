import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int i = 1;
        int jumlahSiswa;
        double nilai;
        double totalNilai = 0;
        double rataRata;

        System.out.println("Ini Adalah Penghitung Rata Rata Nilai Siswa");
        System.out.println("___________________________________________");
        System.out.println("Masukkan Jumlah Siswa Anda: ");
        System.out.println("____________________________");
        jumlahSiswa = b.nextInt();
        
        while(i <= jumlahSiswa){
            System.out.println("___________________");
            System.out.println("Masukkan Nilai ke-" + i + ": ");
            nilai = b.nextDouble();
            totalNilai += nilai;
            i++;
        }
            rataRata = totalNilai / jumlahSiswa;
            System.out.println("_____________________________________________");
            System.out.println("Rata-Rata Nilai Dari " + jumlahSiswa + " Siswa Anda Adalah: " + rataRata);
            b.close();
    }
}
