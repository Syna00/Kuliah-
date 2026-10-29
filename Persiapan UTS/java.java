public class java {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Teknik Komputer");
        System.out.println("Universitas Diponegoro");

        int x = 10;
        System.out.println("Nilai x = " + x);
        String nama = "Agus Kurniawan";
        System.out.println("nama mahasiswa : " + nama);
        double y = 15.890;
        System.out.println("Nilai y = " + y);
        char kar = 'G';
        System.out.println("Karakter = " + kar);
        boolean status = false;
        System.out.println("Status = " + status);

        // Operator : + - * / % inc dec += *=
        int a = 100;
        int b = 200;
        int c = a + b;
        System.out.println("nilai c = " + c);
        a += 50; // a = a + 50
        System.out.println("nilai a sekarang = " + a);
        a *= 4;  // a = a * 4
        System.out.println("nilai a = " + a);

        // kondisional: konversi skor ke nilai
        int skor = 90;
        char nilai;
        if (skor >= 80 && skor <= 100) nilai = 'A';
        else if (skor >= 70 && skor < 80) nilai = 'B';
        else if (skor >= 60 && skor < 70) nilai = 'C';
        else if (skor >= 50 && skor < 60) nilai = 'D';
        else nilai = 'E';

        System.out.println("skor = " + skor + " ---> nilai = " + nilai);

        // Konversi nilai ke bobot
        int bobot;
        switch (nilai) {
            case 'A': bobot = 4; break;
            case 'B': bobot = 3; break;
            case 'C': bobot = 2; break;
            case 'D': bobot = 1; break;
            default:  bobot = 0; break;
        }
        System.out.println("Bobot = " + bobot);
    }
}