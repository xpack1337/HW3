import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hw3Help extends JPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hw3 help");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new Hw3Help();
		frame.add(panel);

		frame.setVisible(true);
	}

	public Hw3Help() {
		setBackground(Color.WHITE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// How to draw an arc
		g.setColor(Color.RED);
		g.drawArc(100, 150, 300, 200, 30, 80);
		// Rectangle
		g.setColor(Color.BLUE);
		g.drawRect(100, 150, 300, 200);

		// Draw a filled green rectangle
		g.setColor(Color.GREEN);
		g.fillRect(400, 300, 80, 80);
	}
}
