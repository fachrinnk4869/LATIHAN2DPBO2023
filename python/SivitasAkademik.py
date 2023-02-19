from Human import Human

class SivitasAkademik(Human):
    __asalUniv = ''# atribut asal Universitas
    __emailEdu = ''# atribut Email edu


    def __init__(self, emailEdu = '', asalUniv= '', nik = '', nama = '', jenisKelamin = ''):
      # inisias dengan value awal
      super().__init__(nik, nama, jenisKelamin)
      self.__asalUniv = asalUniv
      self.__emailEdu = emailEdu
    

    def getAsalUniv(self):
      # return Asal Universitas
      return self.__asalUniv
    
    def getEmailEdu(self):
      # return Email Edu
      return self.__emailEdu
    
    def setAsalUniv(self, asalUniv):
      # mengganti value Asal Universitas
      self.__asalUniv = asalUniv
    
    def setEmailEdu(self, emailEdu):
      # mengganti Email Edu
      self.__emailEdu = emailEdu
    

