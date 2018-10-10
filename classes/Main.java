package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author francisco.rubial
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*File file = new File("src/files/test.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter buffer = new BufferedWriter(fileWriter);
        
        buffer.write("Hello World");
        buffer.close();
         */

        FileManager manager = new FileManager("src/files/test.txt");
        manager.openForWrite();
        manager.writeInFile("Helloooooooooooooooooooo");
        manager.closeFile();
        
        manager.openForRead();
        manager.readFile();
        manager.closeFile();
        

    }

}
