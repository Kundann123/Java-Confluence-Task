package hellow;

public class Emp {
	int id;
	String name;
	Address address;
	
	public Emp(int id,String name,Address address) {
		this.id=id;
		this.name = name;
		this.address=address;
	}
	public void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		Address a1=new Address("sangola","MH","IND");
		Address a2=new Address("korti","MH","IND");
		Address a3=new Address("pandharpur","MH","IND");
		
		Emp e1=new Emp(10,"Karan",a1);
		Emp e2=new Emp(11,"Arjun",a2);
		Emp e3=new Emp(12,"Vijay",a3);
		
		e1.display();
		e2.display();
		e3.display();
	}

}
