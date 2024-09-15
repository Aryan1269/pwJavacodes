

class Outer {
    int x=10;
    Inner i = new Inner(); //any order declare
    class Inner {
        int y =10 ;
        void Display(){
            System.out.println("inner class :"+x);
        }
    }

    void OuterDisplay(){
        // Inner i = new Inner();
        i.Display();
        System.out.println(x+" :: "+ i.y);
    }
}

public class demoInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterDisplay();

        // to call inner cls
        Outer.Inner in = new Outer().new Inner();

        in.Display();
    }
}
