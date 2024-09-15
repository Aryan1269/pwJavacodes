


class MyThread extends Thread {

    public void run(){

        int i=0;

        while(true){
            System.out.println(i + "Hello");
            i++;
        }
    }
}

//directly extends from main class
class ThreadByExtends extends Thread {

    public void run(){
        int i=0;

        while(true){
            System.out.println(i + "Inside main class");
            i++;
        }
    }
    public static void main(String[] args) {
       
        MyThread t1 = new MyThread();
        t1.start();

        ThreadByExtends t = new ThreadByExtends();
        t.start();
        System.out.println("\n");

        int i=0;

        while(true){
            System.out.println(i + "World");
            i++;
        }
    }
}
