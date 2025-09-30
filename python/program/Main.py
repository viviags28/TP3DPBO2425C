from Kostum import Kostum
from Aksesoris import Aksesoris
from Pelanggan import Pelanggan
from Pembayaran import Pembayaran
from Transaksi import Transaksi
from Toko import Toko


# Fungsi untuk print semua transaksi
def print_transaksi(daftar):
    # Loop semua transaksi dalam daftar
    for t in daftar:
        print(f"ID Transaksi   : {t.get_id_transaksi()}")
        print(f"Tanggal        : {t.get_tanggal_transaksi()}")
        print(f"Total Harga    : {t.get_total_harga():.0f}\n")

        # Produk
        print("  Daftar Produk:")
        print(f"{'ID Produk':<12}{'Nama Produk':<20}{'Harga':<10}")
        print("-" * 50)
        for p in t.get_daftar_produk():
            print(f"{p.get_id_produk():<12}{p.get_nama_produk():<20}{p.get_harga():<10.0f}")
        print("-" * 60 + "\n")

        # Pelanggan
        print("  Daftar Pelanggan:")
        print(f"{'ID Pelanggan':<12}{'Nama':<20}{'Kontak':<15}")
        print("-" * 60)
        for plg in t.get_daftar_pelanggan():
            print(f"{plg.get_id_pelanggan():<12}{plg.get_nama():<20}{plg.get_kontak():<15}")
        print("-" * 60 + "\n")

        # Pembayaran
        print("  Daftar Pembayaran:")
        print(f"{'ID Bayar':<12}{'Tanggal':<15}{'Metode':<15}{'Jumlah':<10}")
        print("-" * 60)
        for byr in t.get_daftar_pembayaran():
            print(f"{byr.get_id_pembayaran():<12}{byr.get_tanggal_pembayaran():<15}"
                  f"{byr.get_metode():<15}{byr.get_jumlah():<10.0f}")
        print("-" * 60)
        print("=" * 60 + "\n")


def main():
    # Buat produk
    k1 = Kostum("K001", "Kostum Naruto", 150000, "L", "Naruto", 10)
    a1 = Aksesoris("A001", "Headband Ninja", 50000, "Kepala", "Kain", 20)

    k2 = Kostum("K002", "Kostum Sasuke", 175000, "M", "Sasuke", 8)
    a2 = Aksesoris("A002", "Pedang Mainan", 120000, "Senjata", "Plastik", 5)

    # Buat pelanggan
    c1 = Pelanggan("C001", "Andi", "081234567")
    c2 = Pelanggan("C002", "Budi", "089876543")

    # Buat pembayaran
    b1 = Pembayaran("B001", "2025-09-30", "Cash", 200000)
    b2 = Pembayaran("B002", "2025-09-30", "Transfer", 295000)

    # Buat transaksi pertama
    t1 = Transaksi("T001", "2025-09-30")
    t1.tambah_produk(k1)
    t1.tambah_produk(a1)
    t1.tambah_pelanggan(c1)
    t1.tambah_pembayaran(b1)

    # Buat toko
    toko = Toko("TOKO1", "Toko Kostum & Aksesoris", "Jl. Ninja No.1")
    toko.tambah_transaksi(t1)

    # Tampilkan transaksi sebelum penambahan
    print("Data Transaksi SEBELUM Penambahan")
    print_transaksi(toko.get_daftar_transaksi())

    # Buat transaksi kedua
    t2 = Transaksi("T002", "2025-09-30")
    t2.tambah_produk(k2)
    t2.tambah_produk(a2)
    t2.tambah_pelanggan(c2)
    t2.tambah_pembayaran(b2)

    # Tambahkan transaksi kedua ke toko
    toko.tambah_transaksi(t2)

    # Tampilkan transaksi sesudah penambahan
    print("Data Transaksi SESUDAH Penambahan")
    print_transaksi(toko.get_daftar_transaksi())


if __name__ == "__main__":
    main()
