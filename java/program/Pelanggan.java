public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String kontak;

    public Pelanggan(String idPelanggan, String nama, String kontak) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.kontak = kontak;
    }

    // Getter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getKontak() {
        return kontak;
    }

    // Setter
    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }
}
