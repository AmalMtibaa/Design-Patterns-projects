import java.util.ArrayList;
import java.util.Scanner;

public class ServiceClientaireFacade {
	
	public static Scanner sc=new Scanner(System.in);
	
	//liste de produits disponible
	private ArrayList<Produit> lisProduits=new ArrayList<Produit>();
	//panier du client
	private ArrayList<Produit> panierClient=new ArrayList<Produit>();
	
	private ServiceFacturation serviceFacturation =new ServiceFacturation();
	private ServiceTraitementCommande serviceTraitementCommande=new ServiceTraitementCommande();

	//constructeur contenant les produits disponibles qu'on peut choisir pami 
	public ServiceClientaireFacade(){

	lisProduits.add(new Produit(0,5));
	lisProduits.add(new Produit(1,4));
	lisProduits.add(new Produit(2,10));
	lisProduits.add(new Produit(3,6));
	}
	
	 public ArrayList<Produit> CreerPanier(int n){ //n nombre de produit dans le panier à créer

		 for(int i=0;i<n;i++){
			 System.out.println("donner le numero de produit(entre 0 et 3)");
			 int x=sc.nextInt();
			 panierClient.add(lisProduits.get(x));
		 }
		 return panierClient;
	 }
	
	
	//passer une commande vers ServiceTraitemntCommande
	public Commande passerCommande(int n ,ArrayList<Produit> l){
		return serviceTraitementCommande.passerCommande(n, l);
	}
	
	//creation de Facture avec ServiceFacturation
	public Facture getFacture(Commande c){
		Facture f=serviceFacturation.FacturerCommande(c);
		f.affichageCaracteristique();
		return f;
	}
	
	//appel de la methode payerFacture de service Fcaruration + ajout d'affichage
	public void payerFacture(Facture f){
		System.out.print("Traitement de payement de Facture: ");
		serviceFacturation.payerFacture(f);
		f.affichageCaracteristique();
		
	}

}
