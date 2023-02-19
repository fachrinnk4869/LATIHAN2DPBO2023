class Mahasiswa :  public SivitasAkademik {
  private:
    string nim;// atribut NIM
    string prodi;// atribut prodi
    string fakultas;// atribut fakultas

  public:
    Mahasiswa(){
      // inisiasi dengan string kosong
      this->nim = "";
      this->prodi = "";
      this->fakultas = "";
    }
    Mahasiswa(string nim, string prodi, string fakultas, string emailEdu, string asalUniv, string nik, string nama, string jenisKelamin) : SivitasAkademik(emailEdu, asalUniv, nik, nama, jenisKelamin){
      // inisiasi dengan value awal
      this->nim = nim;
      this->prodi = prodi;
      this->fakultas = fakultas;
    }

     string getNim(){
      // return NIM mahasiswa
      return this->nim;
    }
     string getProdi(){
      // return prodi
      return this->prodi;
    }
     string getFakultas(){
      //return fakultas
      return this->fakultas;
    }
     void setNim(string nim){
      // menggati value NIM
      this->nim = nim;
    }
     void setProdi(string prodi){
      // mengganti value prodi
      this->prodi = prodi;
    }
     void setFakultas(string fakultas){
      // mengganti value fakultas
      this->fakultas = fakultas;
    }

};
