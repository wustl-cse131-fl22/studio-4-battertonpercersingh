package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeName = in.next();
		
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		boolean isFilled = in.nextBoolean();
		
		StdDraw.setPenColor(red, green, blue);
		
		//rectangle
		if (shapeName.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if (isFilled == true) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}

		}
		//triangle
		if (shapeName.equals("triangle")) {
			double one = in.nextDouble();
			double two = in.nextDouble();
			double three = in.nextDouble();
			double four = in.nextDouble();
			double five = in.nextDouble();
			double six = in.nextDouble();
			
			double [] array1 = {one, three, five};
			double [] array2 = {two, four, six};
			
			if (isFilled == true) {
				StdDraw.filledPolygon(array1, array2);
			}
			else {
				StdDraw.polygon(array1, array2);
			}
		}
		//Ellipse
		if (shapeName.equals("ellipse")) {
			double one = in.nextDouble();
			double two = in.nextDouble();
			double three = in.nextDouble();
			double four = in.nextDouble();
						
			if (isFilled == true) {
				StdDraw.filledEllipse(one, two, three, four);
			}
			if (isFilled == false) {
				StdDraw.ellipse(one, two, three, four);
			}
		}
	}
}
