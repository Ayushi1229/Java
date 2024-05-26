import java.util.Scanner;
public class Lab5_7 {
    public static void main(String[] args){
        Time t1 = new Time();
        Time t2 = new Time(11,45);

        t1.displayTime();
        t2.displayTime();
    }
}
class Time {
    int hrs,min;
    Time(){
        hrs = 12;
        min = 30;
    }
    Time(int hrs,int min){
        this.hrs = hrs;
        this.min = min;
    }
    void displayTime(){
        System.out.println(hrs + " : " + min);
}
}