import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HShape extends AbstractShape {

	public HShape(int x, int y, int size) {
		super(x, y, size, Color.GREEN);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		// just for illustration (don't write the letter H!)
		g.drawRect(x, y, size, size);
		for (int i = 0;i<size;i++){
			for(int j = 0;j<size;j++){
				if((i!= 0)&&(j!=1)){
				g.drawRect(j, i, size/3, size/3);
			}
		}
	}
	}
}
