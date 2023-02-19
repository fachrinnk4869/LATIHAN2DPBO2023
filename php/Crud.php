<?php
class Crud {
  private $list = array();// array untuk menyimpan kelas Mahasiswa
  private $listNim = array();// array untuk menyimpan nim dari mahasiswa

  public function __construct(){
    //
  }

  public function tambah($mhs){
    // menambahkan data ke array
    if(in_array($mhs->getNim(), $this->listNim)){// kalau key id dari data udah ada
      echo "data yang ingin anda tambah tidak unique value";
      return;
    }
    array_push($this->list, $mhs);
    array_push($this->listNim, $mhs->getNim());
  }

  public function tampil(){
    // menampilkan seluruh data pada array
    echo "<table>";
    echo "
    <tr>
      <th>No</th>
      <th>NIK</th>
      <th>NIM</th>
      <th>Nama</th>
      <th>Jenis Kelamin</th>
      <th>Asal Universitas</th>
      <th>Email Edu</th>
      <th>Prodi</th>
      <th>Fakultas</th>
      <th>Foto</th>
      </tr>
    ";
    for($i = 0;$i <count($this->list);$i++){
      echo
      "<tr> <td>".
      ($i + 1) 
      . " </td><td> " . $this->list[$i]->getNik()
      . " </td><td> " . $this->list[$i]->getNim()
      . " </td><td> " . $this->list[$i]->getNama()
      . " </td><td> " . $this->list[$i]->getJenisKelamin()
      . " </td><td> " . $this->list[$i]->getAsalUniv()
      . " </td><td> " . $this->list[$i]->getEmailEdu()
      . " </td><td> " . $this->list[$i]->getProdi()
      . " </td><td> " . $this->list[$i]->getFakultas()
      . "</td><td>" . "<img src=assets/" . $this->list[$i]->getFoto() . " alt=" .$this->list[$i]->getFoto() . ">" 
      . "</td></tr>"
      ;
    }
    echo "</table>";
  }

}

?>