import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HShape extends AbstractShape {

	public HShape(int x, int y, int size,Color color) {
		super(x, y, size, color);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);//set the white corners for bigger square
		g.drawRect(x, y, size, size); // Create the bigger square
		g.setColor(color);//Set the color 
		for(int i = 0;i<=2;i++){// Fill the bigger square with smaller ones
			for(int j = 0;j<=2;j++){//
				if((i == 1)&&(j==(0) || j ==(2))){//Give the condition for gaps in order to create H shape
					
					g.clearRect(x + i*size/3, y + j*size/3 , size/3 + 1, size/3 + 1);// make gaps
				}else{
					g.setColor(color);//Set the color
					g.fillRect(x + i*size/3 , y + j*size/3  , size/3 + 1, size/3 + 1);// fill all other smaller squares
				}
			}
		}
	
		}
	public HShape deepCopy(){//deep copy method
		return new HShape(this.x,this.y,this.size,this.color);//returns a new object of HShape 
	}
	
}

