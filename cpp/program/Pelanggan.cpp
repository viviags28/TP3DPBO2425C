#pragma once
#include <string>
using namespace std;

class Pelanggan {
private:
    string id_pelanggan;
    string nama;
    string kontak;
public:
    Pelanggan(string id="", string nama="", string kontak="") {
        this->id_pelanggan = id;
        this->nama = nama;
        this->kontak = kontak;
    }

    // Getter & Setter
    string getIdPelanggan() { return id_pelanggan; }
    string getNama() { return nama; }
    string getKontak() { return kontak; }

    void setIdPelanggan(string id) { id_pelanggan = id; }
    void setNama(string n) { nama = n; }
    void setKontak(string k) { kontak = k; }
};
