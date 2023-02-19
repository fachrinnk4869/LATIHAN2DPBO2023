import java.util.ArrayList;

// package java;

public class Crud {
  private ArrayList<Mahasiswa> list;// atribut list
  private ArrayList<String> listNim;// atribut list NIM

  Crud(){
    list = new ArrayList<Mahasiswa>();// memanggil objek list
    listNim = new ArrayList<String>();// memanggil objek listNim
  }

  public void tambah(Mahasiswa mhs){
    // method menambah class Mahasiswa ke list
    if(listNim.indexOf(mhs.getNim()) != -1){
      // error handle jika memiliki NIM yang sama
      System.out.println("data yang ingin anda tambah tidak unique value");
      return;
    }
    this.list.add(mhs);
    this.listNim.add(mhs.getNim());
  }

  public void tampil(){
    // menampilkan list dari Mahasiswa
    for(int i = 0;i < list.size();i++){
      System.out.println(
      (i + 1) 
      + "\nNIK : " + list.get(i).getNik()
      + "\nNIM : " + list.get(i).getNim()
      + "\nNama : " + list.get(i).getNama()
      + "\nJenis Kelamin : " + list.get(i).getJenisKelamin()
      + "\nAsal universitas : " + list.get(i).getAsalUniv()
      + "\nEmail Edu : " + list.get(i).getEmailEdu()
      + "\nProdi : " + list.get(i).getProdi()
      + "\nFakultas : " + list.get(i).getFakultas()
      + "\n"
      );
    }
  }

}
