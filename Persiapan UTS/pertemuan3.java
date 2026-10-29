import java.util.*;

public class pertemuan3 {
    public static void main(String[] args) {
        // Operator : aritmatika : +, -, *, /, %
        // x += 10 artinya x = x + 10
        int x = 100;
        x += 50;
        System.out.println("x = " + x);
        x *= 5; // x = x*5
        System.out.println("x *= " + x);
        x -= 100;
        System.out.println("x -= " + x);
        x /= 50;
        System.out.println("x /= " + x);
        // increment x += 1 atau ++x
        System.out.println("increment x = " + (++x));
        // decrement x -= 1 atau --x
        System.out.println("decrement x = " + (--x));

        // Operator Logika : && (AND), || (OR), ! (NOT)
        // && (AND) akan memiliki luaran True (1/ya) jika semua inputnya True
        // || (OR) akan memiliki luaran True (1/ya) jika salah satu inputnya True
        // ! (NOT) akan memiliki luaran False (0/tidak) jika
        int a = 100;
        int b = 200;
        boolean hasil1 = a > b;
        System.out.println("a>b : " + hasil1);
        boolean hasil2 = a < b;
        System.out.println("a<b : " + hasil2);
        boolean hasil3 = hasil1 && hasil2;
        System.out.println("Hasil3 = " + hasil3);
        boolean hasil4 = hasil1 || hasil2;
        System.out.println("hasil4 = " + hasil4);
        boolean hasil5 = !hasil4;
        System.out.println("hasil5 = " + hasil5);

        // Pencabangan :
        // 1. Pemilihan / Seleksi / Kondisional
        // 2. Perulangan / Loop
        // if (Kondisi) Pernyataan benar
        // else pernyataan salah
        // Contoh menentukan sebuah bilangan genap / ganjil

        int angka = 100;
        int hasil = angka % 2; // Nilainya antara 0 dan 1
        if (hasil == 0) System.out.println("Angka Genap");
        else System.out.println("Angka Ganjil");

        int score = 76;
        char nilai = 'B';
        if (score >= 70 && score < 80) nilai = 'B';
        else nilai = 'E';
        System.out.println("Nilai = " + nilai);

        // Login
        String username = "rasya";
        String userinput = "RASYA";
        if (username == userinput) System.out.println("Login berhasil");
        else System.out.println("Login Gagal! ");

        // Menentukan jenis akar persamaan : ax^2 + bx + c = 0
        // Diskriminan d = b*b-4*a*c
        // Jika d>=0 maka akar persamaan riil
        // Akar persamaan imajiner

        int c, d;
        a = 8;
        b = 20;
        c = 5;
        d = b * b - 4 * a * c;
        System.out.println("Diskriminan d = " + d);
        if (d >= 0) System.out.println("akar rill");
        else System.out.println("akar imajiner");
    }
}
