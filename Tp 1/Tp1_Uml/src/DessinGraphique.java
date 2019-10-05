import java.util.ArrayList;
public class DessinGraphique extends GraphicComposant {
	//liste des GraphicComposant
	ArrayList<GraphicComposant> liste ;
	
	public DessinGraphique (String nom)
	{	super(nom);
		liste= new ArrayList<GraphicComposant>();
	}
	
	//ajouter un composant à la liste
	public void ajouter(GraphicComposant a)
	{
		this.liste.add(a);
	}
	//supprimer un composant
	public void supprimer(GraphicComposant a)
	{
		this.liste.remove(a);
	}
	
	//Chercher dans le dessin Geometrique si on a une forme appartient directiment à un graphe
	public boolean chercheForme (String a) 
	{
		boolean trouver=false;
		for(int i=0;i<liste.size();i++)
		{	GraphicComposant c=liste.get(i);
			trouver=c.chercheForme("a");
			if (c.getNom().equals(a))
				trouver=trouver||true;
		}
		return trouver;	
	}
	//nombre de forme Geometriques et Dessin graphiques dans un dessin graphique
	public int nbrElement()
	{	int n=liste.size();
		for(int i=0;i<liste.size();i++)
			{GraphicComposant c=liste.get(i);
			n+=c.nbrElement();}
		return n;
		
	}
	//dessiner le dessin graphique
	 public String dessiner(){
		 String s=this.nom+":"+"\n";
		 for(int i=0;i<liste.size();i++)
		 {
			 GraphicComposant c=liste.get(i);
			 s+=c.dessiner();
		 }
		 return ("  "+s+"\n");
	 }
	
	
	
}