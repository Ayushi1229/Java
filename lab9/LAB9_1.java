package lab9;

public class LAB9_1 {
    public static void main(String[] args){
        Runnable r1 = new PrintMessage("Good Morning",1000);
        Runnable r2 = new PrintMessage("Good Afternoon",3000);

        Thread gm = new Thread(r1);
        Thread ga = new Thread(r2);

        gm.start();
        ga.start();
    }
}
class PrintMessage implements Runnable{
    String msg;
    int delay;

    PrintMessage(String msg,int delay){
        this.msg = msg;
        this.delay = delay;
    }

public void run(){
    try{
        while(true){
            System.out.print(msg);
            Thread.sleep(delay);
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
}