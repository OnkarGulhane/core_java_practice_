import java.util.*;
abstract class Order{
    int id;
    String description;
    abstract void accept();
    abstract void display();
}
class PurchaseOrder extends Order{
    String customername;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase Order id: ");
        id = sc.nextInt();
        System.out.print("Enter description: ");
        description = sc.next();
        System.out.print("Enter Customer Name: ");
        customername = sc.next(); 

    }
    void display(){
        System.out.println("PURCHASE ORDER ID: "+id);
        System.out.println("PRODUCT DESCRIPTION: "+description);
        System.out.println("CUSTOMER NAME: "+customername);
    }
}

class SalesOrder extends Order{
        String vendorname;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales Order id: ");
        id = sc.nextInt();
        System.out.print("Enter description: ");
        description = sc.next();
        System.out.print("Enter Vendor Name: ");
        vendorname = sc.next(); 

    }
    void display(){
        System.out.println("PURCHASE ORDER ID: "+id);
        System.out.println("PRODUCT DESCRIPTION: "+description);
        System.out.println("VENDOR NAME: "+vendorname);
    }

}


class TestSales{
    public static void main(String args[]){
        Order[] order  = new Order[6];

        for (int i = 0;i<3;i++){
            order[i] = new PurchaseOrder();
            order[i].accept();
        }

         for (int i = 3;i<6;i++){
            order[i] = new SalesOrder();
            order[i].accept();
        }

        for(Order o : order){
            o.display();
        }


    }
}