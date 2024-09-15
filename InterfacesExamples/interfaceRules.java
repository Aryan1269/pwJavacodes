
interface Tester {
    int x = 0; // not good
    final static int S = 23;
    int X = 10; // indentifer

    public abstract void meth1();

    void meth2();

    public static void meth3() {
        System.out.println("meth3 of test");
    }

    default void meths4(){
        System.out.println("already meth4 default");
    }
}

interface adding extends Tester {
   private void meth4(){
    System.out.print('p');
   };

   default void call(){
    meth4();
   }

}

public class interfaceRules {
    /*
     * default static
     * default abstract & public
     * identifer should be in upperCases for naming conversion i.e static and final
     * static method can be call
     * interface can be extended
     * default meth allowed so that if modify existing interface can should not create problem
     * private is also allowed called by default meth
     */
    public static void main(String[] args) {

    }
}
