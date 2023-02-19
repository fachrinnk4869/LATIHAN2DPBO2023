<?php
class Mahasiswa extends SivitasAkademik {
  private $nim;// atribut NIM
  private $prodi;// atribut prodi
  private $fakultas;// atribut fakultas
  private $foto;// atribut fakultas

  public function __construct($nim = "", $prodi = "", $fakultas= "", $emailEdu = "", $asalUniv = "", $nik ="", $nama = "", $jenisKelamin = "", $foto = ""){
    // inisiasi dengan value awal
    parent::__construct($emailEdu, $asalUniv, $nik, $nama, $jenisKelamin);
    $this->nim = $nim;
    $this->prodi = $prodi;
    $this->fakultas = $fakultas;
    $this->foto = $foto;
  }

  public function getNim(){
    // return NIM mahasiswa
    return $this->nim;
  }
  public function getProdi(){
    // return prodi
    return $this->prodi;
  }
  public function getFakultas(){
    //return fakultas
    return $this->fakultas;
  }
  public function getFoto(){
    // membuat method getter untuk property foto
    return $this->foto;
}
  public function setNim($nim){
    // menggati value NIM
    $this->nim = $nim;
  }
  public function setProdi($prodi){
    // mengganti value prodi
    $this->prodi = $prodi;
  }
  public function setFakultas($fakultas){
    // mengganti value fakultas
    $this->fakultas = $fakultas;
  }
  public function setFoto($foto){
    // membuat method setter untuk property foto
    $this->foto = $foto;
}

}
