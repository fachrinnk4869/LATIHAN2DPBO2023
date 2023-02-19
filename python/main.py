from Mahasiswa import Mahasiswa
from Crud import Crud 

arr = Crud()
print("masukkan perintah: ")# masukkan perintah awal

sign = str(input())
while(sign != "exit"):# sampai mendapatkan input exit maka terus melooping
  if(sign == "tampil"):
    # menampilkan data mahasiswa lengkap
    arr.tampil()
  
  elif(sign == "tambah"):
    # menambah data ke list
    mhs = Mahasiswa()
    val = str(input())
    mhs.setNik(val)

    val = str(input())
    mhs.setNim(val)

    val = str(input())
    mhs.setNama(val)

    val = str(input())
    mhs.setJenisKelamin(val)

    val = str(input())
    mhs.setAsalUniv(val)

    val = str(input())
    mhs.setEmailEdu(val)

    val = str(input())
    mhs.setProdi(val)

    val = str(input())
    mhs.setFakultas(val)

    arr.tambah(mhs)# menambahkan data ke list yang sudah ada
  
  print("masukkan perintah: ")
  sign = str(input()) # masukkan perintah berikutnya