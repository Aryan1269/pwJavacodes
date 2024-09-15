

abstract class Supercls{
    public Supercls() {System.out.println("super class");}
    
    public void meth1(){
        System.out.println("Method 1 in super class");
    }

    abstract void meth2();
}

class sub extends Supercls {
    public void meth2(){
        System.out.println("this is sub");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        //abstract cls only refrence allowed
        Supercls su ; 
      //  su=new Supercls(); // no object allowed 
        Supercls s = new sub();
        s.meth1();
        s.meth2();
    }
}
