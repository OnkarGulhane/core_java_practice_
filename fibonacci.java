import java.util.Scanner;

class Fibonacci{

        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);

            int n,ans,num1 = 0,num2=1,i;
            System.out.print("Enter Fibonacci Series:");
            n = scanner.nextInt();

            for(i=2;i<n;i++){
                int num3  = num1+num2;
                System.out.print(","+num3);

                num1 = num2;
                num2 = num3;
            }

        }
}
