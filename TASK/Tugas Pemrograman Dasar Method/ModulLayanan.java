public class ModulLayanan {
    // 25. Hitung poin belanja
    public static int tambahPoin(int totalBelanja) {
        return totalBelanja / 10000;
    }

    // 26. Cek gratis ongkir
    public static boolean isGratisOngkir(int totalBelanja, double jarak) {
        return totalBelanja >= 150000 && jarak <= 5.0;
    }

    // 27. Hitung ongkos kirim
    public static int hitungOngkir(double jarakKm, int tarifPerKm) {
        return (int) (jarakKm * tarifPerKm);
    }

    // 28. Cetak label pengiriman
    public static void cetakLabelPengiriman(String nama, String alamat) {
        System.out.println("Penerima: " + nama + " | Alamat: " + alamat);
    }

    // 29. Konversi poin ke rupiah
    public static int konversiPoinKeRupiah(int poin) {
        return poin * 100;
    }

    // 30. Cetak info member
    public static void cetakInfoMember(String namaMember, int poin) {
        System.out.println("Member: " + namaMember + " | Poin Aktif: " + poin);
    }
}
