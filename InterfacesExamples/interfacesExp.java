abstract class test3{
  abstract public void meth6();
}
interface Test {
    void meth1();

    void meth2();
}
//can be extended
interface Test4 extends Test2 {
    void meth7();
}

interface Test2{
    void meth4();
    void meth5();
}
// inherit + multiple interfaces
class Testing extends test3 implements Test, Test2 {

    @Override
    public void meth4() {
        
       System.out.println("Unimplemented method 'meth4'");
    }

    @Override
    public void meth5() {
        
       System.out.println("Unimplemented method 'meth5'");
    }

    @Override
    public void meth1() {
        
       System.out.println("Unimplemented method 'meth1'");
    }

    @Override
    public void meth2() {
        
       System.out.println("Unimplemented method 'meth2'");
    }

    @Override
    public void meth6() {
        
       System.out.println("Unimplemented method 'meth6'");
    }

}
//multiple inheritance test,test2 by comma of interface
class MyTest implements Test,Test2   {

    @Override
    public void meth1() {
        System.out.println("meth1 of myTest");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 of myTest");
    }

    public void meth3() {
        System.out.println("Meth3 of myTest");
    }

    @Override
    public void meth4() {
        System.out.println("Meth4 of myTest");
    }

    @Override
    public void meth5() {
        System.out.println("Meth5 of myTest");
    }

}

public class interfacesExp {
    public static void main(String[] args) {

    // MyTest t = new MyTest();
    Testing t = new Testing();
        t.meth1();
        t.meth2();
        t.meth6();
        t.meth4();
        t.meth5();
    }
}
