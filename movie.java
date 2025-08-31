
import java.util.Scanner;

class Movie {
   private int mno;
   private String mname;
   private int mid;
   private Float price;

   Movie() {
   }

   public void accept() {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter Movie Number:");
      this.mno = var1.nextInt();
      System.out.println("Enter Movie Name:");
      this.mname = var1.next();
      System.out.print("Enter Movie Id:");
      this.mid = var1.nextInt();
      System.out.print("Enter MOVIE TICKET PRICE:");
      this.price = var1.nextFloat();
      System.out.print("\n");
   }

   public void display() {
      System.out.println("MOVIE NUMBER :" + this.mno);
      System.out.println("MOVIE NAME:" + this.mname);
      System.out.println("MOVIE ID:" + this.mid);
      System.out.println("MOVIE TICKET PRICE:" + this.price);
   }
}



class TestMovie{
    public static void main(String args[]){
    int n,i;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter how many movie details:");
    n = scanner.nextInt();
    Movie m[] =new Movie[n];

    for(i=0;i<n;i++){

        m[i]=new Movie();
        m[i].accept();
    }
    for(i=0;i<n;i++){
        m[i].display();
    }

    }

}
 

