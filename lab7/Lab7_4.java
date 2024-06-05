package lab7;
interface EventListener{
    public void perfromEvent();
}

interface MouseListener extends EventListener{
        public void mouseClicked();
        public void mousePressed();
        public void mouseReleased();
        public void mouseMoved();
        public void mouseDragged();
}

interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();

}

class EventDemo implements MouseListener, KeyListener{
    public void perfromEvent(){
        System.out.println("Event will start performing");
    }
    public void mouseClicked(){
        System.out.println("Mouse is Clicked");
    }
    public void mousePressed(){
        System.out.println("Mouse is Pressed");
    }
    public void mouseReleased(){
        System.out.println("Mouse is Released");
    }
    public void mouseMoved(){
        System.out.println("Mouse is Moved");
    }
    public void mouseDragged(){
        System.out.println("Mouse is Dragged");
    }
    public void keyPressed(){
        System.out.println("Key is Pressed");
    }
    public void keyReleased(){
        System.out.println("Key is Released");
    }

}
public class Lab7_4 {
    public static void main(String[] args) {
        EventDemo e = new EventDemo();
        e.perfromEvent();
        e.mouseClicked();
        e.mousePressed();
        e.mouseReleased();
        e.mouseMoved();
        e.mouseDragged();
        e.keyPressed();
        e.keyReleased();
        
    }
    
}