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
		for(int i = 0;i<=2;i++){
			for(int j = 0;j<=2;j++){
				if((i == 1)&&(j==(0) || j ==(2))){
					
				}else{
					g.drawRect(x + j*size/3, y + i*size/3 , size/3, size/3);
				}
			}
		}
		}
	
}

