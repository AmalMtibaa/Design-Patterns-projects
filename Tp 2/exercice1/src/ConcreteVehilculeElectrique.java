
public class ConcreteVehilculeElectrique  extends VehiculeFactory{
	public ScooterElectrique createScooter(String a, int b) {
		return new ScooterElectrique(a,b);
		
	}
		
	public CamionElectrique createCamion(String a,int b, int c) {
		return new CamionElectrique(a,b,c);
}
}