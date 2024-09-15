abstract class LocalInner {
    abstract void display();
}

class Outer {

    public void Annyomouss(){
         
            LocalInner li = new LocalInner(){
                
                void display(){
                    System.out.println("no acess modifier in abstract");
                }
         };

         li.display();
         
 
     }
 }

public class AnnyomousClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.Annyomouss();
    }
}
