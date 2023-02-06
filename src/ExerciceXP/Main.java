package ExerciceXP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// exercice1
		Exo1Student exo1Student = new Exo1Student("john", 2) ;
		
		/*Exo1Student exo1Student2 = new Exo1Student("john", 2) ;
		System.out.println (exo1Student2.getName() ) ;*/
		
		exo1Student.displayingExo1Student () ;
		
		
//----------------------------------------------------------------
		
		//Exercice 2 : Triangle
		
		Triangle triangle = new Triangle () ;
		triangle.displayTriangle1();
		triangle.displayPerimeter();
		triangle.displaysArea();
		
		
	
	
	//-----------------------------------------------

	// Exercice 3 
	
	
	Rectangle rectangle1 = new Rectangle(4,5);
	Rectangle rectangle2 = new Rectangle(5,5);
	rectangle1.displayArea();
	rectangle2.displayArea();
		
	
	}
}
