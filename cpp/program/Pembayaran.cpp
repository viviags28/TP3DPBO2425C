#pragma once
#include <string>
using namespace std;

class Pembayaran {
private:
    string id_pembayaran;
    string tanggalPembayaran;
    string metode;
    double jumlah;
public:
    Pembayaran(string id="", string tgl="", string metode="", double jumlah=0.0) {
        this->id_pembayaran = id;
        this->tanggalPembayaran = tgl;
        this->metode = metode;
        this->jumlah = jumlah;
    }

    // Getter & Setter
    string getIdPembayaran() { return id_pembayaran; }
    string getTanggalPembayaran() { return tanggalPembayaran; }
    string getMetode() { return metode; }
    double getJumlah() { return jumlah; }

    void setIdPembayaran(string id) { id_pembayaran = id; }
    void setTanggalPembayaran(string tgl) { tanggalPembayaran = tgl; }
    void setMetode(string m) { metode = m; }
    void setJumlah(double j) { jumlah = j; }
};
