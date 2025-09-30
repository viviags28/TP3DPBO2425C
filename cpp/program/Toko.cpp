#pragma once
#include <string>
#include <vector>
#include "Transaksi.cpp"
using namespace std;

class Toko {
private:
    string id_toko;
    string namaToko;
    string alamat;
    vector<Transaksi*> daftarTransaksi;
public:
    Toko(string id="", string nama="", string alamat="") {
        this->id_toko = id;
        this->namaToko = nama;
        this->alamat = alamat;
    }

    // Getter & Setter
    string getIdToko() { return id_toko; }
    string getNamaToko() { return namaToko; }
    string getAlamat() { return alamat; }

    void setIdToko(string id) { id_toko = id; }
    void setNamaToko(string n) { namaToko = n; }
    void setAlamat(string a) { alamat = a; }

    // Method
    void tambahTransaksi(Transaksi* t) {
        daftarTransaksi.push_back(t);
    }

    // Getter daftar transaksi
    vector<Transaksi*> getDaftarTransaksi() {
        return daftarTransaksi;
    }
};
