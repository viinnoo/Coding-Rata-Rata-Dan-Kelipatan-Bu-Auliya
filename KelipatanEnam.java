import java.util.Scanner;

public class KelipatanEnam {
    public static void main(String[] args) {
        Scanner aw = new Scanner(System.in);
        int i = 6;
        int batasAwal, batasAkhir;
        
        System.out.println("Ini Adalah Penghitung Kelipatan Enam");
        System.out.println("____________________________________");
        System.out.println("Masukkan Batas Awal Anda: ");
        batasAwal = aw.nextInt();
        System.out.println("_________________________________");
        System.out.println("Lalu, Masukkan Batas Akhit Anda: ");
        batasAkhir = aw.nextInt();

        while (i >= batasAwal && i <= batasAkhir) {
            System.out.println("_______________");
            System.out.println(i);
            i+=6;
        }
    }
}
