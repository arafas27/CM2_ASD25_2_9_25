class Kendaraan {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan(String plat, String tipe, String merk) {
        this.platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi() {
        System.out.println("Plat nomor : " + platNomor + "\t" + "Tipe : " + tipe + "\t" + "Merk : " + merk);
    }
}