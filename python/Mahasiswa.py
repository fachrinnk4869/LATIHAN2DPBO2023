from SivitasAkademik import SivitasAkademik

class Mahasiswa (SivitasAkademik):
  __nim = ''# atribut NIM
  __prodi = ''# atribut prodi
  __fakultas = ''# atribut fakultas


  def init(self, nik = '', nama = '', gender = '', asalUniv = '', emailEdu = '', nim = '', prodi = '', fakultas = ''):
    # inisiasi dengan value awal
    super().__init__(nik, nama, gender, asalUniv, emailEdu)
    self.__nim = nim
    self.__prodi = prodi
    self.__fakultas = fakultas
  

  def getNim(self):
    # return NIM mahasiswa
    return self.__nim
  
  def getProdi(self):
    # return prodi
    return self.__prodi
  
  def getFakultas(self):
    #return fakultas
    return self.__fakultas
  
  def setNim(self, nim):
    # menggati value NIM
    self.__nim = nim
  
  def setProdi(self,prodi):
    # mengganti value prodi
    self.__prodi = prodi
  
  def setFakultas(self, fakultas):
    # mengganti value fakultas
    self.__fakultas = fakultas
  