<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Latihan 2</title>
    <link rel="stylesheet" href="style.css">
</head>
<?php
// mengimpor kelas Mahasiswa.php dan Crud.php
require('Human.php');
require('SivitasAkademik.php');
require('Mahasiswa.php');
require('Crud.php');
// membuat objek Crud
$arr = new Crud();

// membuat objek Mahasiswa dan menambahkannya ke Crud
$mhs = new Mahasiswa("2106515", "ilkom", "FPMIPA", "fachri.edu", "UPI","210612731", "fachri", "L", "Seminar-nasional.png");
$arr->tambah($mhs);

// menampilkan data Mahasiswa yang telah diinisiasi
echo "<p>inisiasi data</p>";
$arr->tampil();
echo "<hr>";

// // membuat objek Mahasiswa baru dan menambahkannya ke Crud
$mhs = new Mahasiswa();
$mhs->setNik("2342324214");
$mhs->setNim("2104213");
$mhs->setNama("Najm");
$mhs->setJenisKelamin("Laki");
$mhs->setAsalUniv("UP");
$mhs->setEmailEdu("najm.edu");
$mhs->setProdi("Fisika");
$mhs->setFakultas("FPTK");
$mhs->setFoto("background-mokaku-ilkom-21.png");
$arr->tambah($mhs);

// menampilkan data Mahasiswa setelah penambahan data
echo "<p>menambah data</p>";
$arr->tampil();
echo "<hr>";
?>