class Frog {
	private String name;
	private int age;
	private String color;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;	
		}
	
	public int getAge() {
		return age;	
		}
	
	public String getColor() {
		return color;	
		}

	public void setInfo(String name, int age, String color) {
		setName(name);
		setAge(age);
		setColor(color);
	}
	
	public void zvuci() {
		System.out.println("krekre");
	}

}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frog frog1 = new Frog();
		
		frog1.setName("Zabac");
		frog1.setAge(1);
		frog1.setColor("zelen");
		
		Frog frog2 = new Frog();		
		frog2.setInfo("Zaba", 2, "zuta");
		
		System.out.println(frog1.getName());

		System.out.println(frog2.getName());
		
		frog2.zvuci();
	}

}
