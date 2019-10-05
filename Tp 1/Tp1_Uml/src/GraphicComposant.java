
public abstract class GraphicComposant {
 String nom;
 
 
 public GraphicComposant( String a) { this.nom=a;}
 
 
// methodes qui a un comportemant par defaut à redefinir dans DessinsGraphique
// et les sous classes de FormeGeometrique
 public String getNom() {return this.nom;}
 public String dessiner(){return null;} //une methode pour donner les caractérestiques d'un GraphicComposant
 
// methodes qui a un comportemant par defaut à redefinir dans DessinGraphique
public void ajouter (GraphicComposant a) {};
public void supprimer (GraphicComposant a) {};
public boolean chercheForme(String a) { return false;};
public int nbrElement(){return 0;}
 
 
// methodes qui a un comportemant par defaut et à redefinir dans les sous 
// classes de FormeGeometrique
float calculerSurface() { return 0;};
float calculerPerimetre() { return 0;}
}
