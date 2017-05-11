import java.awt.Graphics;

public interface Shape {

	void draw(Graphics g);//method for drawing the shape
	Shape deepCopy();//The deep copy method

}
