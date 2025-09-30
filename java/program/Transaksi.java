import java.util.ArrayList;

public class Transaksi {
    private String idTransaksi;
    private String tanggalTransaksi;
    private double totalHarga;
    private ArrayList<Produk> daftarProduk;
    private ArrayList<Pelanggan> daftarPelanggan;
    private ArrayList<Pembayaran> daftarPembayaran;

    // Constructor
    public Transaksi(String idTransaksi, String tanggalTransaksi) {
        this.idTransaksi = idTransaksi;
        this.tanggalTransaksi = tanggalTransaksi;
        this.totalHarga = 0;
        this.daftarProduk = new ArrayList<>();
        this.daftarPelanggan = new ArrayList<>();
        this.daftarPembayaran = new ArrayList<>();
    }

    // Getter
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    // Setter
    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    // Methods
    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
        totalHarga += produk.getHarga();
    }

    public void hapusProduk(String idProduk) {
        for (int i = 0; i < daftarProduk.size(); i++) {
            if (daftarProduk.get(i).getIdProduk().equals(idProduk)) {
                daftarProduk.remove(i);
                hitungTotal();
                return;
            }
        }
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    public void tambahPembayaran(Pembayaran pembayaran) {
        daftarPembayaran.add(pembayaran);
    }

    public void hitungTotal() {
        totalHarga = 0;
        for (Produk p : daftarProduk) {
            totalHarga += p.getHarga();
        }
    }

    // Getter daftar untuk main
    public ArrayList<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    public ArrayList<Pelanggan> getDaftarPelanggan() {
        return daftarPelanggan;
    }

    public ArrayList<Pembayaran> getDaftarPembayaran() {
        return daftarPembayaran;
    }
}
