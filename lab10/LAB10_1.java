package lab10;
import java.io.*;
public class LAB10_1 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("xyz.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.write("Hello");
            pw.write("World");
            pw.close();
            fw.close();

            int lineCount = 0, wordCounter = 0, charCounter = 0;

            FileReader fr = new FileReader("xyz.txt");
            BufferedReader br = new BufferedReader(fr);
            String data;
            while(br.readLine() !=null){
                data = br.readLine();
                lineCount++;
                charCount += data.Length();
                String[] abc = data.split(" ");
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
