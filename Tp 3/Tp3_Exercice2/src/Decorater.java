public abstract class Decorater implements Shape{
	
	Shape s;
	Decorater(Shape a)
	{
		s=a;
	}
	public void setShape(Shape x){s=x;}
}
