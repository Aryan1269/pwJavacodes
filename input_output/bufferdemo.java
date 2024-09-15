import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

class bufferdemo  {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("./test.txt");

        //buffer temporay memory when speed is different btw source and destination

        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

//same for file reader and buffer reader
    }

    
}
