package Unique_topics;
class Singleton {
    private int length;
    private int breadth;

    // static private Singleton s = new Singleton();

    static private Singleton s = null;

    private Singleton() {
        length = 10;
        breadth = 10;
    }

    public void area() {
        System.out.println(length * breadth);
    }

    static Singleton getInstance() {
        // return s;
        if (s == null) {

            s = new Singleton();
        }
        return s;
    }
}

public class singletionClass {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s + "  " + s2);
        s.area();
    }
}
