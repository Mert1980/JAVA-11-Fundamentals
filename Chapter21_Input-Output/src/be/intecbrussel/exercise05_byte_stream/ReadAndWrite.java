package be.intecbrussel.exercise05_byte_stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.DeflaterOutputStream;

public class ReadAndWrite {
    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("Person");
            FileOutputStream fout=new FileOutputStream("def.txt");
            DeflaterOutputStream out=new DeflaterOutputStream(fout);

            int i;
            while((i=fin.read())!=-1){
                out.write((byte)i);
                //out.flush();
            }
            fin.close();
            out.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("rest of the code");
    }
}
