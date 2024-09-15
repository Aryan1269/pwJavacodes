

 abstract class superc {
   public superc() {System.out.println("AIR");}
    abstract void meth1();
    private  void meths(){
        
    };
}

class subs extends superc{
    @Override
    void meth1() {
        System.out.println("override");
    }
}

public class abstractRules {
    /*
     * abstract cls cannot be final 
     * --||-- method also cannot be final 
     *  only refrence created , no object
     *   no static class be abstract
     * if abstract inherited then abstract meth should override otherwise that cls is also abstract
     */
    public static void main(String[] args) {
       superc ss = new subs();
       ss.meth1(); 
    }
}
