
 class Cercle extends Shape{
int x;
int y;
int radius;

public Cercle(int x ,int y, int radius, DrawApi z)
{   super (z);
	this.x=x;
	this.y=y;
	this.radius=radius;
}
public String draw()
{
	return drawApi.drawCircle()+" de rayon "+ radius + " et de centre ( "+x+" , "+y+" ) ";
	
}

}
 
