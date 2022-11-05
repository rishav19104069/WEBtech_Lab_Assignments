package Assignment4;
import java.util.*;
//Write a program that would print the information (name, year of joining, salary, address) of three
// employees by creating a class named Employee.The output should be:

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Employee> emp = new Vector<>(3);
        // taking input for 3 employees
        for(int i = 0;i<3;i++){
            System.out.println("Enter the details of the employee to be created- ");
            System.out.print("Name : ");
            String name = sc.next();
            System.out.print("Salary: ");
            int salary = sc.nextInt();
            System.out.print("Year of Joining: ");
            int yearOfJoining = sc.nextInt();
            System.out.print("Address: ");
            String address = sc.next();
            Employee ep = new Employee(name,yearOfJoining,salary,address);
            emp.add(ep);
        }
        // printing the details of 3 employees
        System.out.println("Name" + "       " + "Year of Joining" + "       " + "Address");
        for(int i = 0;i<3;i++){
            Employee e = emp.elementAt(i);
            e.display();
        }
    }
}

class Employee{
    String name;
    int yearOfJoining;
    int salary;
    String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    public void display(){
        System.out.println(this.name + "        "+this.yearOfJoining+"        "+this.address);
    }

}