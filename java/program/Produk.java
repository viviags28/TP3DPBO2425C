public class Produk {
    protected String idProduk;
    protected String namaProduk;
    protected double harga;

    public Produk(String idProduk, String namaProduk, double harga) {
        this.idProduk = idProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter
    public String getIdProduk() {
        return idProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}