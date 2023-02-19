import java.util.Scanner;
// import java.util.ArrayList;`
// import util.Mahasiswa;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);// Scanner berupa inputandari keyboard
    Crud list = new Crud();// deklarasi objek memanggil Crud 
    System.out.println("masukkan perintah: ");// masukkan perintah awal

    String sign = sc.next();// masukkan looping berupa string
    while(!sign.equals("exit")){// sampai mendapatkan input exit maka terus melooping
      if(sign.equals("tampil")){
        // menampilkan data mahasiswa lengkap
        list.tampil();
      }
      else if(sign.equals("tambah")){
        // menambah data ke list
        Mahasiswa mhs = new Mahasiswa();
        
        String val = sc.next();// masukkan value berupa string
        mhs.setNik(val);

        val = sc.next();
        mhs.setNim(val);

        val = sc.next();
        mhs.setNama(val);

        val = sc.next();
        mhs.setJenisKelamin(val);

        val = sc.next();
        mhs.setAsalUniv(val);

        val = sc.next();
        mhs.setEmailEdu(val);

        val = sc.next();
        mhs.setProdi(val);

        val = sc.next();
        mhs.setFakultas(val);

        list.tambah(mhs);// menambahkan data ke list yang sudah ada
      }
      System.out.println("masukkan perintah: ");
      sign = sc.next();// masukkan perintah berikutnya
    }
  }
}
