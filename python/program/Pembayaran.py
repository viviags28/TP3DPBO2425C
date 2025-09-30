class Pembayaran:
    def __init__(self, id_pembayaran="", tanggal_pembayaran="", metode="", jumlah=0.0):
        self.id_pembayaran = id_pembayaran
        self.tanggal_pembayaran = tanggal_pembayaran
        self.metode = metode
        self.jumlah = jumlah

    # Getter
    def get_id_pembayaran(self):
        return self.id_pembayaran

    def get_tanggal_pembayaran(self):
        return self.tanggal_pembayaran

    def get_metode(self):
        return self.metode

    def get_jumlah(self):
        return self.jumlah

    # Setter
    def set_id_pembayaran(self, id_pembayaran):
        self.id_pembayaran = id_pembayaran

    def set_tanggal_pembayaran(self, tanggal_pembayaran):
        self.tanggal_pembayaran = tanggal_pembayaran

    def set_metode(self, metode):
        self.metode = metode

    def set_jumlah(self, jumlah):
        self.jumlah = jumlah
