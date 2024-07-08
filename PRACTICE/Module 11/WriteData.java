import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        File file = new File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exists.");
            System.exit(0);
        }

        try {
            PrintWriter output = new PrintWriter(file);

            output.print("Muhsina beegum ");
            output.println(90);
            output.print("vhgujk ");
            output.println(56);

            output.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
