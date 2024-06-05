package lab7;

abstract class Vegetable{
    String name;
    String color;
    public Vegetable(String color, String name){
        this.name = name;
        this.color = color;
        System.out.println("The name of vegetable is "+name);
        System.out.println("The color of vegetable is "+color);
    }
    abstract public String toString();
}
class Potato extends Vegetable{
    public Potato(String color,String name){
        super(color,name);
    }
        public String toString(){
            return "Name: "+name+"\nColor: "+color;
    }
}
class Brinjal extends Vegetable{
    public Brinjal(String color,String name){
        super(color,name);
    }
    public String toString(){
        return "Name: "+name+"\nColor: "+color;
    }
}
class Tomato extends Vegetable{
    public Tomato(String color,String name){
        super(color,name);
    }
    public String toString(){
        return "Name: "+name+"\nColor: "+color;
    }
}
public class Lab7_1 {
    public static void main(String[] args){
        Potato p = new Potato("Ochre","Potato");
        Brinjal b = new Brinjal("Purple","Brinjal");
        Tomato t = new Tomato("Red","Tomato");

        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }
}
