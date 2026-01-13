

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Employee emp = new Employee("akshit", 25, 5000);
        Employee manager = new Manager(100, "Harish", 12, 12000);
        Employee developer = new Developer("Suraj", 43, 50000, "JAVA");
        Employee intern = new Intern("joe", 31, 2000);
        emp.displayDetails();
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }

class Manager extends Employee{
	int teamSize;

	Manager(int teamSize,String name,int id,int salary ) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	void displayDetails() {
		super.displayDetails();
		System.out.println("Team Size of the company:" + teamSize);
		
	}
	
}

class Employee {

    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    boolean displayDetails() {
        System.out.println("Name " + name);
        System.out.println("Id " + id);
        System.out.println("Salary " + salary);
        return true;

    }
}

class Manager extends Employee {

    int teamSize;

    Manager(int teamSize, String name, int id, int salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    boolean displayDetails() {
        super.displayDetails();
        System.out.println("Team Size :" + teamSize);
        return true;

    }

}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeatils() {
        super.displayDetails();
        System.out.println("Programming Language " + programmingLanguage);
    }
}

class Intern extends Employee {

    Intern(String name, int id, int salary) {
        super(name, id, salary);
    }

    boolean displayDetails() {
        super.displayDetails();
        return true;
    }
}
