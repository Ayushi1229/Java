import java.util.*;
class TimeDemo {
    int hr,min;
    TimeDemo() {
        hr=12;
        min=30; 

    } 
    TimeDemo(int hr,int min){
        this.hr=hr;
        this.min=min;
    }
    void addTime(TimeDemo t1,TimeDemo t2){
        int hr_ans = t1.hr + t2.hr;
        int min_ans = t1.min + t2.min;
        if (min_ans >59){
        min_ans = min_ans-60;
        hr_ans= hr_ans+1;
        }
        
        System.out.println("Time" + hr_ans + ":" + min_ans);
    }

}

public class Lab5_2 {
    public static void main(String[] args){
        TimeDemo t1 = new TimeDemo();
        TimeDemo t2 = new TimeDemo(11,30);
        t1.addTime(t1,t2);
    }
    
}