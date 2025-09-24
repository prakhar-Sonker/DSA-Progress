package OOPS;

public class Main {

  // public static void main(String[] args) {
  // Student s1 = new Student();
  // s1.name = "Prakhar";
  // s1.rollnumber = 11;
  // s1.marks = 69.8;
  // Student s2 = new Student();
  // s2.name = "Rohit";
  // s2.rollnumber = 22;
  // s2.marks = 45.89;
  // s1.display();
  // s2.display();

  public static void main(String[] args) {
    Employee e1 = new Employee(2, "Prakhar", 10000);
    Employee e2 = new Employee(1, "Rohit", 11000);

    e1.display();
    e2.display();
    e1.giveBonus(1000.70);
    e2.giveBonus(2900.45);
    e1.display();
    e2.display();
  }

}
