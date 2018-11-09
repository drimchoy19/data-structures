
public class Person {

	static int count = 1;
	private int id;
	private int age;
	private String name;

	public Person() {

		this.id = -1;
		this.name = "";
		this.age = 0;

	}

	public Person(String name, int age) {

		this.id = count++;
		this.name = name;
		this.age = age;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return this.name;

	}

	public void setAge(int age) {

		this.age = age;

	}

	public int getAge() {

		return this.age;

	}

	public int getId() {

		return this.id;

	}

	@Override
	public String toString() {

		String str =  "ID:" + this.id+" Name:" + this.name + " Age:" + this.age;

		return str;
	}

	public Person[] initPersons() {

		Person[] p = new Person[13];

		p[0] = new Person("Gosho", 22);
		p[1] = new Person("Ivan", 23);
		p[2] = new Person("Gosho1", 24);
		p[3] = new Person("Ivan1", 43);
		p[4] = new Person("Petkan", 33);
		p[5] = new Person("Shestkan", 26);
		p[6] = new Person("Sedemkan", 27);
		p[7] = new Person("Ivan Ivanov", 31);
		p[8] = new Person("Gosho Petkov", 28);
		p[9] = new Person("Pesho Ivanov", 19);
		p[10] = new Person("Pesho Georgiev", 38);
		p[11] = new Person("Shesti Shestov", 46);
		p[12] = new Person("Sedemk Os", 27);

		return p;

	}

}
