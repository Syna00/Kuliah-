import java.util.*;

public class pertemuan3ifelse {
    public static void main(String[] args) {
        // if....else if....else....
        // konversi skor ke nilai
        // skor nilai
        // 85-100 A
        // 80-84  AB
        // 70-79  B
        // 65-69  BC
        // 55-64  C
        // 45-55  D
        // 0-45   E

        // Input skor, Output nilai
        // int skor = -9;
        double skor = 44.4;
        String nilai;

        // Proses konversi
        if (skor >= 85 && skor <= 100) nilai = "A";
        else if (skor >= 80 && skor < 85) nilai = "AB";
        else if (skor >= 70 && skor < 79) nilai = "B";
        else if (skor >= 65 && skor < 70) nilai = "BC";
        else if (skor >= 55 && skor < 65) nilai = "C";
        else if (skor >= 45 && skor < 55) nilai = "D";
        else if (skor >= 0 && skor < 45) nilai = "E";
        else nilai = "Salah Input";

        // tampilkan nilai
        System.out.println("Nilai : " + nilai);

        // contoh nilai    bobot
        // nilai----> bobot
        // A--->4
        // AB--->3.5
        // B--->3
        // C--->2
        // D--->1
        // E--->0
        // input nilai
        // output bobot
        double bobot;
        if (nilai == ("A")) bobot = 4;
        else if (nilai == ("AB")) bobot = 3.5;
        else if (nilai == ("B")) bobot = 3;
        else if (nilai == ("BC")) bobot = 2.5;
        else if (nilai == ("C")) bobot = 2;
        else if (nilai == ("D")) bobot = 1;
        else if (nilai == ("E")) bobot = 0;
        else bobot = -1;

        // tampilkan bobot
        System.out.println("Bobotnya : " + bobot);
    }
}