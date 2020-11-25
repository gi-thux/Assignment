package day22;

public class PersonTest {
	public static void main(String[] args) {
		Person obj= new Person();
		obj.setName("hari");
		obj.setNationality("american");
		obj.setRoll(1);
		System.out.println(obj.getName());
		System.out.println(obj.getNationality());
		System.out.println(obj.getRoll());
		
		System.out.println("===========");
		
		Person obj1= new Person();
		obj1.setName("sita");
		obj1.setNationality("indian");
		obj1.setRoll(2);
		System.out.println(obj1.getName());
		System.out.println(obj1.getNationality());
		System.out.println(obj1.getRoll());
	}

}
