package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) throws IOException {
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("./src/IO/xanadu.txt");
            out = new FileOutputStream("outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
