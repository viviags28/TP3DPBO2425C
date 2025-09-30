class Pelanggan:
    def __init__(self, id_pelanggan="", nama="", kontak=""):
        self.id_pelanggan = id_pelanggan
        self.nama = nama
        self.kontak = kontak

    # Getter
    def get_id_pelanggan(self):
        return self.id_pelanggan

    def get_nama(self):
        return self.nama

    def get_kontak(self):
        return self.kontak

    # Setter
    def set_id_pelanggan(self, id_pelanggan):
        self.id_pelanggan = id_pelanggan

    def set_nama(self, nama):
        self.nama = nama

    def set_kontak(self, kontak):
        self.kontak = kontak
