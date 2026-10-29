#include <iostream>
#include <string>      // diperlukan untuk tipe string
using namespace std;

int main()
{
    cout << "Hello World!" << endl;
    cout << "Teknik Komputer" << endl;
    cout << "Universitas Diponegoro" << endl;

    int x = 10;
    cout << "Nilai x = " << x << endl;
    string nama = "Agus Kurniawan";
    cout << "nama mahasiswa : " << nama << endl;
    float y = 15.678; // pecahan
    cout << "Nilai y = " << y << endl;
    char kar = 'G';
    cout << "Karakter = " << kar << endl;
    bool status = false;
    cout << "Status = " << boolalpha << status << endl; // tampil true/false, bukan 1/0

    // Operator : + - * / % inc dec += *=
    int a = 100;
    int b = 200;
    int c = a + b;
    cout << "nilai c = " << c << endl;
    a += 50; // a = a + 50
    cout << "nilai a sekarang = " << a << endl;
    a *= 4;  // a = a * 4
    cout << "nilai a = " << a << endl;

    // kondisional
    // konversi skor ke nilai
    int skor = 75;
    char nilai;
    if (skor >= 80 && skor <= 100) nilai = 'A';
    else if (skor >= 70 && skor < 80) nilai = 'B';
    else if (skor >= 60 && skor < 70) nilai = 'C';
    else if (skor >= 50 && skor < 60) nilai = 'D';
    else nilai = 'E';

    cout << "skor = " << skor << " ---> nilai = " << nilai << endl;

    // 70 --> B ---> 3
    // Konversi nilai ke bobot
    int bobot;
    switch (nilai) {
        case 'A': bobot = 4; break;
        case 'B': bobot = 3; break;
        case 'C': bobot = 2; break;
        case 'D': bobot = 1; break;
        default:  bobot = 0; break;
    }
    cout << "Bobot = " << bobot << endl;

    return 0;
}