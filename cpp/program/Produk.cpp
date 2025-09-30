#pragma once
#include <iostream>
#include <string>
using namespace std;

class Produk {
protected:
    string id_produk;
    string namaProduk;
    double harga;
public:
    Produk(string id="", string nama="", double harga=0.0) {
        this->id_produk = id;
        this->namaProduk = nama;
        this->harga = harga;
    }

    // Getter & Setter
    string getIdProduk() { return id_produk; }
    string getNamaProduk() { return namaProduk; }
    double getHarga() { return harga; }

    void setIdProduk(string id) { id_produk = id; }
    void setNamaProduk(string nama) { namaProduk = nama; }
    void setHarga(double h) { harga = h; }
};