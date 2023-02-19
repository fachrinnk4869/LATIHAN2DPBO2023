class Crud:
  __list = [] # deklarasi atribut private list untuk menyimpan objek Mahasiswa
  __listNim = [] # deklarasi atribut private list untuk menyimpan NIM dari objek Mahasiswa

  def tambah(self, mhs):
    # method untuk menambahkan objek Mahasiswa ke dalam list __list dan NIM ke dalam list __listNim
    if(mhs.getNim() in self.__listNim): # cek apakah NIM sudah terdaftar pada list __listNim
      print("data yang ingin anda tambah tidak unique value") # jika sudah, cetak pesan bahwa data tidak unik
      return
    self.__list.append(mhs) # tambahkan objek Mahasiswa ke dalam list __list
    self.__listNim.append(mhs.getNim()) # tambahkan NIM ke dalam list __listNim
    
  def tampil(self):
    # method untuk menampilkan seluruh objek Mahasiswa pada list __list beserta atribut-atributnya
    # print("keren")
    for i in range(len(self.__list)): # loop sebanyak panjang dari list __list
      print( 
      str(i + 1) 
      , "\nNIK : " , self.__list[i].getNik()
      , "\nNIM : " , self.__list[i].getNim()
      , "\nNama : " , self.__list[i].getNama()
      , "\nJenis Kelamin : " , self.__list[i].getJenisKelamin()
      , "\nAsal universitas : " , self.__list[i].getAsalUniv()
      , "\nEmail Edu : " , self.__list[i].getEmailEdu()
      , "\nProdi : " , self.__list[i].getProdi()
      , "\nFakultas : " , self.__list[i].getFakultas()
      , "\n"
      )
      # print()