
public class AntrianSPBU {    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        SistemAntrianSPBU antrian = new SistemAntrianSPBU();
        int pilihan;

        do {
            System.out.println("Sistem Antrian SPBU");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Cek Sisa Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. urutkan riwayat transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Input Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Input jenis kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Input merk: ");
                    String merk = sc.nextLine();
                    antrian.tambahAntrian(new Kendaraan(plat, tipe, merk));
                    System.out.println(">> Kendaraan masuk ke dalam antrian");
                    break;
                case 2:
                    System.out.println("-- Antrian Kendaraan --");
                    antrian.lihatAntrian();
                    break;
                case 3:
                    antrian.hitungAntrian();
                    break;
                case 4:
                    antrian.layaniKendaraan(sc);
                    break;
                case 5:
                    antrian.lihatRiwayatTransaksi();
                    break;
                case 6:
                    antrian.urutkanTransaksiBerdasarkanPlat();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
            }
            System.out.println();
        } while (pilihan != 0);
    }
}
