package lab9;

public class LAB9_2 {
    public static void main(String[] args){
        Runnable r1 = new PrintNumber(1);
        Runnable r2 = new PrintNumber(2);

        Thread on = new Thread(r1);
        Thread en = new Thread(r2);

        on.start();
        en.start();
    }
}
class PrintNumber implements Runnable{
    int start;   
    PrintNumber(int a){
        this.start=a;
    }

public void run(){
   for(int i=start;i<=20;i+=2){
    System.out.println(i);
   }
}
}