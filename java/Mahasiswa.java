public class Mahasiswa extends SivitasAkademik {
  private String nim;
  private String prodi;
  private String fakultas;

  Mahasiswa(){
    this.nim = "";
    this.prodi = "";
    this.fakultas = "";
  }
  Mahasiswa(String nama, String nim, String prodi, String fakultas){
    this.nim = nim;
    this.prodi = prodi;
    this.fakultas = fakultas;
  }

  public String getNim(){
    return this.nim;
  }
  public String getProdi(){
    return this.prodi;
  }
  public String getFakultas(){
    return this.fakultas;
  }
  public void setNim(String nim){
    this.nim = nim;
  }
  public void setProdi(String prodi){
    this.prodi = prodi;
  }
  public void setFakultas(String fakultas){
    this.fakultas = fakultas;
  }

}
