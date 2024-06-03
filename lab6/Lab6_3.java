package lab6;
class Member{
    String name,address,number;
    int age,salary;
    Member(String name,String address,int age,int salary,String number){
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.number = number;
    }
    public void printSalary(){
        System.out.println("Salary: "+salary);
    }
    void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Number: "+number);
        printSalary();
    }
}

class Employee extends Member{
    String specialization;
    Employee(String name,String address,int age,int salary,String number,String specialization){
        super(name,address,age,salary,number);
        this.specialization = specialization;
    }
    void printDetails(){
        super.printDetails();
        System.out.println("Specialization: "+this.specialization);
    }
}
class Manager extends Member{
    String department;
    Manager(String name, String address, int age, int salary, String number,String department) {
        super(name, address, age, salary, number);
        this.department = department;
    }
    void printInfo(){
        super.printDetails();
        System.out.println("Department: "+this.department);
    }
}
public class Lab6_3 {
    public static void main(String[] args){
        Employee e1 = new Employee("Ayushi","Rajkot",19,4500000,"9429654754","Frontend");
        e1.printDetails();
        Manager m1 = new Manager("Jiya","Ahemdabad",30,3500000,"7845695218","IT department");
        m1.printInfo();
    }
}
