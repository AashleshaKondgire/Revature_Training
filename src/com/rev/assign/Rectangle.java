package com.rev.assign;

public class Rectangle {
	double area;
	double peri;
public double areaofRectangle(double length , double breadth) {
	area=length * breadth;
	return area;
}
public double perimeterofRectangle(double length , double breadth ) {
	peri= 2*(length + breadth);
	return peri;
}
public static void main(String[] args) {
	Rectangle r = new Rectangle();
	double area = r.areaofRectangle(4, 5);
	double peri = r.perimeterofRectangle(8, 9);
	System.out.println("Area of Reactangle "+ area);
	System.out.println("Perimeter of Reactangle"+ peri);
	
}
}
