
public interface IService     {
    //use case
    //1-creer un hopital
    void addHopital(Hopital hopital);
     //2-afficher un hopital
      void listerHopital();
     //3-creer un medecin 
      void addMedecin(Medecin medecin);
    
    //4-afficher les medecins d'un hopital 
    void listerMedecin(Medecin medecin,Hopital hopital);
}
   