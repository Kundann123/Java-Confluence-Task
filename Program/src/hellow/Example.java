package hellow;

class Person{
	int id;
	String name;
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
	class Per extends Person{
		int salary;
		Per(int id,String name,int salary){
			super(id,name);
			this.salary=salary;
		}
		void display() {
			System.out.println(id+" "+name+" "+salary);
		}
	}


public class Example {
	public static void main(String[] args) {
		Per p=new Per(1,"rahul",20000);
		Per p1=new Per(2,"mayank",1000);
		p.display();
		p1.display();
		
	}

}
