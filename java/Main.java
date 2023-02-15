import java.util.Scanner;
// import java.util.ArrayList;`
// import util.Mahasiswa;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Crud list = new Crud();
    System.out.println("masukkan perintah: ");
    String sign = sc.next();
    while(!sign.equals("exit")){
      if(sign.equals("tampil")){
        list.tampil();
      }
      else if(sign.equals("tambah")){
        Mahasiswa mhs = new Mahasiswa();
        String val = sc.next();
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

        list.tambah(mhs);
      }
      System.out.println("masukkan perintah: ");
      sign = sc.next();
    }
  }
}
