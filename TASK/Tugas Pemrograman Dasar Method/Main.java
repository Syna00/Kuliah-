public class Main {
    public static void main(String[] args) {
        // --- UJI KODE ANGGOTA 1 ---
        ModulToko.cetakHeader();
        System.out.println(ModulToko.sapaPembeli("Budi"));
        System.out.println("ID Transaksi: " + ModulToko.buatIdTransaksi(101));

        // --- UJI KODE ANGGOTA 2 ---
        int subtotal = ModulPerhitungan.hitungSubtotal(15000, 2);
        double diskon = ModulPerhitungan.hitungNominalDiskon(subtotal, 10.0);
        double totalAkhir = ModulPerhitungan.hitungTotalSetelahDiskon(subtotal, diskon);
        System.out.println("Total Bayar: Rp" + totalAkhir);

        // --- UJI KODE ANGGOTA 3 ---
        boolean cukup = ModulLogika.isUangCukup(50000, (int) totalAkhir);
        System.out.println("Apakah uang cukup? " + cukup);

        // --- UJI KODE ANGGOTA 4 ---
        ModulInventaris.cetakRincianBarang("Buku Tulis", 15000, 2);
        int stokSisa = ModulInventaris.kurangiStok(10, 2);
        System.out.println("Sisa stok barang: " + stokSisa);

        // --- UJI KODE ANGGOTA 5 ---
        int poinBaru = ModulLayanan.tambahPoin((int) totalAkhir);
        ModulLayanan.cetakInfoMember("Budi", poinBaru);
        ModulToko.cetakFooter();
    }
}
