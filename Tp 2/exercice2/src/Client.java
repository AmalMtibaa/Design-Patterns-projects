
public class Client {
	public static void main (String [] args) {
		//un serveur qui va traier tous les monteurs
		Serveur serveur= new Serveur();
		
		//un monteur pour chaque repas
		MonteurRepas monteurRepas1=new MonteurRepas1();
		MonteurRepas monteurRepas2=new MonteurRepas2();
		MonteurRepas monteurRepas3=new MonteurRepas3();
		MonteurRepas monteurRepas4=new MonteurRepas4();
		
		serveur.setMonteurRepas(monteurRepas1);
		serveur.contruireRepas();
		Repas repas1= serveur.getRepas();
		
		serveur.setMonteurRepas(monteurRepas2);
		serveur.contruireRepas();
		Repas repas2= serveur.getRepas();
		
		serveur.setMonteurRepas(monteurRepas3);
		serveur.contruireRepas();
		Repas repas3= serveur.getRepas();
		serveur.setMonteurRepas(monteurRepas4);
		
		serveur.contruireRepas();
		Repas repas4= serveur.getRepas();
		
		repas1.afficher();
		repas2.afficher();
		repas3.afficher();
		repas4.afficher(); }
}
		
	
	

