import java.util.*;

class Addition{
    public static void main(String args[]){
        Random ob = new Random();
        int a,b,c;
        a =ob.nextInt(100);
        b = ob.nextInt(10);
        c = a+b;

        System.out.println("First Number is :"+a);
        System.out.println("Second Number is :"+b);
        System.out.println("Total is :"+c);
        
    }

}
