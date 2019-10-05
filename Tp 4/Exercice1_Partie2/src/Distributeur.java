
public class Distributeur {
	Etat etat;
	Carte carte;
	int i=0;
	//constructeur
	public Distributeur() {
		etat=Etat.Pas_de_carte_inserer;
	}
	//insererCatre
	public void insererCarte(Carte a) {if (etat==Etat.Pas_de_carte_inserer)
	{carte=a; etat=Etat.En_attente_operation;
	System.out.println("insertion carte");}
	
	else System.out.println("Operation invalide");}
	
	//enterCode
	public void entrerUnCode(int a) { 
	if (etat==Etat.En_attente_operation) {	
	    
		if( carte.estBon(a) && i<3) {etat=Etat.En_attente_de_retirer_des_especes;
		System.out.println("code valide");
		}
		else { System.out.println("Code invalide"); 
			i++;}
		if (i==3) { carte=null;
		etat=Etat.Pas_de_carte_inserer;
		i=0;
		System.out.println("Carte avalée");
		}
	}
	else System.out.println("Operation invalide");
	}
	
	//retirerDesEspece
	public void retirerDesEspece() { 
		if ( etat==Etat.En_attente_de_retirer_des_especes) { carte.retirerArgent();}
	else System.out.println("Operation invalide");
	
	}
	//retirerCarte
	public void retirerCarte() { 
		if (etat==Etat.En_attente_de_retirer_des_especes) { 
	carte=null;
	etat=Etat.Pas_de_carte_inserer;
	System.out.println("carte retiré");
	}
	else System.out.println("Operation invalide");}
}



