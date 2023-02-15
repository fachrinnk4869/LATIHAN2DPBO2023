public class SivitasAkademik extends Human {
  private String asalUniv;
  private String emailEdu;

  SivitasAkademik(){
    this.emailEdu = "";
    this.asalUniv = "";
  }
  SivitasAkademik(String emailEdu, String asalUniv){
    this.asalUniv = asalUniv;
    this.emailEdu = emailEdu;
  }

  public String getAsalUniv(){
    return this.asalUniv;
  }
  public String getEmailEdu(){
    return this.emailEdu;
  }
  public void setAsalUniv(String asalUniv){
    this.asalUniv = asalUniv;
  }
  public void setEmailEdu(String emailEdu){
    this.emailEdu = emailEdu;
  }
}
