package lab8;

public class Lab8_1 {
    public static void main(String[] args){
        try{
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            int result=1;
            for(int i=0;i<=y;i++){
                result *=i;
            }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid number format");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter proper intger");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
