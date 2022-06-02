package app.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain {
    //? File reader extends the reader object
    public static void main(String []args) throws FileNotFoundException, IOException { //? We throw to the JVM to handle
        String srcFile = args[0];
        Reader reader = new FileReader(srcFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = "abc";
        int lineNum = 0;
        while (line != null) {
            line = bufferedReader.readLine();
            lineNum++;
            System.out.printf("%d: %s\n", lineNum, line);
        }
        reader.close();
    }
}
