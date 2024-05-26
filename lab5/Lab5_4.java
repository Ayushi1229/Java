import java.util.Scanner;
class Bank{
    int accnum;
    String name, email, type;
    double balance;
    public void display(){
        System.out.println("Account Number: "+accnum);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Type: "+type);
        System.out.print("Balance: "+balance);
    }
}

public class Lab5_4 {

    public static void main(String[] args){
        Bank obj1 = new Bank();
        obj1.accnum = 101525;
        obj1.name = "jay";
        obj1.email = "jay@123";
        obj1.type = "saving";
        obj1.balance = 44000;

        obj1.display();

        Bank obj2 = new Bank();
        obj2.accnum = 101526;
        obj2.name = "ram";
        obj2.email = "ram@123";
        obj2.type = "saving";
        obj2.balance = 47000;

        obj2.display();
    }
    
}

