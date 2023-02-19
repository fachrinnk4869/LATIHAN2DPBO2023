class Crud{
  private:
    vector<Mahasiswa> list;     // atribut list dengan tipe data vector of class Mahasiswa
    vector<string> listNim;     // atribut list NIM dengan tipe data vector of string
  public:
    // Konstruktor
    Crud(){}

    // Method untuk menambahkan objek Mahasiswa ke dalam list
    void tambah(Mahasiswa mhs){
      // Cek apakah NIM mahasiswa yang ingin ditambahkan sudah ada di dalam list
      if(find(listNim.begin(), listNim.end(), mhs.getNim()) != listNim.end()){
        cout << "Data yang ingin Anda tambah tidak unique value" << endl;
        return;
      }
      // Jika NIM belum ada di dalam list, tambahkan Mahasiswa ke dalam list dan tambahkan NIM ke dalam listNim
      this->list.push_back(mhs);
      this->listNim.push_back(mhs.getNim());
    }

    // Method untuk menampilkan semua objek Mahasiswa dalam list
    void tampil(){
      for(int i = 0; i < list.size(); i++){
        cout << 
        (i + 1) 
        << "\nNIK : " << list[i].getNik()
        << "\nNIM : " << list[i].getNim()
        << "\nNama : " << list[i].getNama()
        << "\nJenis Kelamin : " << list[i].getJenisKelamin()
        << "\nAsal universitas : " << list[i].getAsalUniv()
        << "\nEmail Edu : " << list[i].getEmailEdu()
        << "\nProdi : " << list[i].getProdi()
        << "\nFakultas : " << list[i].getFakultas()
        << "\n";
      }
    }
};