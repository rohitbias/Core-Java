package interfaceabstract;

 class Student {
	String name;
	int id;
	
	public void display()
	{
		System.out.println("Name: " +name+ "ID: "+ id);
	}

	public Student(String name, int i) {
		this.name=name;
		this.id=i;
		
		// TODO Auto-generated constructor stub
	}
 }

	public class Tes{
		
	public static void main(String[] args) {
		
		Student s1= new Student("name",5);
		Student s2= new Student("rohit",6);
		// TODO Auto-generated method stub
		s1.display();
		s2.display();
		
	}
	}

