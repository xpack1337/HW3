import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainClass {

	private static Random rand = new Random();

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			createApplication();
		});
	}

	private static void createApplication() {
		JFrame frame = new JFrame("Homework 3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		// create the model and view
		DrawingModel model = new DrawingModel();
		Viewer panel = new Viewer();
		model.addView(panel);
		frame.add(panel);
		frame.setVisible(true);
		model.addShape(new FibonacciSquare(40, 20, 20, 4,Color.RED));

		for (int i = 1; i <= 10; i++) {
			int x = rand.nextInt(panel.getWidth() - 5);
			int y = rand.nextInt(panel.getHeight() - 5);
			int size = rand.nextInt(4) + 3;
			if (rand.nextBoolean()) {
				model.addShape(new HShape(x, y, size));
			} else {
				int quadrant = 1 + rand.nextInt(4);
				model.addShape(new FibonacciSquare(x, y, 5, quadrant,Color.RED));
			}
		}
	}

}
