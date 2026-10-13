import java.util.Scanner;

public class StudiKasus127 {
    public static void main(String[] args) {
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar, kembalian, kurang;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = input.nextInt();

        totalHarga =  jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            totalBayar = totalHarga - diskon;
            }

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        totalBayar = totalHarga - diskon;

        System.out.println("Total bayar: " + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang yang dibayar kurang: " + kurang);      
         }
        }
}

