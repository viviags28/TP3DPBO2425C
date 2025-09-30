import java.util.ArrayList;

public class Main {

    // Fungsi untuk print semua transaksi
    public static void printTransaksi(ArrayList<Transaksi> daftar) {
        for (Transaksi t : daftar) {
            System.out.println("ID Transaksi   : " + t.getIdTransaksi());
            System.out.println("Tanggal        : " + t.getTanggalTransaksi());
            System.out.println("Total Harga    : " + (int) t.getTotalHarga());
            System.out.println();

            // Produk
            System.out.println("  Daftar Produk:");
            System.out.printf("%-12s%-20s%-10s%n", "ID Produk", "Nama Produk", "Harga");
            System.out.println("--------------------------------------------------");
            for (Produk p : t.getDaftarProduk()) {
                System.out.printf("%-12s%-20s%-10.0f%n",
                        p.getIdProduk(), p.getNamaProduk(), p.getHarga());
            }
            System.out.println("------------------------------------------------------------");
            System.out.println();

            // Pelanggan
            System.out.println("  Daftar Pelanggan:");
            System.out.printf("%-12s%-20s%-15s%n", "ID Pelanggan", "Nama", "Kontak");
            System.out.println("------------------------------------------------------------");
            for (Pelanggan plg : t.getDaftarPelanggan()) {
                System.out.printf("%-12s%-20s%-15s%n",
                        plg.getIdPelanggan(), plg.getNama(), plg.getKontak());
            }
            System.out.println("------------------------------------------------------------");
            System.out.println();

            // Pembayaran
            System.out.println("  Daftar Pembayaran:");
            System.out.printf("%-12s%-15s%-15s%-10s%n", "ID Bayar", "Tanggal", "Metode", "Jumlah");
            System.out.println("------------------------------------------------------------");
            for (Pembayaran byr : t.getDaftarPembayaran()) {
                System.out.printf("%-12s%-15s%-15s%-10.0f%n",
                        byr.getIdPembayaran(), byr.getTanggalPembayaran(),
                        byr.getMetode(), byr.getJumlah());
            }
            System.out.println("------------------------------------------------------------");

            System.out.println("============================================================");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Buat produk
        Kostum k1 = new Kostum("K001", "Kostum Naruto", 150000, "L", "Naruto", 10);
        Aksesoris a1 = new Aksesoris("A001", "Headband Ninja", 50000, "Kepala", "Kain", 20);

        Kostum k2 = new Kostum("K002", "Kostum Sasuke", 175000, "M", "Sasuke", 8);
        Aksesoris a2 = new Aksesoris("A002", "Pedang Mainan", 120000, "Senjata", "Plastik", 5);

        // Buat pelanggan
        Pelanggan c1 = new Pelanggan("C001", "Andi", "081234567");
        Pelanggan c2 = new Pelanggan("C002", "Budi", "089876543");

        // Buat pembayaran
        Pembayaran b1 = new Pembayaran("B001", "2025-09-30", "Cash", 200000);
        Pembayaran b2 = new Pembayaran("B002", "2025-09-30", "Transfer", 295000);

        // Buat transaksi pertama
        Transaksi t1 = new Transaksi("T001", "2025-09-30");
        t1.tambahProduk(k1);
        t1.tambahProduk(a1);
        t1.tambahPelanggan(c1);
        t1.tambahPembayaran(b1);

        // Buat toko
        Toko toko = new Toko("TOKO1", "Toko Kostum & Aksesoris", "Jl. Ninja No.1");
        toko.tambahTransaksi(t1);

        // Tampilkan transaksi sebelum penambahan
        System.out.println("Data Transaksi SEBELUM Penambahan");
        printTransaksi(toko.getDaftarTransaksi());

        // Buat transaksi kedua
        Transaksi t2 = new Transaksi("T002", "2025-09-30");
        t2.tambahProduk(k2);
        t2.tambahProduk(a2);
        t2.tambahPelanggan(c2);
        t2.tambahPembayaran(b2);

        // Tambahkan transaksi kedua ke toko
        toko.tambahTransaksi(t2);

        // Tampilkan transaksi sesudah penambahan
        System.out.println("Data Transaksi SESUDAH Penambahan");
        printTransaksi(toko.getDaftarTransaksi());
    }
}
