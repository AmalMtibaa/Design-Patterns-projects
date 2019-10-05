
public class Triangle extends FormeGeometrique {

	float hauteur,base,cote1,cote2;
	
	public Triangle(String a,float h, float base,float cote1, float cote2 ) {
		super(a);
		this.hauteur=h;
		this.base=base;
		this.cote1=cote1;
		this.cote2=cote2;
		
	}
	//methode dessiner qui affiche les caractéristique du Triangle
		public String dessiner()
		{
			return("triangle de nom= "+this.getNom()+" de hauteur= "+this.hauteur+" de base= "+this.base+
					" et de cotés="+this.cote1+" "+this.cote2+"\n");
		}
	public float calculerSurface() 
	{
		return hauteur*base/2;
	}
	public float calculerPerimetre() 
	{
		return base+cote1+cote2;
	}	

}
