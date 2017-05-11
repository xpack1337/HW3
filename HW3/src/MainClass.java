import java.awt.Color;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class MainClass {

	private static Random rand = new Random();

	public static void main(String[] args) {
		//SwingUtilities.invokeLater(() -> {
			createApplication();
		//});
	}

	private static void createApplication() {

		JFrame frame = new JFrame("Displaying Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);

		// create the model and view
		DrawingModel model = new DrawingModel();
		Viewer panel = new Viewer();
		model.addView(panel);
		frame.add(panel);

		model.addShape(new FibonacciSquare(400, 20, 7, 1,Color.RED));//
		model.addShape(new FibonacciSquare(167, 20, 7, 2,Color.RED));//Create static picture of a circle from arcs
		model.addShape(new FibonacciSquare(167, 253, 7, 3,Color.RED));//
		model.addShape(new FibonacciSquare(400, 253, 7, 4,Color.RED));//

		model.addShape(new HShape(400,600,150,Color.CYAN)); // Create static H shape piece

		frame.setVisible(true);

		for(int i = 1;i<=4;i++){//Loop for creating random arcs and H shapes

			int nFab = rand.nextInt(2) + 6;//random number for the Fabinacci number (have to be limited because size of arcs will grow really big)
			int size = rand.nextInt(50) + 30;//random number for the size of H shapes
			
			model.addShape(new FibonacciSquare(rand.nextInt(panel.getHeight() - 10), //create the arc with random coordinates and size
											rand.nextInt(panel.getHeight() - 10),nFab,i,new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat())));


			model.addShape(new HShape(rand.nextInt(panel.getHeight() - 10), // create the H shape with random coordinates and size
					rand.nextInt(panel.getHeight() - 10), size,new Color(rand.nextFloat(),rand.nextFloat(),rand.nextFloat())));

		}
	}

}
