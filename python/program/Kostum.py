from Produk import Produk 

class Kostum(Produk):
    def __init__(self, id_produk: str = "", nama: str = "", harga: float = 0.0,
                 ukuran: str = "", karakter: str = "", stok: int = 0):
        super().__init__(id_produk, nama, harga)  # panggil constructor Produk
        self.ukuran = ukuran
        self.karakter = karakter
        self.stok_kostum = stok

    # Getter
    def get_ukuran(self):
        return self.ukuran

    def get_karakter(self):
        return self.karakter

    def get_stok_kostum(self):
        return self.stok_kostum

    # Setter
    def set_ukuran(self, ukuran: str):
        self.ukuran = ukuran

    def set_karakter(self, karakter: str):
        self.karakter = karakter

    def set_stok_kostum(self, stok: int):
        self.stok_kostum = stok
