package myPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import myPackage.Q7_Comparator.Employee;

public class Q7_Compare{
	public class Employee implements Comparator<Employee>{
		Integer age;
		String name;
		String department;
		
		public int compare(Employee employee1, Employee employee2) {
			if(employee1.name == employee2.name) {
				if(employee1.department == employee2.department) {
					return employee1.age.compareTo(employee2.age);
				}else {
					return employee1.department.compareTo(employee2.department);
				}
			}else {
				return employee1.name.compareTo(employee2.name);
			}
		}
		
		public String toString() {
			return name + "," + department + "," + age + ".";
		}
	}

	public void Compare() {
		Employee peter = new Employee();
		peter.name = "Peter";
		peter.department = "Accounting";
		peter.age = 45;
		
		Employee chris = new Employee();
		chris.name = "Chris";
		chris.department = "IT";
		chris.age = 46;
		
		Employee peter2 = new Employee();
		peter2.name = "Peter";
		peter2.department = "Sales";
		peter2.age = 30;
		
		Employee chris2 = new Employee();
		chris2.name = "chris";
		chris2.department = "Marketing";
		chris2.age = 32;
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(peter); 
		employees.add(chris); 
		employees.add(peter2); 
		employees.add(chris2);
		
		Collections.sort(employees, new Employee());
		for(int i = 0; i < employees.size(); ++i) {
			System.out.println(employees.get(i).toString());
		}
	}
}

