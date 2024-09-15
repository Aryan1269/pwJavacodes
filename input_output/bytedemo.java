import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

class bytedemo {
    public static void main(String[] args) throws Exception {
        byte b[] = { 'a', 'b', 'c', 'd' };

        // ByteArrayInputStream bis = new ByteArrayInputStream(b);

        // String str = new String(bis.readAllBytes());

        // System.out.println(str.markSupported());

 ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        
 bos.write('a');
 bos.write('b');
 bos.write('c');

 bos.writeTo(new FileOutputStream("../input_output/test.txt"));

 byte b1[]=bos.toByteArray();

        for (byte c : b1) {
            System.out.println((char)c);
        }
    }

    //same for charArrayReader instead of byte write char
}
