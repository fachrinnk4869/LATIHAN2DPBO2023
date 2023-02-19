public class SivitasAkademik extends Human {
  private String asalUniv;// atribut asal Universitas
  private String emailEdu;// atribut Email edu

  SivitasAkademik(){
    // inisiasi atribut dengan string kosong
    this.emailEdu = "";
    this.asalUniv = "";
  }
  SivitasAkademik(String emailEdu, String asalUniv){
    // inisias dengan value awal
    this.asalUniv = asalUniv;
    this.emailEdu = emailEdu;
  }

  public String getAsalUniv(){
    // return Asal Universitas
    return this.asalUniv;
  }
  public String getEmailEdu(){
    // return Email Edu
    return this.emailEdu;
  }
  public void setAsalUniv(String asalUniv){
    // mengganti value Asal Universitas
    this.asalUniv = asalUniv;
  }
  public void setEmailEdu(String emailEdu){
    // mengganti Email Edu
    this.emailEdu = emailEdu;
  }
}
