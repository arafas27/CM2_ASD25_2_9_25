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
}
