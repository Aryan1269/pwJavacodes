import java.util.Scanner;

/**
 * ErrohandlingEx
 */
public class ErrohandlingEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        try {
        int a=sc.nextInt(), b=sc.nextInt() ,c;
        c=a/b;
        System.out.println(c);

    }
    catch(ArithmeticException e){
        System.out.println("denominator should not be zero");
    }
    
    System.out.println("bye");
    }
}