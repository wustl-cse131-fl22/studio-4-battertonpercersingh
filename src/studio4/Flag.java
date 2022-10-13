package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0, 0, 255);	
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.2);
		StdDraw.setPenColor(0, 255, 255);
		StdDraw.rectangle(0.5, 0.5, 0.2, 0.2);
		StdDraw.setPenColor(225, 225, 0);	
		StdDraw.rectangle(0.5, 0.5, 0.1, 0.1);
	}
}