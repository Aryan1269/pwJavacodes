
@FunctionalInterface  //single method
interface MyLambda {
    // public void display();
    public void display(String str); // with para
}
 class lamdaDemo {
    public static void main(String[] args) {
        // MyLambda m = ()->{
        //     System.out.println("hello World");
        // };
        
        MyLambda m = (s)->{
            System.out.println("hello" + s);
        };

        m.display("added para");


    }
}
