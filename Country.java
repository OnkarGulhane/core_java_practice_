import java. util.*;

class Continent {

    String continentName;

    void accept(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Continent Name:");
        continentName = sc. next();

    }

    void display(){

        System.out.println("CONTINENT NAME:"+continentName);
    }
}

class Country extends Continent{
    String countryName;
    
    void accept(){
        super.accept();
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter Country Name: ");
        countryName = sc.next();
    }

    void display(){
        super.display();
        System.out.println("COUNTRY NAME:"+countryName);
    }
}

class State extends Country{

    String stateName,place;
    void accept(){

        super.accept();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter State Name:");
        stateName = sc.next();

        System.out.print("Enter Place:");
        place  = sc.next();


    }
    void display(){

        super.display();    
        System.out.println("STATE NAME:"+stateName);
        System.out.println("PLACE:"+place);

    }
}

 class TestCountry{
    public static void main(String args[]){
        Continent ct = new State();
        ct.accept();
        System.out.println("\n--DETAILS ENTERED--");
        ct.display();
        

    }
}