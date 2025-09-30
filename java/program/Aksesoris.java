public class Aksesoris extends Produk {
    private String jenis;
    private String bahan;
    private int stokAksesoris;

    public Aksesoris(String id, String nama, double harga,
                     String jenis, String bahan, int stok) {
        super(id, nama, harga);
        this.jenis = jenis;
        this.bahan = bahan;
        this.stokAksesoris = stok;
    }

    // Getter
    public String getJenis() {
        return jenis;
    }

    public String getBahan() {
        return bahan;
    }

    public int getStokAksesoris() {
        return stokAksesoris;
    }

    // Setter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setStokAksesoris(int stokAksesoris) {
        this.stokAksesoris = stokAksesoris;
    }
}
