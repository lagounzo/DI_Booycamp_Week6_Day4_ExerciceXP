/**
 * @author N'ZO LAGOU
 *  Exercice 3 : Aire De Deux Rectangles

Écrivez un programme pour imprimer l'aire de deux rectangles
 ayant des côtés (4,5) et (5,8) respectivement en créant une classe 
 nommée Rectangleavec une méthode nommée Areaqui renvoie l'aire 
et la longueur et la largeur passées en paramètres à son constructeur.
 */


package ExerciceXP;

public class Rectangle {
	
	// class attribute
	
	
	private double lenght ;
	private double breadth ;
	
	
	// constructor without parameters
	
	public Rectangle() {
		super() ;
	}


	// constructor with parameters
	public Rectangle(double lenght, double breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}


	// setters and getters
	
	public double getLenght() {
		return lenght;
	}


	public void setLenght(double lenght) {
		this.lenght = lenght;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
	
	//class method
	
	public double area() {
		return ( lenght * breadth ) ;
		
	}
	
	public void displayArea () {
		lenght =(double)Math.round(lenght*100)/100 ;
		
		System.out.println(String.format("Lenght : %f Breadth : %f Area : %f" , lenght , breadth, this.area())) ;
	}

}
