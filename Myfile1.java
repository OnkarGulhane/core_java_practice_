import java.util.*;
import java.io.*;
class MyFile{
    public static void main(String args[]){
        String fname;
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a String:");
            fname = sc.next();
            File f = new File(fname);
            if(f.isFile())
                System.out.println(fname+"  is a file");
            else if(f.isDirectory())
                System.out.println(fname+"  is a directory");    
            else
                System.out.println(fname+" file or directory not found");
    }
}