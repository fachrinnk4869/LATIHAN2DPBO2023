<?php
class SivitasAkademik extends Human {
  private $asalUniv;// atribut asal Universitas
  private $emailEdu;// atribut Email edu

  public function __construct($emailEdu = "", $asalUniv = "", $nik ="", $nama = "", $jenisKelamin = ""){
    // inisias dengan value awal
    parent::__construct($nik, $nama, $jenisKelamin);
    $this->asalUniv = $asalUniv;
    $this->emailEdu = $emailEdu;
  }

  public function getAsalUniv(){
    // return Asal Universitas
    return $this->asalUniv;
  }
  public function getEmailEdu(){
    // return Email Edu
    return $this->emailEdu;
  }
  public function setAsalUniv($asalUniv){
    // mengganti value Asal Universitas
    $this->asalUniv = $asalUniv;
  }
  public function setEmailEdu($emailEdu){
    // mengganti Email Edu
    $this->emailEdu = $emailEdu;
  }
}


?>