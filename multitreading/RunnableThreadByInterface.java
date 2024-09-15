
// runnalbe is type of obj it itself doesn't run you have to put runnable object in Mythreads refrences

// ex. like runnable is cart and thread class is hourse that will run with cart

class MyRunnable implements Runnable {

    public void run(){

        int i=0;


        while(true){
            System.out.println(i + "Hello");
            i++;
        }
    }
}

class RunnableThreadByInterface implements Runnable {

   public void run(){

        int i=0;

        while(true){
            System.out.println(i + "class inside");
            i++;
        }
    }

    public static void main(String[] args) {
        // MyRunnable r = new MyRunnable();

        RunnableThreadByInterface r = new RunnableThreadByInterface();
        Thread t = new Thread(r);
        t.start();

        int i=0;

        while(true){
            System.out.println(i + "Runnable");
            i++;
        }
    }
}
