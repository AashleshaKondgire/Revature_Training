package com.rev.assign;

public class Triangle {
	double peri;
public double periofTriangle(double side1 , double side2 , double side3) {
	peri = side1 + side2 + side3;
	return peri;
}
public static void main(String[] args) {
	Triangle t = new Triangle();
	double peri=t.periofTriangle(3, 6, 9);
	System.out.println("Perimeter of Triangle is " + peri);
}
}
