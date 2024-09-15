//constructor

class MyRun implements Runnable {
    public void run() {

    }
}

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        int i = 0;

        while (true) {
            System.out.println(i +"my thread");
            // try {
            //     Thread.sleep(1000);
                
            // } catch (Exception e) {
            //   System.out.println(e.getMessage());
            // }
            i++;
        }
    }
}

class TreadClassDemo {

    public static void main(String[] args) {

        // Thread t = new Thread(new MyRun(), "my Name");
        // Thread t = new Thread(new MyRun());

        MyThread t = new MyThread("My Thread 1");

        // t.setDaemon(true);
        //daemon when main ends program ends to check use sleep in main
        t.start();


        int i=0;

        while(true){
            System.out.println(i + " Main");
            Thread.yield();
            //more cpu this for my thread becuse no starve for resource
            i++;
        }


        // Thread mainThread=Thread.currentThread();
        // try {
        //     mainThread.join();
            
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        // t.interrupt();

        // System.out.println("id :" +t.threadId());
        // System.out.println("name:" +t.getName());
        // System.out.println("priority : "+t.getPriority());
        // System.out.println("state :" +t.getState());
        // System.out.println("Alive :"+t.isAlive());
    }
}
