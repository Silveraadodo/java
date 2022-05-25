public class Specialiste extends Medecin {
    private String specialite;
    private int nbreAnnee;

    public Specialiste(){
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

    public void setnbreAnnee (int nbreAnnee){
        this.nbreAnnee=nbreAnnee;
    }
   
    
}
