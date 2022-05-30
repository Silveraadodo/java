abstract class Medecin  {
        protected String dateRecrutement;
        protected String nom;
        protected int id;
        protected String prenom;
        private static int nbre;
        protected String type;
    
        //many to one=>attribut de la relation
        private int hopital;

        public Medecin(){
            id=++nbre;
        }
        public String getDateRecrutement(){
            return dateRecrutement;
        }
        public String getNom(){
            return nom;
        }
        public int getId(){
            return id;
        }
        public String getType(){
            return type;
        }
        
        public String getPrenom(){
            return prenom;
        }
        public int getHopital(){
            return hopital;
        }
        public void setClient(int hopital){
            this.hopital=hopital;
        }
        public void setType(String type){
            this.type= type;
        }
    


       
        public void setDateRecrutement(String dateRecrutement){
            this.dateRecrutement= dateRecrutement;
        }
        public void setNom(String nom){
            this.nom= nom;
        }
        public void setPrenom(String prenom){
            this.prenom= prenom;
        }
        public void setId(int id){
            this.id= id;
        }
        @Override
        public String toString() {
            return "Medecin [dateRecrutement=" + dateRecrutement + ", hopital=" + hopital + ", id=" + id + ", nom="
                    + nom + ", prenom=" + prenom + ", type=" + type + "]";
        }
        
       
    }
 

