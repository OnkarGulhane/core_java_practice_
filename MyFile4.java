import java.util.*;
import java.io.*;

class MyFile4{
    public static void main(String args[]){
        String fname,choice;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        fname = sc.next();

        File f = new File(fname);
         if(f.isFile())
            System.out.println(fname+ "is a File");
         else if(f.isDirectory()){
            String content[] = f.list();
            for(int i=0;i<content.length;i++){
                File ff = new File(fname+"//"+content[i]);
                if(ff.isFile()&& content[i].endsWith("txt")){
                    System.out.println("Do you Want to Delete "+content[i]+" Yes/No");
                    choice = sc.next();
                    if(choice.equalsIgnoreCase("Yes"))
                        ff.delete();
                }
            }
         }
         else 
            System.out.println("File or Directory not found");   

    }
}