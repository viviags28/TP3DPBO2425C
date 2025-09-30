#pragma once
#include "Produk.cpp"

class Kostum : public Produk {
private:
    string ukuran;
    string karakter;
    int stokKostum;
public:
    Kostum(string id="", string nama="", double harga=0.0, 
           string ukuran="", string karakter="", int stok=0)
        : Produk(id, nama, harga) {
        this->ukuran = ukuran;
        this->karakter = karakter;
        this->stokKostum = stok;
    }

    // Getter & Setter
    string getUkuran() { return ukuran; }
    string getKarakter() { return karakter; }
    int getStokKostum() { return stokKostum; }

    void setUkuran(string u) { ukuran = u; }
    void setKarakter(string k) { karakter = k; }
    void setStokKostum(int s) { stokKostum = s; }
};
