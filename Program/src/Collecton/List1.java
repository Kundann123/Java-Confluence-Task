package Collecton;

import java.util.*;

class emp{
	int id;
	String name;
	int salary;
	
	emp(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class List1 {
	public static void main(String[] args) {
		emp e1=new emp(10,"nitin",20000);
		emp e2=new emp(11,"jatin",30000);
		emp e3=new emp(12,"nikhil",10000);
		
		ArrayList<emp> Al=new ArrayList();
		Al.add(e1);
		Al.add(e2);
		Al.add(e3);
		
//		Iterator itr=Al.iterator();
//		while(itr.hasNext()) {
//			emp k=(emp)itr.next();
//			System.out.println(k.id+" "+k.name+" "+k.salary);
//		}
		
		for(emp i:Al) {
			System.out.println(i.id+" "+i.name+" "+i.salary);
		}	
		}

}
