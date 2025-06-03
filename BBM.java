class BBM {
    String namaBBM;
    double hargaPerLiter;
    BBM next;

    public BBM(String namaBBM, double harga) {
        this.namaBBM = namaBBM;
        this.hargaPerLiter = harga;
        this.next = null;
    }
}