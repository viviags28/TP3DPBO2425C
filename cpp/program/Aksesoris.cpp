#pragma once
#include "Produk.cpp"

class Aksesoris : public Produk {
private:
    string jenis;
    string bahan;
    int stokAksesoris;
public:
    Aksesoris(string id="", string nama="", double harga=0.0,
              string jenis="", string bahan="", int stok=0)
        : Produk(id, nama, harga) {
        this->jenis = jenis;
        this->bahan = bahan;
        this->stokAksesoris = stok;
    }

    // Getter & Setter
    string getJenis() { return jenis; }
    string getBahan() { return bahan; }
    int getStokAksesoris() { return stokAksesoris; }

    void setJenis(string j) { jenis = j; }
    void setBahan(string b) { bahan = b; }
    void setStokAksesoris(int s) { stokAksesoris = s; }
};
