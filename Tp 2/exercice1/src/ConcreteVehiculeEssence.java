
public class ConcreteVehiculeEssence extends VehiculeFactory{
public ScooterEssence createScooter(String a, int b) {
	return new ScooterEssence(a,b);
	
}
	
public CamionEssence createCamion(String a,int b, int c) {
	return new CamionEssence(a,b,c);
	
}


	
}
