package app.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

//? What this program does:
// Copy a file from the <src> to the <dest>

public class IOMain {
    public static void main(String[] args) {

        //? Get the file name
        String srcFile = args[0];
        String destFile = args[1];

        //? Creating a 1k byte buffer array
        byte[] buff = new byte[1024];
        int size = 0;
        try {
            InputStream inputStream = new FileInputStream(srcFile);
            System.out.printf("%s File opened \n", srcFile);

            OutputStream outputStream = new FileOutputStream(destFile);

            while (size >= 0) {
                size = inputStream.read(buff);
                System.out.printf("read: %d \n", size);

                //? Write the file
                if (size > 0)
                outputStream.write(buff, 0, size);

                //? When do we not write?
                // When the size is -1 because you reached the end of the file


            }
            inputStream.close();
            outputStream.flush();
            outputStream.close();
            
        } catch (FileNotFoundException ex) {
            System.err.printf("Error: %s \n",  ex.getMessage());
        } catch (IOException ex) {
            System.err.printf("Error: %s \n",  ex.getMessage());
        }

        // // //? Create a file object
        // // Path p = Paths.get("");
        // // //? Convert path to file object
        // // File hostFile = p.toFile();

        // // //? Directly create a file object (Second Method)
        // // File hostFile2 = new File("");
        // // File etcDir = new File("/etc");

        // // //? Printing out the message
        // // System.out.printf("%s directory? %b \n", hostFile2.getAbsoluteFile(), hostFile.isDirectory());
        // // System.out.printf("is directory? %b\n", etcDir.getName(), etcDir.isDirectory());
    }
}
