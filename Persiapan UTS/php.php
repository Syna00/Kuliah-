<?php
    echo "Hello, World! \n";
    echo "Teknik Komputer \n";
    echo "Universitas Diponegoro \n";

    // Variabel dan tipe data
    $x = 10;
    echo "Nilai x = " . $x . "\n";
    $nama = "Agus Kurniawan";
    echo "nama mahasiswa : " . $nama . "\n";

    $y = 15.888; // pecahan
    echo "Nilai y = " . $y . "\n";

    $kar = 'G';
    echo "Karakter = " . $kar . "\n";

    $status = true;
    echo "Status = " . ($status ? "true" : "false") . "\n"; // true tampil "1", false tampil kosong, jadi diubah ke teks

    // Operator : + - * / % inc dec += *=
    $a = 100;
    $b = 200;
    $c = $a + $b;
    echo "nilai c = " . $c . "\n";

    $a += 50; // a = a + 50
    echo "Nilai a sekarang = " . $a . "\n";
    $a *= 4;  // a = a * 4
    echo "Nilai a sekarang = " . $a . "\n";

    // kondisional: konversi skor ke nilai
    $skor = 90;
    if ($skor >= 80 && $skor <= 100) $nilai = 'A';
    else if ($skor >= 70 && $skor < 80) $nilai = 'B';
    else if ($skor >= 60 && $skor < 70) $nilai = 'C';
    else if ($skor >= 50 && $skor < 60) $nilai = 'D';
    else $nilai = 'E';

    echo "skor = " . $skor . " ---> nilai = " . $nilai . "\n";

    // Konversi nilai ke bobot
    switch ($nilai) {
        case 'A': $bobot = 4; break;
        case 'B': $bobot = 3; break;
        case 'C': $bobot = 2; break;
        case 'D': $bobot = 1; break;
        default:  $bobot = 0; break;
    }
    echo "Bobot = " . $bobot . "\n";
?>