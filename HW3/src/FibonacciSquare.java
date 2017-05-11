import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class FibonacciSquare extends AbstractShape {

	private int quadrant;

	public FibonacciSquare(int x, int y, int n, int quadrant,Color color) {
		super(x, y, fib(n), color);
		this.quadrant = quadrant;
	}

	private static int fib(int n){
	    if(n == 0){
	    	return 0;
	    }else if(n==1){
	    	return 1;
	    }else{
	    	return fib(n-1) + fib(n-2);
	    }
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		// g.setFont(new Font("Courier", Font.BOLD, size));
		// g.drawString("Fibonacci", x, y);
		// draw the box
		g.drawRect(x, y, size, size);
		// Draw an arc
		if (quadrant == 1) {
			g.drawArc(x - size, y, 2 * size, 2 * size, 0, 90);
		} else if (quadrant == 2) {
			g.drawArc(x, y, 2 * size, 2 * size, 90, 90);
		} else if (quadrant == 3) {
			g.drawArc(x,y-size,2*size,2*size,180,90);

		} else {
			g.drawArc(x-size, y-size, 2*size, 2*size, 270, 90);
		}

	}
	public FibonacciSquare deepcopy(){
		return new FibonacciSquare(this.x, this.y, this.size,this.quadrant, this.color);
	}

}
