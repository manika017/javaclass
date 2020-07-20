
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person person1;
		Person person2;
		
		person1 = new Person();
		person1.name = "Manika";
		person1.age = 14;
		
		person2 = new Person();
		person2.name = "Manika 2";
		person2.age = 16;
		
		System.out.println(person1.name + "'s" + " age is " + person1.age);
		System.out.println(person2.name + "'s" + " age is " + person2.age);
		
		
	}

}
