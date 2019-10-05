

public class ConcreteDecorator1 extends Decorater {


	ConcreteDecorator1(Shape a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	private void setTexture()
	{
		System.out.println("Description Textuelle de Votre Shape:");
	}

	public void draw()
	{
		
		setTexture();
		s.draw();
	}

}
