
public class Carte {
    int cleSecret;
    
    
    public Carte (int a) { cleSecret=a;}
    
    public boolean estBon(int a) {
    	if (cleSecret==a) return true;
    	else return false; }
    
    public void retirerArgent() { System.out.println("Argent retirer");}
    
    
}
