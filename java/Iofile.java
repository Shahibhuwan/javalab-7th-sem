/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Dell
 */
import java.io.*;
public class Iofile {
//    private static final String FILE_PATH= "C:\Users\Dell\Documents\abc.txt";
//            private static final Strig OUTPUT_FILE= "C:\Users\Dell\Documents\xyz.txt";

      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author DELL
 */

    private static final String FILE_PATH = "C:\\Users\\Dell\\Documents\\abc.txt";
    private static final String OUTPUT_FILE = "C:\\Users\\Dell\\Documents\\xyz.txt";
    
    
//    reading from a file
    public void ioExample() throws Exception {
        InputStream is = null;
        int i;
        char c;
        
        try {
//            new input stream created
            is = new FileInputStream("C:\\Users\\Dell\\Documents\\abc.txt");
            
            System.out.println("Characters printed from File : ");
            
//            reads till the end of the stream
            while((i = is.read())!=-1) {
                
//                converts integer to character
                c = (char)i;
                
//                prints character
                System.out.print(c);
            }
        } catch(Exception e){
        } finally {
            //release system resources associated
        }
    }
    
    public void readFile() {
        try {
            FileInputStream inputstream = new FileInputStream(FILE_PATH);
            InputStreamReader reader = new InputStreamReader(inputstream, "UTF-16");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public void writeFile() {
        try {
            FileReader reader = new FileReader(OUTPUT_FILE);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        Iofile io = new Iofile();
        io.readFile();
        io.writeFile();
    }
}


    
            
            

