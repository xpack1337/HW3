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
		frame.setSize(800, 800);
		// create the model and view
		DrawingModel model = new DrawingModel();
		Viewer panel = new Viewer();
		model.addView(panel);
		frame.add(panel);
		frame.setVisible(true);

		for (int i = 1; i <= 10; i++) {
			int x = rand.nextInt(panel.getWidth() - 20);
			int y = rand.nextInt(panel.getHeight() - 20);
			int size = rand.nextInt(50) + 20;
			if (rand.nextBoolean()) {
				model.addShape(new HShape(x, y, size));
			} else {
				int quadrant = 1 + rand.nextInt(4);
				model.addShape(new FibonacciSquare(x, y, size, quadrant));
			}
		}
	}

}
