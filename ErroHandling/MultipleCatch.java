public class MultipleCatch {
    public static void main(String[] args) {
        int[] a = {20,2,4,45,0};

        try {
        int c=a[0]/a[1];

        System.out.println("disvision is : " +c);

            //not execute directly goes to catch for first error
        System.out.println(a[22]);
            //nested
        try {
            System.out.println(a[10]);
        } catch (Exception e) {
            System.out.println(e);
        }

        }
        catch(ArithmeticException e) {
            System.out.println("Denominator should not be zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is Invaild");
        }

        System.out.println("bye");
    }
}
