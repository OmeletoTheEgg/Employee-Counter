
public class Employee {
	public String name = "";
	public boolean gender = false; //male false ; female true
	public boolean married = false;
	public String age = "0";
	
	Employee() {}
	Employee(String name) {
		this.name = name;
	}
	Employee(String name, boolean gender, boolean married, int age) {
		this.name = name;
		this.gender = gender;
		this.married = married;
		this.age = Integer.toString(age);
	}
}
