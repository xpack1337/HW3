import java.awt.Color;

public abstract class AbstractShape implements Shape {
	// location of the shape
	protected int x, y;
	// color of the shape
	protected Color color;
	// size of the shape
	protected int size;
	
	public AbstractShape(int x, int y, int size, Color color) {
		this.x = x;
		this.y = y; 
		this.size = size;
		this.color = color;
	}
}
