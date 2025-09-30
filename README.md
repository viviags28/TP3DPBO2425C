# Janji
Saya Vivi Agustina Suryana dengan NIM 2400456 mengerjakan Tugas Praktikum 3 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.

# Diagram
Berikut adalah diagram kelas:  

![final](https://github.com/user-attachments/assets/3c3f2b98-e8be-4ca3-a230-41d3d40a0a49)


# Detail Kelas

## Toko
**Atribut**
- `id_toko`: ID unik toko  
- `namaToko`: Nama toko  
- `alamat`: Alamat toko  
- `daftarTransaksi`: Kumpulan transaksi yang tercatat  

**Method**
- Getter & Setter  
- `tambahTransaksi(transaksi)`  
- `getDaftarTransaksi()`  

## Transaksi
**Atribut**
- `id_transaksi`: ID unik transaksi  
- `tanggalTransaksi`: Tanggal transaksi  
- `total_harga`: Total harga produk  
- `daftarProduk`: Kumpulan produk  
- `daftarPelanggan`: Kumpulan pelanggan  
- `daftarPembayaran`: Kumpulan pembayaran  

**Method**
- Getter & Setter  
- `tambahProduk(produk)`  
- `hapusProduk(idProduk)`  
- `tambahPelanggan(pelanggan)`  
- `tambahPembayaran(pembayaran)`  
- `hitungTotal()`  
- `getDaftarProduk()`, `getDaftarPelanggan()`, `getDaftarPembayaran()`  

## Produk
**Atribut**
- `id_produk`: ID unik produk  
- `namaProduk`: Nama produk  
- `harga`: Harga produk  

**Method**
- Getter & Setter  

### Kostum (extends Produk)
**Atribut**
- `ukuran`: Ukuran kostum (S, M, L, XL)  
- `karakter`: Karakter yang direpresentasikan  
- `stokKostum`: Stok tersedia  

**Method**
- Getter & Setter  

### Aksesoris (extends Produk)
**Atribut**
- `jenis`: Jenis aksesoris (Headband, Pedang mainan)  
- `bahan`: Material aksesoris  
- `stokAksesoris`: Stok tersedia  

**Method**
- Getter & Setter  

## Pelanggan
**Atribut**
- `id_pelanggan`: ID unik pelanggan  
- `nama`: Nama pelanggan  
- `kontak`: Kontak pelanggan  

**Method**
- Getter & Setter  

## Pembayaran
**Atribut**
- `id_pembayaran`: ID unik pembayaran  
- `tanggalPembayaran`: Tanggal pembayaran  
- `metode`: Metode pembayaran (Cash, Transfer, dll)  
- `jumlah`: Jumlah dibayarkan  

**Method**
- Getter & Setter  

# Desain Program
Program ini menggunakan konsep OOP:  
- **Inheritance**: Kostum dan Aksesoris mewarisi Produk.  
- **Composition**:  
  - Toko memiliki daftar Transaksi.  
  - Transaksi memiliki daftar Produk, Pelanggan, dan Pembayaran.  
- **Array of Object (Collection)**:  
  - Toko menyimpan banyak Transaksi.  
  - Transaksi menyimpan banyak Produk, Pelanggan, dan Pembayaran.  
- **Hierarchical Inheritance (bonus)**: Kostum dan Aksesoris adalah turunan dari Produk.  

# Penjelasan Alur Program
1. **Inisialisasi Produk**  
   - Buat produk: Kostum Naruto, Headband Ninja, Kostum Sasuke, Pedang Mainan.  

2. **Inisialisasi Pelanggan**  
   - Buat pelanggan: Andi dan Budi.  

3. **Inisialisasi Pembayaran**  
   - Buat pembayaran dengan ID, tanggal, metode, jumlah.  

4. **Transaksi Pertama (T001)**  
   - Tambahkan produk: Kostum Naruto, Headband Ninja.  
   - Tambahkan pelanggan: Andi.  
   - Tambahkan pembayaran: Cash 200000.  
   - Hitung total harga.  

5. **Toko Menyimpan Transaksi Pertama**  
   - Buat Toko Kostum & Aksesoris.  
   - Masukkan transaksi T001 ke daftar transaksi toko.  
   - Cetak data transaksi SEBELUM penambahan transaksi kedua.  

6. **Transaksi Kedua (T002)**  
   - Tambahkan produk: Kostum Sasuke, Pedang Mainan.  
   - Tambahkan pelanggan: Budi.  
   - Tambahkan pembayaran: Transfer 295000.  
   - Hitung total harga.  

7. **Toko Menyimpan Transaksi Kedua**  
   - Masukkan transaksi T002 ke daftar transaksi toko.  
   - Cetak data transaksi SESUDAH penambahan.  

8. **Output ke Layar**  
   Program menampilkan:  
   - Informasi transaksi (ID, tanggal, total harga).  
   - Daftar produk (ID, nama, harga).  
   - Daftar pelanggan (ID, nama, kontak).  
   - Daftar pembayaran (ID, tanggal, metode, jumlah).  

# Dokumentasi C++

<img width="823" height="653" alt="1  hasil cpp" src="https://github.com/user-attachments/assets/971411c6-3b34-4cde-ac67-66bed1a68fab" />

<img width="823" height="653" alt="1  hasil cpp" src="https://github.com/user-attachments/assets/a1867870-32da-4e5e-83f9-5085ff688ca4" />


# Dokumentasi Python

<img width="755" height="640" alt="1  hasil python" src="https://github.com/user-attachments/assets/3d13849b-3c2b-46d5-b6e0-0d5b29cfb170" />

<img width="690" height="702" alt="2  hasil python" src="https://github.com/user-attachments/assets/4894d27d-2b0b-47ab-a920-12accaeba8c5" />


# Dokumentasi Java

<img width="736" height="631" alt="1  hasil java" src="https://github.com/user-attachments/assets/aa9f03b9-79e8-44f5-add0-e9cb82323837" />

<img width="708" height="682" alt="2  hasil java" src="https://github.com/user-attachments/assets/3e4e0efc-6f3d-46e9-854d-4f42d1fbfb10" />


