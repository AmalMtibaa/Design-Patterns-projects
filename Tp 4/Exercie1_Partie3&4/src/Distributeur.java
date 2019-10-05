
public class Distributeur {
	
	private Etat etatCourant;
	
	 Pas_De_Carte pas_De_Carte=new Pas_De_Carte();
	 En_Attente_Code en_Attente_Code=new En_Attente_Code();
	 En_Attente_Retirer_Argent en_Attente_Retirer_Argent=new En_Attente_Retirer_Argent();
	 MachineVide machineVide=new MachineVide();
	
	static private double stockArgent;
	
	private Carte carte; 
	
	//constructeur
	public Distributeur(double stock){
		etatCourant=pas_De_Carte;
		stockArgent=stock;
	}
	
	//setterEtat
	public void setEtat(Etat e){
		etatCourant=e;
	}
	//getter Etat
	public Etat getEtat(){
		return etatCourant;
	}
	//setterCarte
	public void setCarte(Carte c){
		carte=c;
	}
	
	public Carte getCarte(){return carte;}
	
	//getters et setters pour stockArgent
	public void setStockArgent(double s){stockArgent=s;}
	public double getStockArgent(){return stockArgent;}
	
	
	public void insererCarte(Carte c){
		etatCourant.insererCarte(c, this);
	}
	public void entrerCode(int a){
		etatCourant.entrerCode(a, this);
	}
	public void retirerArgent(double s){
		etatCourant.retirerArgent(this,s);
	}
	public void retirerCarte(){
		etatCourant.retirerCarte(this);
	}
	public void lire_solde_compte(){
		etatCourant.lire_solde_compte(this);
	}
	

}
