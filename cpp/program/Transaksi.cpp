#pragma once
#include <vector>
#include "Produk.cpp"
#include "Pelanggan.cpp"
#include "Pembayaran.cpp"
using namespace std;

class Transaksi {
private:
    string id_transaksi;
    string tanggalTransaksi;
    double total_harga;
    vector<Produk*> daftarProduk;
    vector<Pelanggan*> daftarPelanggan;
    vector<Pembayaran*> daftarPembayaran;

public:
    // Constructor
    Transaksi(string id = "", string tgl = "") {
        this->id_transaksi = id;
        this->tanggalTransaksi = tgl;
        this->total_harga = 0;
    }

    // Getter & Setter
    string getIdTransaksi() { return id_transaksi; }
    string getTanggalTransaksi() { return tanggalTransaksi; }
    double getTotalHarga() { return total_harga; }

    void setIdTransaksi(string id) { id_transaksi = id; }
    void setTanggalTransaksi(string tgl) { tanggalTransaksi = tgl; }

    // Methods
    void tambahProduk(Produk* p) {
        daftarProduk.push_back(p);
        total_harga += p->getHarga();
    }

    void hapusProduk(string idProduk) {
        for (auto it = daftarProduk.begin(); it != daftarProduk.end(); ++it) {
            if ((*it)->getIdProduk() == idProduk) {
                daftarProduk.erase(it);
                hitungTotal();
                return; // keluar dari fungsi (tanpa break)
            }
        }
    }

    void tambahPelanggan(Pelanggan* plg) {
        daftarPelanggan.push_back(plg);
    }

    void tambahPembayaran(Pembayaran* byr) {
        daftarPembayaran.push_back(byr);
    }

    void hitungTotal() {
        total_harga = 0;
        for (auto p : daftarProduk) {
            total_harga += p->getHarga();
        }
    }

    // === Getter daftar untuk main ===
    vector<Produk*> getDaftarProduk() { return daftarProduk; }
    vector<Pelanggan*> getDaftarPelanggan() { return daftarPelanggan; }
    vector<Pembayaran*> getDaftarPembayaran() { return daftarPembayaran; }
};
