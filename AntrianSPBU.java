public class AntrianSPBU {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        AntrianSPBU antrian = new AntrianSPBU();
        int pilihan;

        do {
            System.out.println("Sistem Antrian SPBU");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Cek Sisa Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();
        } while (pilihan != 0);
    }
}
