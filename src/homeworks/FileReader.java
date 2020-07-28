package homeworks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.Reader;

public class FileReader {

    // csv   common separated files
private final String path;
private final FileReader reader; // reads byte by byte
//private final BufferedReader bufferedReader;//reads line by line


    public FileReader(String path)throws FileNotFoundException {
        this.path = path;
        this.reader = new FileReader(path);
        //this.bufferedReader = new BufferedReader(reader);
    }




}
