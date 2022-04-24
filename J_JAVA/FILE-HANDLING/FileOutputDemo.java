/*
program to copy text from one file to another


*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputDemo
{
    public static void main(String args[]) {
        try{
            int c;
            FileInputStream fr = new FileInputStream("orignal.txt");
            FileOutputStream fw = new FileOutputStream("copyfile.txt");
            while((c=fr.read())!=-1)
            {
                fw.write((char)c);
            }
            fw.close();
            fr.close();

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
    }
}