public class Specialiste extends Medecin {
    private String specialite;
    private int nbreAnnee;

    public Specialiste(){
        super();//classe
        type="Specialiste";
    }
    public String getSpecialite(){
        return specialite;
    }
    public void setSpecialite(String specialite){
        this.specialite=specialite;
    }
    public int  getNbreAnnee( ){
        return nbreAnnee;
    }

    public void nbreAnnee (int nbreAnnee){
        this.nbreAnnee=nbreAnnee;
    }
    @Override
    public String toString() {
        return "Specialiste :" +super.toString()+"nbreAnnee=" + nbreAnnee + ", specialite=" + specialite + "]";
    }
   
    
}
