import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 * fileExample
 */
public class fileExample {

    public static void main(String[] args) {

        try
        {
            FileOutputStream fos = new FileOutputStream("./test.txt");  

            String str = "don antony";

            fos.write(str.getBytes());
            // offset

            // fos.write(str.getBytes(),2,str.length()-2);

            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        } 
        
        try
        {
            // FileInputStream f = new FileInputStream("./test.txt"); 
            FileReader f = new FileReader("./test.txt");  

            int x;
            
            while((x=f.read())!=-1){
                System.out.print((char)x);
            };
            //    byte b[] = new byte[f.available()];
            //  f.read(b)
            //inputstream ke liye
            //  String str = new String(b);
            // System.out.println(str);
            f.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        
       
    }
}