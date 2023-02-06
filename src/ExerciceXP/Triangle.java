/**
 * @author N'ZO LAGOU
 * 🌟 Exercice 2 : Périmètre D'un Triangle
 * 
Écrivez un programme pour imprimer l'aire et le périmètre
 d'un triangle ayant des côtés de 3, 4 et 5 unités en créant
 une classe nommée Trianglesans aucun paramètre dans son constructeur.
 */


package ExerciceXP;

public class Triangle {

// class attributes

	private double side1;

	private double side2;

	private double side3;

// constructor without parameter

	public Triangle() {
		this.side1 = 3.0;
		this.side2 = 4.0;
		this.side3 = 5.0;
	}

// constructor using parameters but not necessary 

// getters and setters
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

// class methods

	/*
	 * return triangle information
	 * 
	 * @param : empty
	 * 
	 * @returns void
	 */

	public void displayTriangle1() {
		System.out.println(String.format("side 1 : %f side 2 : %f side 3 : %f ", side1, side2, side3));

	}

	/**
	 * deuxieme methode
	 * 
	 * value of triangle perimeter
	 * 
	 * @return : double
	 */

	public double perimeter() {
		return (side3 + side2 + side1);
	}

	/**
	 * value of triangle area - @param :empty
	 * 
	 * @return :void
	 */

	public double area() {
		return ((side1 * side2) / 2.0);
	}

	/**
	 * Display triangle perimeter
	 * 
	 * @param : empty
	 * 
	 *  return : void
	 */

	public void displayPerimeter() {
		System.out.println(String.format(" Perimeter : %f ", this.perimeter()));

	}
	
	public void displaysArea () {
		System.out.print(String.format("Perimeter : %f " , this.area()));
	}
}
	
