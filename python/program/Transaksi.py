class Transaksi:
    def __init__(self, id_transaksi="", tanggal_transaksi=""):
        self.id_transaksi = id_transaksi
        self.tanggal_transaksi = tanggal_transaksi
        self.total_harga = 0.0
        self.daftar_produk = []
        self.daftar_pelanggan = []
        self.daftar_pembayaran = []

    # Getter
    def get_id_transaksi(self):
        return self.id_transaksi

    def get_tanggal_transaksi(self):
        return self.tanggal_transaksi

    def get_total_harga(self):
        return self.total_harga

    # Setter
    def set_id_transaksi(self, id_transaksi):
        self.id_transaksi = id_transaksi

    def set_tanggal_transaksi(self, tanggal_transaksi):
        self.tanggal_transaksi = tanggal_transaksi

    # Methods
    def tambah_produk(self, produk):
        self.daftar_produk.append(produk)
        self.total_harga += produk.get_harga()

    def hapus_produk(self, id_produk):
        for i, produk in enumerate(self.daftar_produk):
            if produk.get_id_produk() == id_produk:
                del self.daftar_produk[i]
                self.hitung_total()
                return  # langsung keluar

    def tambah_pelanggan(self, pelanggan):
        self.daftar_pelanggan.append(pelanggan)

    def tambah_pembayaran(self, pembayaran):
        self.daftar_pembayaran.append(pembayaran)

    def hitung_total(self):
        self.total_harga = 0.0
        for produk in self.daftar_produk:
            self.total_harga += produk.get_harga()

    # Getter daftar untuk main
    def get_daftar_produk(self):
        return self.daftar_produk

    def get_daftar_pelanggan(self):
        return self.daftar_pelanggan

    def get_daftar_pembayaran(self):
        return self.daftar_pembayaran
