
public class BridgePatternDemo {
	
	public static void main (String [] args){
	
	DrawApi cercleGreen=new GreenCercle();
	DrawApi cercleRed= new RedCercle();
	
	
	
	Shape shape1= new Cercle(5,5,7,cercleGreen);
	Shape shape2= new Cercle(5,3,8,cercleRed);
	
	System.out.println(shape1.draw());
	System.out.println(shape2.draw());}
}
