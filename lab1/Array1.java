public class Array1 {
    public static void main(String[] args){
        //61 wicket
        //62 wide
        //63 no ball
        int[] runs = {5,61,62,1,0,63,8,1,0};
        int total = 0;
        int totalWicket = 0;
        int extraRuns = 0;
        
        for(int i=0;i<runs.length;i++){
            if(runs[i]>60){
                if(runs[i]==61){
                    
                    totalWicket++;
                }
            else if(runs[i]==62 || runs[i]==63){
                extraRuns++;
                total++;
            }
            }
            else{
                    total += runs[i]; 
            }
        }
        System.out.println(total+"/"+totalWicket);
        System.out.println("Extra = "+extraRuns);
    }
}
