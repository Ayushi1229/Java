// import java.util.Scanner;

// public class NumOfObjects {
//     static int count=0;
//     public static void main(String[] args){
//         NumOfObjects N1 = new NumOfObjects();
//         NumOfObjects N2 = new NumOfObjects();
//         System.out.println(count);
//         }
//         NumOfObjects(){
//             count++;
//         }
//         NumOfObjects(int a){
//             count++;
//         }
// }

class ObjectCountadder {
    static int NumberOfObbjects = 0;

    public ObjectCountadder() {
        NumberOfObbjects++;
    }

}

public class Lab5_6{

    public static void main(String[] args) {
        ObjectCountadder obj1 = new ObjectCountadder();
        ObjectCountadder obj2 = new ObjectCountadder();
        ObjectCountadder obj3 = new ObjectCountadder();

        System.out.println("Number of objects created: " + ObjectCountadder.NumberOfObbjects);
    }
}

// here both the code arer correctly written