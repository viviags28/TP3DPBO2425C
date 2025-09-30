from Produk import Produk  # ambil base class Produk

class Aksesoris(Produk):
    def __init__(self, id_produk: str = "", nama: str = "", harga: float = 0.0,
                 jenis: str = "", bahan: str = "", stok: int = 0):
        super().__init__(id_produk, nama, harga)  # panggil constructor Produk
        self.jenis = jenis
        self.bahan = bahan
        self.stok_aksesoris = stok

    # Getter
    def get_jenis(self):
        return self.jenis

    def get_bahan(self):
        return self.bahan

    def get_stok_aksesoris(self):
        return self.stok_aksesoris

    # Setter
    def set_jenis(self, jenis: str):
        self.jenis = jenis

    def set_bahan(self, bahan: str):
        self.bahan = bahan

    def set_stok_aksesoris(self, stok: int):
        self.stok_aksesoris = stok
