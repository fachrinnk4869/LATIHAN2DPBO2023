<?php
class Human {
  private $nik;// atribut NIK
  private $nama;// atribut Nama
  private $jenisKelamin;// Jenis Kelamin

  public function __construct($nik = "", $nama = "", $jenisKelamin= ""){
    // inisiasi dengan value awal
    $this->nama = $nama;
    $this->nik = $nik;
    $this->jenisKelamin = $jenisKelamin;
  }

  public function getNama(){
    // return nama human
    return $this->nama;
  }
  public function getNik(){
    // return nik human
    return $this->nik;
  }
  public function getJenisKelamin(){
    // rettun jenis kelamin
    return $this->jenisKelamin;
  }
  public function setNama($nama){
    // mengganti value nama
    $this->nama = $nama;
  }
  public function setNik($nik){
    // mengganti value nik
    $this->nik = $nik;
  }
  public function setJenisKelamin($jenisKelamin){
    // mengganti value Jenis Kelamin
    $this->jenisKelamin = $jenisKelamin;
  }
}
