public class SistemAntrianSPBU {
    Node head, tail;
    TransaksiPengisian headTransaksi, tailTransaksi;
    BBM headBBM;
    int size = 0;

    public SistemAntrianSPBU() {
        tambahBBMBaru("Pertalite", 10000);
        tambahBBMBaru("Pertamax", 12400);
        tambahBBMBaru("Biosolar", 6800);
        tambahBBMBaru("DexLite", 13400);
        headTransaksi = tailTransaksi = null;
    }

    public void tambahBBMBaru(String nama, double harga) {
        BBM baru = new BBM(nama, harga);
        if (headBBM == null) {
            headBBM = baru;
        } else {
            BBM temp = headBBM;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = baru;
        }
    }

    public void tampilkanDaftarBBM() {
        BBM temp = headBBM;
        while (temp != null) {
            System.out.println(temp.namaBBM + " - Rp " + temp.hargaPerLiter);
            temp = temp.next;
        }
    }

    public BBM cariBBM(String nama) {
        BBM temp = headBBM;
        while (temp != null) {
            if (temp.namaBBM.equalsIgnoreCase(nama)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void tambahAntrian(Kendaraan kendaraan) {
        Node baru = new Node(kendaraan);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
    }

    public void lihatAntrian() {
        Node temp = head;
        while (temp != null) {
            temp.kendaraan.tampilkanInformasi();
            temp = temp.next;
        }
    }

    public void layaniKendaraan(java.util.Scanner sc) {
        if (head == null) {
            System.out.println("Tidak ada kendaraan dalam antrian.");
            return;
        }

        Kendaraan kendaraan = head.kendaraan;
        System.out.println("Kendaraan " + kendaraan.platNomor);
        System.out.println("Daftar Jenis BBM:");
        tampilkanDaftarBBM();

        System.out.print("Input jenis BBM: ");
        String jenis = sc.next();
        System.out.print("Input jumlah (liter): ");
        double liter = sc.nextDouble();

        BBM bbmDipilih = cariBBM(jenis);

        if (bbmDipilih != null) {
            TransaksiPengisian transaksi = new TransaksiPengisian(kendaraan, bbmDipilih, liter);
            tambahRiwayatTransaksi(transaksi);
            System.out.println(">> Transaksi berhasil dicatat");
        } else {
            System.out.println("Jenis BBM tidak ditemukan!");
        }

        head = head.next;
        if (head == null) tail = null;
    }
}
