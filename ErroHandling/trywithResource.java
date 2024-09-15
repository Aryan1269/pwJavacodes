import java.io.File;
import java.io.FileReader;

public class trywithResource {
    public static void main(String[] args) throws Exception {
        try(FileReader f = new FileReader("my.text"))
        {
            //usefile and try with automatically close after use
        }
    }
}
