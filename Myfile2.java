import java.util.*;
import java.io.*;

class Myfile2{
    public static void main(String args[]){
        String fname;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        fname = sc.next();

        File f = new File(fname);

        if(f.isFile()){
            System.out.println(fname+ "is a file");
            System.out.println("Name of file :"+f.getName());
            System.out.println("Path of File :"+f.getPath());
            System.out.println("Absolute path of File :"+f.getAbsolutePath());
            System.out.println("Readable? "+f.canRead());
            System.out.println("Writable? "+f.canWrite());
            System.out.println("Hidden?  "+f.isHidden());
            System.out.println("Length of File :"+f.length());
        }
        else if(f.isDirectory()){
             System.out.println(fname+" is a Directory");
             String content[] = f.list();
             for(int i=0;i<content.length;i++)
                System.out.println(content[i]);
        }    
        else
            System.out.println(fname+ "is neither a file nor Directory");

    }
}