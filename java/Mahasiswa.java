public class Mahasiswa extends SivitasAkademik {
  private String nim;// atribut NIM
  private String prodi;// atribut prodi
  private String fakultas;// atribut fakultas

  Mahasiswa(){
    // inisiasi dengan string kosong
    this.nim = "";
    this.prodi = "";
    this.fakultas = "";
  }
  Mahasiswa(String nama, String nim, String prodi, String fakultas){
    // inisiasi dengan value awal
    this.nim = nim;
    this.prodi = prodi;
    this.fakultas = fakultas;
  }

  public String getNim(){
    // return NIM mahasiswa
    return this.nim;
  }
  public String getProdi(){
    // return prodi
    return this.prodi;
  }
  public String getFakultas(){
    //return fakultas
    return this.fakultas;
  }
  public void setNim(String nim){
    // menggati value NIM
    this.nim = nim;
  }
  public void setProdi(String prodi){
    // mengganti value prodi
    this.prodi = prodi;
  }
  public void setFakultas(String fakultas){
    // mengganti value fakultas
    this.fakultas = fakultas;
  }

}
