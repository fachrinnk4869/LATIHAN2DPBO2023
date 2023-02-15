public class Human {
  private String nik;
  private String nama;
  private String jenisKelamin;

  Human(){
    this.nik = "";
    this.nama = "";
    this.jenisKelamin = "";
  }
  Human(String nik, String nama, String jenisKelamin){
    this.nama = nama;
    this.nik = nik;
    this.jenisKelamin = jenisKelamin;
  }

  public String getNama(){
    return this.nama;
  }
  public String getNik(){
    return this.nik;
  }
  public String getJenisKelamin(){
    return this.jenisKelamin;
  }
  public void setNama(String nama){
    this.nama = nama;
  }
  public void setNik(String nik){
    this.nik = nik;
  }
  public void setJenisKelamin(String jenisKelamin){
    this.jenisKelamin = jenisKelamin;
  }
}
