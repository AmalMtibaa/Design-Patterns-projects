
public class Cercle extends FormeGeometrique {
	float rayon;

	public Cercle(String a, float b) {
		super(a);
		this.rayon=b;
	}
	//methode dessiner qui affiche les caractéristique du cercle
	public String dessiner()
	{
		return("Un cercle de nom= "+this.getNom()+" de rayon = "+this.rayon+"\n");
	}
	
	public float calculerSurface() 
	{
		return (float) Math.PI*this.rayon*this.rayon;
	}
	public float calculerPerimetre() 
	{
		return (float)Math.PI*this.rayon * 2;
	}	
	
}
