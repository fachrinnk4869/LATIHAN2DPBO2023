class SivitasAkademik :  public Human {
  private:
    string asalUniv;// atribut asal Universitas
    string emailEdu;// atribut Email edu

  public:
    SivitasAkademik(){
      // inisiasi atribut dengan string kosong
      this->emailEdu = "";
      this->asalUniv = "";
    }
    SivitasAkademik(string emailEdu, string asalUniv, string nik, string nama, string jenisKelamin) : Human(nik, nama, jenisKelamin){
      // inisias dengan value awal
      this->asalUniv = asalUniv;
      this->emailEdu = emailEdu;
    }

    string getAsalUniv(){
      // return Asal Universitas
      return this->asalUniv;
    }
    string getEmailEdu(){
      // return Email Edu
      return this->emailEdu;
    }
    void setAsalUniv(string asalUniv){
      // mengganti value Asal Universitas
      this->asalUniv = asalUniv;
    }
    void setEmailEdu(string emailEdu){
      // mengganti Email Edu
      this->emailEdu = emailEdu;
    }
};
