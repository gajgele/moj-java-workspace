
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Student {
			String ime;
			int god;
			int ocjena;			
		}
		
		Student prviStudent = new Student();
		Student drugiStudent = new Student();
		
		prviStudent.ime = "Ime Prvog Studenta";
		prviStudent.god = 19;
		prviStudent.ocjena = 9;

		drugiStudent.ime = "Ime Drugog Studenta";
		drugiStudent.god = 21;
		drugiStudent.ocjena = 10;

	}

}
