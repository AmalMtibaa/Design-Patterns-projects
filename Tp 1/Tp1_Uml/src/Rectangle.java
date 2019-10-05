
public class Rectangle extends FormeGeometrique{

	float longueur,largeur;
	public Rectangle(String a, float lon, float lar) {
		super(a);
		this.largeur=lar;
		this.longueur=lon;
	}
	//methode dessiner qui affiche les caractéristique du Rectangle
	public String dessiner()
	{
return("Un Rectangle de nom= "+this.getNom()+" de longueur "+this.longueur+" et de largeur "+this.largeur+"\n");
	}
	public float calculerSurface() 
	{
		return longueur*largeur;
	}
	public float calculerPerimetre() 
	{
		return (longueur+largeur)*2;
	}	

}
