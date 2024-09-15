//custom
class negativeDimension extends Exception {

    public String toString(){
        return "dimension cannot be negative";
    }

}


public class UserException {

    

    static int area(int l , int b) throws negativeDimension {
        if(l<0 || b<0) 
          throw new negativeDimension();
          //throw new Exception();
        return l*b;
    }
    

    static void meth2()throws Exception{
        area(-10, 0);
    }

    static void meth3() throws Exception{
        meth2();
    }
    public static void main(String[] args) {
        try {
            meth3();
        } catch (Exception e) {
        System.out.println("user exception");
        }
        finally {
            //not having catch block
            System.out.println("excute definately");
        }
    }

    
    
}
