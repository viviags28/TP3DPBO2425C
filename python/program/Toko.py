class Toko:
    def __init__(self, id_toko="", nama_toko="", alamat=""):
        self.id_toko = id_toko
        self.nama_toko = nama_toko
        self.alamat = alamat
        self.daftar_transaksi = []

    # Getter
    def get_id_toko(self):
        return self.id_toko

    def get_nama_toko(self):
        return self.nama_toko

    def get_alamat(self):
        return self.alamat

    # Setter
    def set_id_toko(self, id_toko):
        self.id_toko = id_toko

    def set_nama_toko(self, nama_toko):
        self.nama_toko = nama_toko

    def set_alamat(self, alamat):
        self.alamat = alamat

    # Method
    def tambah_transaksi(self, transaksi):
        self.daftar_transaksi.append(transaksi)

    # Getter daftar transaksi
    def get_daftar_transaksi(self):
        return self.daftar_transaksi
