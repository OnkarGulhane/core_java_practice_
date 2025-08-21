import java.util.*;

class Vowel{
    public static void main(String args[]){
        
        String str;
        int i;
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        str = scanner.nextLine();
        for(i=0;i<str.length();i++){
            ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                System.out.print(ch+" ");
        }
    }
}