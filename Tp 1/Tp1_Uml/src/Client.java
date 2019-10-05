
public class Client {
	
	public static void main (String[] args) {
		
		GraphicComposant dessin1=new DessinGraphique("Dessin1");
		GraphicComposant dessin2=new DessinGraphique("Dessin2");
		GraphicComposant dessin3=new DessinGraphique("Dessin3");
		
		GraphicComposant triangle=new Triangle("Triangle",3,3,3,3);
		GraphicComposant rectangle1=new Rectangle("Rectangle1",10,6);
		GraphicComposant rectangle2=new Rectangle("Rectangle2",6,5);
		GraphicComposant cercle=new Cercle("Cercle",4);
		
		//dessin 1 a deux rectangles
		dessin1.ajouter(rectangle1);
		dessin1.ajouter(rectangle2); 
		
		//dessin 2 a un triangle
		dessin2.ajouter(triangle); 
		
		//dessin3 contient dessin1 et dessin2 comme sous dessin et la forme geometrique cercle
		dessin3.ajouter(dessin1); 
		dessin3.ajouter(dessin2);
		dessin3.ajouter(cercle);
		
		triangle.ajouter(dessin1); // fonctionne mais ne fais rien car on n' ajoute pas un
								  //un dessin graphique dans une forme géometrique
		
		System.out.println("le nombre d'elements de "+dessin1.getNom()+" est "+dessin1.nbrElement());
		System.out.println(dessin1.dessiner());
		
		System.out.println("le nombre d'elements de "+dessin2.getNom()+" est "+dessin2.nbrElement());
		System.out.println(dessin2.dessiner());
		
		System.out.println("le nombre d'elements de "+dessin3.getNom()+" est "+dessin3.nbrElement());
		System.out.println(dessin3.dessiner());
		
		
		System.out.println("Le composant "+ rectangle1.getNom() + " a pour surface= "+ rectangle1.calculerSurface()+""
				+ "  et pour perimetre= "+rectangle1.calculerPerimetre());
		
		//Aucune erreur a la compilation et affiche un resultat juste
		
		System.out.println("Le composant "+ dessin1.getNom() + " a pour surface "+ dessin1.calculerSurface());
		System.out.println("Le composant "+ dessin1.getNom() + " a pour périmetre "+ dessin1.calculerPerimetre());
		// Aucune erreur a la compilation affiche des 0 
		
		rectangle1.chercheForme(triangle.getNom()); // pas d'erreur de compilation mais rien n'est affiché
		
		//recherche d'une forme géométrique dans un dessin
		System.out.println(dessin3.chercheForme("Rectangle1")); //false parcequ' rectangle1 appartient au sous dessin1
		System.out.println(dessin2.chercheForme("Triangle"));
		System.out.println(dessin3.chercheForme("Cercle"));
		
		//suppimer rectangle1 du dessin1
		dessin1.supprimer(rectangle1);
		System.out.println(dessin1.dessiner());
		
	}
}
