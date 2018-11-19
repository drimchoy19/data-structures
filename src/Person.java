import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
	
	public void setId(int id) {
		
		this.id = id;
		
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
		//21
		Person[] p = new Person[21];

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
		p[13] = new Person("Gosho", 22);
		p[14] = new Person("Ivan", 23);
		p[15] = new Person("Gosho1", 24);
		p[16] = new Person("Ivan1", 43);
		p[17] = new Person("Gosho Petkov", 28);
		p[18] = new Person("Pesho Ivanov", 19);
		p[19] = new Person("Sedemkan", 27);
		p[20] = new Person("Ivan Ivanov21", 31);

		return p;

	}
	
	public String writeInFile(Person[] arr) {
		
		//id*,name*,age*
		//dali go ima
		    //ako go ima chete i prezapisva
			// ako go nqma pravi nov fail
			//uspeshno rdy
			//neUspechno noRdy
		String toWrite = "";
		for(Person p : arr) {
			
			toWrite += p.getId()+"*"+p.getName()+"*"+p.getAge()+"*";
			
		}
		try {
		File file = new File("Persons.txt");
		//boolean isCreated = file.createNewFile();
		FileWriter fs = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fs);
		
		if(file.exists()) {
			bw.write(toWrite);
			bw.flush();
			bw.close();
			System.out.println("File rdy");
		}else {
			System.out.println("Cant create file");
		}
		return toWrite;
		}catch(IOException e) {
			System.out.println("Error with file!");
			e.printStackTrace();
			return "EMPTY";
			
		}
	}
	
	public Person[] readFromFile(){
		
		try {
		File file = new File("Persons.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String in = br.readLine();
		String[] strArr = in.split("\\*");
		
		Person[] personArr = new Person[strArr.length/3];
		
		int j = 0;
		for(int i=0;i<strArr.length;i+=3,j++) {
			
			personArr[j] = new Person(strArr[i+1],Integer.valueOf(strArr[i+2]));
			personArr[j].setId(Integer.valueOf(strArr[i]));
			
		}

		System.out.println("File read : Completed!");
		br.close();
		return personArr;
		}catch(IOException e) {
			System.out.println("Error with file opening!");
			e.printStackTrace();
			return null;
		}
	}

}
