
public class Cercle implements Shape{
	int x;
	int y;
	int radius;
	public Cercle(int x ,int y, int radius)
	{   
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void draw()
	{
		System.out.println( " ceci est un cercle de rayon "+ radius + " et de centre ( "+x+" , "+y+" ) ");
		
	}
}

