
public class Catalogue {

	public static void main(String[] args) {
		
		VehiculeFactory c1=new ConcreteVehiculeEssence();
		VehiculeFactory c2=new ConcreteVehilculeElectrique();
		
		Scooter s1=c1.createScooter("Yamaha", 20);
		Scooter s2=c2.createScooter("103", 15);
		
		Camion ca1=c1.createCamion("Dacia", 70, 3);
		Camion ca2=c2.createCamion("Peugeot", 80, 2);
		
		s1.affichageCaracteristique();
		s2.affichageCaracteristique();
		ca1.affichageCaracteristique();
		ca2.affichageCaracteristique();
		
		

	}

}
