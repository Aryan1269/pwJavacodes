
class Outer {

   public void Display(){
        class LocalInner
        {
          public  LocalInner(){
                System.out.println("local Inner");
            }

            void innerDisplay(){
                System.out.println("no acess modifier");
            }
        }
        LocalInner li = new LocalInner();
        li.innerDisplay();
        

    }
}
public class localInnerClass {
    public static void main(String[] args) {
        
        Outer o = new Outer();
         o.Display();
    }
}
