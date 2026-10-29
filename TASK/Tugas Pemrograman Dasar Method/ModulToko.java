public class ModulToko {
    // 1. Menampilkan header toko
    public static void cetakHeader() {
        System.out.println("===============================");
        System.out.println("     TOKO KELAS D MAJU JAYA     ");
        System.out.println("===============================");
    }

    // 2. Menampilkan footer nota
    public static void cetakFooter() {
        System.out.println("Terima kasih telah berbelanja!");
    }

    // 3. Format nama produk menjadi kapital
    public static String formatNamaProduk(String nama) {
        return nama.toUpperCase();
    }

    // 4. Format sapaan pembeli
    public static String sapaPembeli(String namaPelanggan) {
        return "Selamat Datang, Kak " + namaPelanggan + "!";
    }

    // 5. Cek apakah kode voucher kosong
    public static boolean isVoucherKosong(String kodeVoucher) {
        return kodeVoucher.isEmpty();
    }

    // 6. Membuat ID Transaksi
    public static String buatIdTransaksi(int nomorNota) {
        return "TRX-" + nomorNota;
    }
}
