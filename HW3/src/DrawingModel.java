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
		List<Shape> copy = new ArrayList<Shape>();//local empty ArraysList that will hold the copy 
		for(Shape s: shapes){
			copy.add(s.deepCopy());//fill the array with deep copies of all current objects
		}
		return copy;// return the deep copy of shapes
		
	}

}
