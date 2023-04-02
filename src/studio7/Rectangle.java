package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	// Instance Variables
	private double length;
	private double width;
	
	// Constructor without parameters
	public Rectangle() {
		this.length = 0.0;
		this.width = 0.0;
	}
	
	// Constructor with parameters
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// Get method for length
	public double getLength() {
		return this.length;
	}
	
	// Set method for length
	public void setLength(double length) {
		this.length = length;
	}
	
	// Get method for width
	public double getWidth() {
		return this.width;
	}
	
	// Set method for width
		public void setWidth(double width) {
			this.width = width;
		}
		
	// toStrig
		public String toString() {
			return "Length: " + this.length + "\n" +
					"Width: " + this.width;
		}
	
	// Calculate perimeter
	public double recPerimeter() {
		return this.length * 2 + this.width * 2;
	}
	
	// Calculate area
	public double recArea() {
		return this.length * this.width;
	}
	
	// Test if the area of the current rectangle is smaller than that of another rectangle
	public boolean recAreIsSamller(Rectangle recCompare) {
		double area1 = this.recArea();
		double area2 = recCompare.recArea();
		if (area1 < area2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	// Test if the rectangle is a square
	public boolean recIsSquare() {
		if (this.getLength() == this.getWidth()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Draw a rectangle itself
	public void recDraw(double x, double y) {
		StdDraw.setPenColor(Color.BLUE);
		//StdDraw.rectangle(x, y, length / 2, width / 2);
		StdDraw.filledRectangle(x, y, length / 2, width / 2);
		StdDraw.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec1 = new Rectangle(2.5, 3.5);
		Rectangle rec2 = new Rectangle(0.2, 0.35);
		Rectangle rec3 = new Rectangle(3.5, 3.5);
		System.out.println(rec1);
		System.out.println(rec1.getLength());
		rec1.setLength(5.5);
		System.out.println(rec1.getLength());
		System.out.println(rec1.recArea());
		System.out.println(rec1.recAreIsSamller(rec2));
		System.out.println(rec3.recIsSquare());
		rec2.recDraw(0.5, 0.5);

	}

}
