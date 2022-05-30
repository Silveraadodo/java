package medecin.service;

import medecin.models.Hopital;
import medecin.models.Medecin;

public class Service implements IService {
    public static final int N=10;
    private Medecin medecins[] = new Medecin[N];
    private int indexMedecin; 
    private Client hopitals[] = new Hopital[N];
    private int indexHopital;

    @Override
    public void addHopital(Hopital hopital) {
        if(indexHopital<N){
            hopitals[indexHopital]= hopital;
            indexHopital++;
        }
        else{
            System.out.println("Le tableau est plein");
        }
    }

    @Override
    public void addMedecin(Hopital  hopital, Medecin medecin  ) {
        if(indexMedecin<medecins.length){
            //affectation du client au compte
            medecin.setHopital(hopital);
            medecins[indexMedecin]=medecin;
            indexMedecin++;
        }
        else{
            System.out.println("Le tableau est plein");
        }
    }

    @Override
    public void listerHopital() {
        for (Hopital hopital : hopitals) {
            if(hopital!=null){
                System.out.println(hopital.toString());
            }
        }       
    }

    @Override
    public void listerMedecin() {
        for (Medecin medecin : medecins) {
            if(medecin!=null){
                System.out.println(medecin.toString());
            }
        }    
    }
}