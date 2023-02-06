/**
 * @author N'ZO LAGOU
 *  Exercice 1 : Classe Nommée 'Etudiant'

Créez une classe nommée Studentavec String variable
 nameet integer variable roll_no.

Attribuez la valeur de roll_noas 2 et celle de nameas « John »
 en créant un objet de la classe Student.
 */


package ExerciceXP;

public class Exo1Student {
	
	// encapsulation les attributs (prive ou public)
	/*public String name ;
	public Integer roll_no ;
	*/
	private String name ;
	private Integer roll_no ;
	
		// constructeur without parameter
	public Exo1Student () {
		super () ;
	}
	
	// constructor with parameters
	public Exo1Student(String name, Integer roll_no) {
		//super();
		this.name = name;
		this.roll_no = roll_no;
	}
	
	// declaration getters and setters
	public String getName() {
		return name;
	}
	
	public Integer getRoll_no() {
		return roll_no;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}

// class methodes
	
	/* methode displaying pour formater  */
	
	public void displayingExo1Student() {
		System.out.println( String.format("name : %s\n roll :%d " , name ,roll_no));	
	//System.out.println( "name" : );
	}

}
