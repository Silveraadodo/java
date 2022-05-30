public class Hopital {
    private int id;
    private String nom;
    private String adresse;
    private static int nbre;

//many to one=>attribut de la relation

public Hopital(){
    id=++nbre;
}
public int getId(){
    return id;
}
public String getNom(){
    return nom;
}
public String getAdresse(){
    return adresse;
}

public void setId(int id){
    this.id= id;
}
public void setNom(String nom){
    this.nom= nom;
}
public void setAdresse(String adresse){
    this.adresse= adresse;
}
@Override
public String toString() {
    return "Hopital [adresse=" + adresse + ", id=" + id + ", nom=" + nom + "]";
}


}