package OOPS;

// Practice Questions for You

// Create an Employee class with:

// Variables: id (int), name (String), salary (double).

// Constructor to initialize these.

// Method display() to print details.

// Create 2 employees in Main and print details.

// BONUS: Add a method giveBonus(double bonus) that adds bonus to the salary and prints updated salary

public class Employee {

  int id;
  String name;
  double salary;

  Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  void display() {
    System.out.println("Id: " + id + " Name: " + name + " Salary " + salary);
  }

  void giveBonus(double bonus) {
    salary += bonus;
    System.out.println(salary);
  }
}
