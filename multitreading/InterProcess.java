//handling race condition

class Mydata {
    int value;
    boolean flag = true;

    synchronized public void setVal(int val) {
        while(flag!=true)
            try {
                wait(1);
            } catch (InterruptedException e) {
               
            }
        this.value = val;
        flag = false;
        notify();
    }

    synchronized public int getVal() {
        while(flag!=false)
            try {
                wait(1);
            } catch (InterruptedException e) {
       
            }
            flag = true;
            return value;
    }

   
}

class Consumer extends Thread{
    Mydata d;

    Consumer (Mydata d) {
        this.d = d;
    }

    public void run() {
        
        while (true) {
            int value=d.getVal();
            System.out.println("consumer :"+value);
            
        }
    }
}

class Producer extends Thread{
    Mydata d;

    Producer(Mydata d) {
        this.d = d;
    }

    public void run() {
        int i = 1;
        while (true) {
            d.setVal(i);
            System.out.println("producer: "+i);
            i++;
        }
    }
}

public class InterProcess {
    public static void main(String[] args) {
        Mydata data = new Mydata();

       Producer t1 = new Producer(data);
       Consumer t2 = new Consumer(data);

        t1.start();
        System.out.println();
        t2.start();
    }
}
