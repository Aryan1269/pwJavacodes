class Test {
    static int x = 10;
    int y = 12;

    void show() {
        System.out.println(x + " ::  " + y);
    }

    static void display() {
        System.out.println(x);
    }
}

public class staticExp {
    /*
     *  only inner class can be static
     * static member are share by all class & objects
     * static data members belongs to cls
     * static data about data
     * access direct using class name
     * created in method area
     * same for methods that are static
     */

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.x = 50;
        t1.y = 12;
        t1.show();

        Test t2 = new Test();
        t2.show();
    }
}
