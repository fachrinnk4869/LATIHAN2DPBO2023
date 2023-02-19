class Human:
    __nik = '' # atribut NIK
    __nama = ''# atribut Nama
    __jenisKelamin = '' # Jenis Kelamin
    
    def __init__(self, nik= '', nama = '', jenisKelamin = ''):
      # inisiasi dengan value awal
      self.__nama = nama
      self.__nik = nik
      self.__jenisKelamin = jenisKelamin
    

    def getNama(self):
      # return nama human
      return self.__nama
    
    def getNik(self):
      # return nik human
      return self.__nik
    
    def getJenisKelamin(self):
      # rettun jenis kelamin
      return self.__jenisKelamin
    
    def setNama(self, nama):
      # mengganti value nama
      self.__nama = nama
    
    def setNik(self, nik):
      # mengganti value nik
      self.__nik = nik
    
    def setJenisKelamin(self, jenisKelamin):
      # mengganti value Jenis Kelamin
      self.__jenisKelamin = jenisKelamin
    
