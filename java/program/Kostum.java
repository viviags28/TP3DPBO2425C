public class Kostum extends Produk {
    private String ukuran;
    private String karakter;
    private int stokKostum;

    public Kostum(String id, String nama, double harga, 
                  String ukuran, String karakter, int stok) {
        super(id, nama, harga);
        this.ukuran = ukuran;
        this.karakter = karakter;
        this.stokKostum = stok;
    }

    // Getter
    public String getUkuran() {
        return ukuran;
    }

    public String getKarakter() {
        return karakter;
    }

    public int getStokKostum() {
        return stokKostum;
    }

    // Setter
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setKarakter(String karakter) {
        this.karakter = karakter;
    }

    public void setStokKostum(int stokKostum) {
        this.stokKostum = stokKostum;
    }
}
