#include<bits/stdc++.h>
using namespace std;


#include "Human.cpp"
#include "SivitasAkademik.cpp"
#include "Mahasiswa.cpp"
#include "Crud.cpp" 

int main() {
    Crud list;// deklarasi objek memanggil Crud 
    cout << "masukkan perintah: ";// masukkan perintah awal

    string sign;
    cin >> sign;
    while(sign != "exit"){// sampai mendapatkan input exit maka terus melooping
      if(sign == "tampil"){
        // menampilkan data mahasiswa lengkap
        list.tampil();
      }
      else if(sign == "tambah"){
        // menambah data ke list
        Mahasiswa mhs;
        string val;
        cin >> val;
        mhs.setNik(val);

        cin >> val;
        mhs.setNim(val);

        cin >> val;
        mhs.setNama(val);

        cin >> val;
        mhs.setJenisKelamin(val);

        cin >> val;
        mhs.setAsalUniv(val);

        cin >> val;
        mhs.setEmailEdu(val);

        cin >> val;
        mhs.setProdi(val);

        cin >> val;
        mhs.setFakultas(val);

        list.tambah(mhs);// menambahkan data ke list yang sudah ada
      }
      cout << "masukkan perintah: ";
      cin >> sign;// masukkan perintah berikutnya
    }
}
