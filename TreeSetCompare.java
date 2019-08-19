package session9;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCompare {

	public static void main(String a[]) {
		TreeSet<Employee> treeComp = new TreeSet<Employee>(new TreeCompare());
		treeComp.add(new Employee("Alex   ", 30000, 3));
		treeComp.add(new Employee("Beth   ", 60000, 2));
		treeComp.add(new Employee("Charlie", 20000, 4));
		treeComp.add(new Employee("David  ", 24000, 1));
		treeComp.add(new Employee("Earl   ", 32000, 5));
		treeComp.add(new Employee("Frank  ", 60000, 7));
		treeComp.add(new Employee("Alex   ", 20000, 9));
		treeComp.add(new Employee("Alex   ", 24000, 13));
		treeComp.add(new Employee("Alex   ", 24000, 14));
		treeComp.add(new Employee("Alex   ", 24000, 8));
		treeComp.add(new Employee("Charlie", 30000, 10));
		treeComp.add(new Employee("Frank  ", 60000, 6));
		treeComp.add(new Employee("Frank  ", 22000, 11));
		treeComp.add(new Employee("Alex   ", 24000, 12));
		for (Employee e : treeComp) {
			System.out.println(e);
		}

	}
}

class TreeCompare implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else if (e1.getSalary() < e2.getSalary()) {
			return -1;
		} else if (e1.getName().compareTo(e2.getName()) > 0) {
			return 1;
		} else if (e1.getName().compareTo(e2.getName()) < 0) {
			return -1;
		} else if (e1.getDesignation() > e2.getDesignation())
			return 1;
		else
			return -1;

	}
}

class MySalaryComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
}

class Employee {

	private String name;
	private int salary;
	private int designation;

	public Employee(String n, int s, int d) {
		this.name = n;
		this.salary = s;
		this.designation = d;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Salary: " + this.salary + " Name: " + this.name + " Designation: " + this.designation;
	}
}