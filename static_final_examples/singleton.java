
class coffee{

    private static coffee c = null;
    private coffee() {

    }

    static public coffee getInstance() {
        if(c==null ) return c = new coffee();
        return c;
    }
}

public class singleton {
   public static void main(String[] args) {
      coffee cc = coffee.getInstance();
      coffee cc1 = coffee.getInstance();
      System.out.println(cc);
      System.out.println(cc1);
   } 
}
