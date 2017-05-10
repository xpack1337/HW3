import java.util.ArrayList;
import java.util.List;

public class DrawingModel {
	private List<Shape> shapes = new ArrayList<Shape>();
	private List<View> views = new ArrayList<View>();

	/**
	 * Adds a view to the list of views in the model
	 */
	public void addView(View v) {
		views.add(v);
		v.update(this);
	}

	/**
	 * Updates all of the views following a change in the model
	 */
	public void updateAll() {
		for (View v : views) {
			v.update(this);
		}
	}

	/**
	 * Adds a square to the list of squares
	 */
	public void addShape(Shape s) {
		shapes.add(s);
		// Show it
		updateAll();
	}

	/**
	 * Returns the list of the shapes
	 */
	public List<Shape> getShapes() {
		// NOT CORRECT since we want a deep copy
		return shapes;
	}

}
