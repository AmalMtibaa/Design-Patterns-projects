
public class Distributeur {
	
	private Etat etatCourant;
	
	 Pas_De_Carte pas_De_Carte=new Pas_De_Carte();
	 En_Attente_Code en_Attente_Code=new En_Attente_Code();
	 En_Attente_Retirer_Argent en_Attente_Retirer_Argent=new En_Attente_Retirer_Argent();
	
	private Carte carte; 
	
	//constructeur
	public Distributeur(){
		etatCourant=pas_De_Carte;
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
}
