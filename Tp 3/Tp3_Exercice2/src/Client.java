
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape cercle = new Cercle(5,2,3);
		Decorater cd1=new ConcreteDecorator1(cercle);
		cd1.draw();

	}

}
