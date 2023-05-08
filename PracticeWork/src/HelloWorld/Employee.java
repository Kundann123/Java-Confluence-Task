package HelloWorld;
import java.util.*;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	Employee(int id, String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int compareTo(Employee emp) {
		if(salary==emp.salary)
			return 0;
		else if(salary>emp.salary)
			return 1;
		else
			return -1;
		
	}

}
