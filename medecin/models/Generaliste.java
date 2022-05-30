public class Generaliste extends Medecin {
    private String service;

public Generaliste(){
     type = "generaliste";

}
public String getService(){
    return service;
}
public void setService(String service){
    this.service=service;
}
@Override
public String toString() {
    return "Generaliste: "+super.toString()+" service=" + service + "]";
}
}