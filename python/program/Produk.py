class Produk:
    def __init__(self, id_produk: str = "", nama: str = "", harga: float = 0.0):
        self.id_produk = id_produk
        self.nama_produk = nama
        self.harga = harga

    # Getter
    def get_id_produk(self):
        return self.id_produk

    def get_nama_produk(self):
        return self.nama_produk

    def get_harga(self):
        return self.harga

    # Setter
    def set_id_produk(self, id_produk: str):
        self.id_produk = id_produk

    def set_nama_produk(self, nama: str):
        self.nama_produk = nama

    def set_harga(self, harga: float):
        self.harga = harga