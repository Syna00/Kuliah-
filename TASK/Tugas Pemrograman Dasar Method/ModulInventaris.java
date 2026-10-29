public class ModulInventaris {
    // 19. Kurangi stok barang
    public static int kurangiStok(int stokAwal, int jumlahBeli) {
        return stokAwal - jumlahBeli;
    }

    // 20. Tambah stok barang
    public static int tambahStok(int stokAwal, int jumlahMasuk) {
        return stokAwal + jumlahMasuk;
    }

    // 21. Cetak rincian barang
    public static void cetakRincianBarang(String nama, int harga, int qty) {
        System.out.println(nama + " x" + qty + " = Rp" + (harga * qty));
    }

    // 22. Peringatan stok habis
    public static void peringatanStokHabis(String namaBarang) {
        System.out.println("ALERT: Stok barang " + namaBarang + " sudah habis!");
    }

    // 23. Hitung berat total
    public static double hitungBeratTotal(double beratSatuan, int qty) {
        return beratSatuan * qty;
    }

    // 24. Hitung sisa kapasitas rak
    public static int sisaKapasitasRak(int kapasitasMaks, int barangTerisi) {
        return kapasitasMaks - barangTerisi;
    }
}
