/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author francisco.rubial
 */
public class FileManager {

    private final String url;
    private final File file;
    private FileWriter fileWriter;
    private BufferedWriter bufferWriter;
    private Scanner input;

    public FileManager() {
        this.url = null;
        this.file = null;
        this.fileWriter = null;
        this.bufferWriter = null;
        this.input = null;
    }

    public FileManager(String url) {
        this.url = url;
        this.file = new File(this.url);        
    }
    
    
    public void openForWrite() throws IOException {
        this.fileWriter = new FileWriter(this.file);
        this.bufferWriter = new BufferedWriter(this.fileWriter);        
    }
    
    public void openForRead() throws FileNotFoundException {
        this.input = new Scanner(this.file);
    }
    
    public void writeInFile(String text) throws IOException {
        
        this.bufferWriter.write(text);        
    }
    
    public void readFile() throws FileNotFoundException{
        System.out.println("File's content:");
        while(this.input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
    }
    public void closeFile() {  
        
        try {
            System.out.println("Closing....");
            bufferWriter.close();
            input.close();            
        } catch (IOException | NullPointerException ex) {
            System.out.println("One buffer is null...");
            System.out.println("Closed... OK.");
        }
        System.out.println("Done.");
        System.out.println("");
        
    }
}
