import  java.util.Scanner;

public class StudiKasus227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan, status;
        int jumlahDokumen, peringkat;

        System.out.print("Nama mahasiswa : ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara (1/2/3/0) : ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                System.out.print("Jumlah dokumen yang diupload (0-4) : ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    status = "Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen belum lengkap, kurang "
                            + (4 - jumlahDokumen)
                            + " dokumen. Dana tidak diberikan.";
                }

            } else {
                status = "Bukan juara 1, 2, atau 3. Dana tidak diberikan.";
            }

        } 
        sc.close();
    }
}