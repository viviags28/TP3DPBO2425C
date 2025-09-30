#include <iostream>
#include <iomanip>
#include "Toko.cpp"
#include "Kostum.cpp"
#include "Aksesoris.cpp"
using namespace std;

// Fungsi untuk print semua transaksi
void printTransaksi(vector<Transaksi*> daftar) {
    cout << fixed << setprecision(0);

    // Loop semua transaksi dalam daftar
    for (auto t : daftar) {
        cout << "ID Transaksi   : " << t->getIdTransaksi() << endl;
        cout << "Tanggal        : " << t->getTanggalTransaksi() << endl;
        cout << "Total Harga    : " << t->getTotalHarga() << endl << endl;

        // Produk
        cout << "  Daftar Produk:\n";
        cout << left << setw(12) << "ID Produk"
             << setw(20) << "Nama Produk"
             << setw(10) << "Harga" << endl;
        cout << string(50, '-') << endl;
        for (auto p : t->getDaftarProduk()) {
            cout << left << setw(12) << p->getIdProduk()
                 << setw(20) << p->getNamaProduk()
                 << setw(10) << p->getHarga() << endl;
        }
        cout << string(60, '-') << endl << endl;

        // Pelanggan
        cout << "  Daftar Pelanggan:\n";
        cout << left << setw(12) << "ID Pelanggan"
             << setw(20) << "Nama"
             << setw(15) << "Kontak" << endl;
        cout << string(60, '-') << endl;
        for (auto plg : t->getDaftarPelanggan()) {
            cout << left << setw(12) << plg->getIdPelanggan()
                 << setw(20) << plg->getNama()
                 << setw(15) << plg->getKontak() << endl;
        }
        cout << string(60, '-') << endl << endl;

        // Pembayaran
        cout << "  Daftar Pembayaran:\n";
        cout << left << setw(12) << "ID Bayar"
             << setw(15) << "Tanggal"
             << setw(15) << "Metode"
             << setw(10) << "Jumlah" << endl;
        cout << string(60, '-') << endl;
        for (auto byr : t->getDaftarPembayaran()) {
            cout << left << setw(12) << byr->getIdPembayaran()
                 << setw(15) << byr->getTanggalPembayaran()
                 << setw(15) << byr->getMetode()
                 << setw(10) << byr->getJumlah() << endl;
        }
        cout << string(60, '-') << endl;

        cout << string(60, '=') << endl << endl;
    }
}

int main() {
    // Buat produk
    Kostum* k1 = new Kostum("K001", "Kostum Naruto", 150000, "L", "Naruto", 10);
    Aksesoris* a1 = new Aksesoris("A001", "Headband Ninja", 50000, "Kepala", "Kain", 20);

    Kostum* k2 = new Kostum("K002", "Kostum Sasuke", 175000, "M", "Sasuke", 8);
    Aksesoris* a2 = new Aksesoris("A002", "Pedang Mainan", 120000, "Senjata", "Plastik", 5);

    // Buat pelanggan
    Pelanggan* c1 = new Pelanggan("C001", "Andi", "081234567");
    Pelanggan* c2 = new Pelanggan("C002", "Budi", "089876543");

    // Buat pembayaran
    Pembayaran* b1 = new Pembayaran("B001", "2025-09-30", "Cash", 200000);
    Pembayaran* b2 = new Pembayaran("B002", "2025-09-30", "Transfer", 295000);

    // Buat transaksi pertama
    Transaksi* t1 = new Transaksi("T001", "2025-09-30");
    t1->tambahProduk(k1);
    t1->tambahProduk(a1);
    t1->tambahPelanggan(c1);
    t1->tambahPembayaran(b1);

    // Buat toko
    Toko toko("TOKO1", "Toko Kostum & Aksesoris", "Jl. Ninja No.1");
    toko.tambahTransaksi(t1);

    // Tampilkan transaksi sebelum penambahan
    cout << "Data Transaksi SEBELUM Penambahan\n";
    printTransaksi(toko.getDaftarTransaksi());

    // Buat transaksi kedua
    Transaksi* t2 = new Transaksi("T002", "2025-09-30");
    t2->tambahProduk(k2);
    t2->tambahProduk(a2);
    t2->tambahPelanggan(c2);
    t2->tambahPembayaran(b2);

    // Tambahkan transaksi kedua ke toko
    toko.tambahTransaksi(t2);

    // Tampilkan transaksi sesudah penambahan
    cout << "Data Transaksi SESUDAH Penambahan\n";
    printTransaksi(toko.getDaftarTransaksi());

    return 0;
}
