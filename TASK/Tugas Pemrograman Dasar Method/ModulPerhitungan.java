public class ModulPerhitungan {
    // 7. Hitung subtotal
    public static int hitungSubtotal(int harga, int jumlah) {
        return harga * jumlah;
    }

    // 8. Hitung total 2 barang
    public static int hitungTotalDuaBarang(int item1, int item2) {
        return item1 + item2;
    }

    // 9. Hitung kembalian
    public static int hitungKembalian(int bayar, int total) {
        return bayar - total;
    }

    // 10. Hitung nominal diskon
    public static double hitungNominalDiskon(int total, double persenDiskon) {
        return total * (persenDiskon / 100.0);
    }

    // 11. Hitung total setelah diskon
    public static double hitungTotalSetelahDiskon(int total, double nominalDiskon) {
        return total - nominalDiskon;
    }

    // 12. Hitung PPN 11%
    public static double hitungPajak(double total) {
        return total * 0.11;
    }
}
