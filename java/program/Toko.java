import java.util.ArrayList;

public class Toko {
    private String idToko;
    private String namaToko;
    private String alamat;
    private ArrayList<Transaksi> daftarTransaksi;

    public Toko(String idToko, String namaToko, String alamat) {
        this.idToko = idToko;
        this.namaToko = namaToko;
        this.alamat = alamat;
        this.daftarTransaksi = new ArrayList<>();
    }

    // Getter
    public String getIdToko() {
        return idToko;
    }

    public String getNamaToko() {
        return namaToko;
    }

    public String getAlamat() {
        return alamat;
    }

    // Setter
    public void setIdToko(String idToko) {
        this.idToko = idToko;
    }

    public void setNamaToko(String namaToko) {
        this.namaToko = namaToko;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Method
    public void tambahTransaksi(Transaksi transaksi) {
        daftarTransaksi.add(transaksi);
    }

    public ArrayList<Transaksi> getDaftarTransaksi() {
        return daftarTransaksi;
    }
}
