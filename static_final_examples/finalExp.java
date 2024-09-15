/*
 * final var cannot redefine
 * final meth cannot override
 * final  cannot extended
 * final can be define
 */

public class finalExp {
   static final  int x; // static to use in main
   static // error solve 
    {
        x = 10; // instance to inital
    }

    //only instance
    final float pi;
    {
        pi = 3.14f;
    }

    // should initals before using

    public static void main(String[] args) {

        final float x1;
        x1 = 10.3f;
        System.out.println(x);
    }
}