public class Pembayaran {
    private String idPembayaran;
    private String tanggalPembayaran;
    private String metode;
    private double jumlah;

    public Pembayaran(String idPembayaran, String tanggalPembayaran, String metode, double jumlah) {
        this.idPembayaran = idPembayaran;
        this.tanggalPembayaran = tanggalPembayaran;
        this.metode = metode;
        this.jumlah = jumlah;
    }

    // Getter
    public String getIdPembayaran() {
        return idPembayaran;
    }

    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public String getMetode() {
        return metode;
    }

    public double getJumlah() {
        return jumlah;
    }

    // Setter
    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public void setTanggalPembayaran(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }
}
