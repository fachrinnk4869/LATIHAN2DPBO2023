class Human {
  private:
    string nik;// atribut NIK
    string nama;// atribut Nama
    string jenisKelamin;// Jenis Kelamin

  public:
    Human(){
      // inisiasi dengan string kosong
      this->nik = "";
      this->nama = "";
      this->jenisKelamin = "";
    }
    Human(string nik, string nama, string jenisKelamin){
      // inisiasi dengan value awal
      this->nama = nama;
      this->nik = nik;
      this->jenisKelamin = jenisKelamin;
    }

    string getNama(){
      // return nama human
      return this->nama;
    }
    string getNik(){
      // return nik human
      return this->nik;
    }
    string getJenisKelamin(){
      // rettun jenis kelamin
      return this->jenisKelamin;
    }
    void setNama(string nama){
      // mengganti value nama
      this->nama = nama;
    }
    void setNik(string nik){
      // mengganti value nik
      this->nik = nik;
    }
    void setJenisKelamin(string jenisKelamin){
      // mengganti value Jenis Kelamin
      this->jenisKelamin = jenisKelamin;
    }
};