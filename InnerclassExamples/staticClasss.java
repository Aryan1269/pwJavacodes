

class Outer {
    static String y = "static literal";
    int y1 = 10;

    static class Inner {
        static public void display() {
            System.out.println("inner static class :" + y);
            // only static literal can be accessed
        }
    }

}

public class staticClasss {
    public static void main(String[] args) {

        // to call inner static cls
        Outer.Inner in = new Outer.Inner();
        in.display();

        // in.display();

        /// another way to call
        
        Outer.Inner.display();
    }
}
