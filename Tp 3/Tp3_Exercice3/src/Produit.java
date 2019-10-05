
public class Produit {

	private int numero;
	private double prix;
	
	//constructeur 
	public Produit(int n,double p){
		numero=n;
		prix=p;
	}
	
	public void setPrix(double p){prix=p;}
	
	public double getPrix(){return prix;}
	
	public void affichageCaracteristique(){
		System.out.println("produit numero= "+numero+" prix="+prix);
	}
}
