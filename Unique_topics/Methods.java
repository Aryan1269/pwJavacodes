package Unique_topics;
class Methods {
   


    int Incr(int x) {
        return x + 1;
    }


    Methods() {
        System.out.println("this constructor");
        System.out.println("not gobal");

    }

  void meth() {
        System.out.println("this static without obj call");
    }

    // just array change or when you send obj its value get change

    void update(int A[]) {
        A[0] = 23;
    }

    public static void main(String[] args) {

        Methods m = new Methods();

      
        int x = 5;
        System.out.println();

        int A[] = { 0, 34, 5, 15, 43 };

        m.update(A);
        System.out.println("this is Array :" + A[0]);
        m.Incr(x); // does not change value of x
        System.out.println(x);
    }
}
