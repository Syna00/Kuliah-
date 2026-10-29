public class ModulLogika {
    // 13. Cek kecukupan uang
    public static boolean isUangCukup(int bayar, int total) {
        return bayar >= total;
    }

    // 14. Cek kriteria bonus
    public static boolean dapatBonus(int totalBelanja) {
        return totalBelanja >= 100000;
    }

    // 15. Cek kelayakan diskon member
    public static boolean isMemberEligible(boolean statusMember, int poin) {
        return statusMember && poin > 50;
    }

    // 16. Cari harga termahal
    public static int cariHargaTermahal(int harga1, int harga2) {
        return (harga1 > harga2) ? harga1 : harga2;
    }

    // 17. Cari harga termurah
    public static int cariHargaTermurah(int harga1, int harga2) {
        return (harga1 < harga2) ? harga1 : harga2;
    }

    // 18. Cek stok kritis
    public static boolean isStokKritis(int stok) {
        return stok < 5;
    }
}