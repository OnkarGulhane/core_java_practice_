import java.util.Scanner;
class Rectangle{

        private int length ;
        private int breadth;
        private int area;
        private int perimeter;

        public Rectangle(int l,int b){
            this.length = l;
            this.breadth = b;

        }

        public int calculateArea(){
            this.area = this.length * this.breadth;
            return this.area;
        }
        public int calculatePerimeter(){
            this .perimeter = 2 * (this.length + this.breadth);
            return this.perimeter;
        }
}

class Square{

    private int side;
    private int area;
    private int perimeter;

    public Square(int s){
        this.side = s;

    }

    public int calculateArea(){
        this.area = this.side*this.side;
        return this.area;
    }

    public int calculatePerimeter(){
        this.perimeter = 4*this.side;
        return this.perimeter;
    }
}

class Circle{

    private float radius;
    private float area;
    private float circumference;

    public Circle(float r){
        
        this.radius  = r;

    }

    public float calculateArea(){
        this.area = 3.14f * this.radius * this.radius;
        return this.area;
    }
    
    public  float calculateCircumference(){
        this.circumference = 2*3.14f*this.radius;
        return this.circumference;

    }
}

class Cone{

    private float radius;
    private float height;
    private float volume;

    public Cone(float r,float h){
        this.radius = r;
        this.height = h;
        
    }

    public float calculateVolume(){
        this.volume  = 3.14f*this.radius*this.radius*this.radius*(this.height/3);
        return this.volume;
    }

}

class Cylinder{

    private float radius;
    private float height;
    private float surfacearea;
    private float volume;

    public Cylinder(float r,float h){
        this.radius= r;
        this.height = h;
    }

    public float calculateSurfaceArea(){
        this.surfacearea = (2*3.14f*this.radius*this.height)+(2*3.14f*this.radius*this.radius);
        return this.surfacearea;
    }
    public float calculateVolume(){
        this.volume = 3.14f*this.radius*this.radius*this.height;
        return this.volume;
    }
}

class Sphere{

    private float radius;
    private float surfacearea;
    private float volume;

    public Sphere(float r){
        this.radius = r;
    }

    public float calculateSurfaceArea(){
        this.surfacearea = 4*3.14f *this.radius*this.radius; 
        return this.surfacearea;
    }

    public float calculateVolume(){
        this.volume = (4.0f/3.0f)*3.14f*this.radius*this.radius*this.radius;
        return this.volume;
    }

}


class TestShape{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int ch1,ch2,x,y;
        float r,h;
        do{

            System.out.println("1.Rectangle");
            System.out.println("2.Square");
            System.out.println("3.Circle");
            System.out.println("4.Cone");
            System.out.println("5.Cylinder");
            System.out.println("6.Sphere");
            System.out.println("7.EXIT..");

            System.out.print("Enter your choice:");
            ch1 = scanner.nextInt();
            {
                switch(ch1){
                    case 1 : System.out.print("Enter length of rectangle:");
                              x = scanner.nextInt();
                              System.out.print("Enter breadth of Rectangle:");
                              y = scanner.nextInt();
                              Rectangle rectangle  = new Rectangle(x,y);

                              do{
                                    System.out.println("1.Calculate area..");
                                    System.out.println("2.Calculate Perimeter..");
                                    System.out.println("3.Exit..");
                                    System.out.println("Enter your Choice:");
                                     ch2 = scanner.nextInt();

                                     switch(ch2){

                                        case 1 : System.out.println("Area of Rectangle is :"+rectangle.calculateArea());
                                                    break;
                                        case 2: System.out.println("Perimeter of Rectangle is:"+rectangle.calculatePerimeter());
                                                    break;            
                                     }
                                }while(ch2!=3);
                                     break; 
                                
                     case 2 : System.out.print("Enter Side of Square:");
                               x = scanner.nextInt();
                               Square square = new Square(x);

                               do{

                                    System.out.println("1.Calculate Area..");
                                    System.out.println("2.Calculate Perimeter..");
                                    System.out.println("3.Exit..");

                                    System.out.println("Enter Your choice:");
                                    ch2 = scanner.nextInt();
                                    
                                    switch(ch2){
                                        case 1: System.out.println("Area of Square is:"+square.calculateArea());
                                                    break;
                                        case 2: System.out.println("Perimeter of Square is:"+square.calculatePerimeter());
                                                    break;            
                                    }
                               }while(ch2!=3);
                               break;

                     case 3: System.out.print("Enter radius of circle:");
                             r = scanner.nextFloat();
                             Circle circle = new Circle(r);

                             do{
                                    System.out.println("1.Calculate Area of circle..");
                                    System.out.println("2.Calclate Circumference of circle..");
                                    System.out.println("3.EXIT..");
                                    System.out.println("Enter Your choice:");
                                    ch2 = scanner.nextInt();
                                    switch(ch2){

                                        case 1: System.out.println("Area of Circle is:"+circle.calculateArea());
                                                break;
                                        case 2: System.out.println("Circumference of Circle is:"+circle.calculateCircumference());
                                                break;        
                                    }
                             }while(ch2!=3);
                             break;

                     case 4: System.out.print("Enter Radius of Cone:");
                              r = scanner.nextFloat();
                              System.out.print("Enter height of Cone:");
                              h = scanner.nextFloat();
                              Cone cone = new Cone(r,h);

                            do{
                                 System.out.println("1.Calculate Volume..");
                                 System.out.println("2.EXIT..");
                                 System.out.println("Enter your choice:");
                                 ch2 = scanner.nextInt();
                                 
                                 switch(ch2){

                                    case 1: System.out.println("Volume of Cone is"+cone.calculateVolume());
                                             break;
                                 }

                             }while(ch2!=2);
                             break;

                     case 5: System.out.println("Enter radius of Cylinder:");
                              r = scanner.nextFloat();
                              System.out.println("Enter Height of Cylinder:");
                              h = scanner.nextFloat();
                              Cylinder cylinder = new Cylinder(r,h);
                            
                             do{
                                  System.out.println("1.Calculate Surface Area of Cylinder..");
                                  System.out.println("2.Calculate Volume of Cylinder..");
                                  System.out.println("3.EXIT..");

                                   System.out.println("Enter your choice:");
                                   ch2 = scanner.nextInt();
                                   
                                   switch(ch2){

                                    case 1 : System.out.println("SurfaceArea of Cylinder is :"+cylinder.calculateSurfaceArea());
                                                break;
                                    case 2: System.out.println("Volume of Cylinder is:"+cylinder.calculateVolume());
                                                break;            
                                   }                                
                             }while(ch2!=3);
                              break;

                     case 6 :  System.out.println("Enter Radius of Sphere:");
                                r = scanner.nextFloat();
                                Sphere sphere = new Sphere(r);
                                
                                do{

                                    System.out.println("1.Calculate Surface Area of Sphere..");
                                    System.out.println("2.Calculate Volume of Sphere..");
                                    System.out.println("3.EXIT..");

                                     System.out.println("Enter your choice:");
                                     ch2 = scanner.nextInt();

                                     switch(ch2){

                                         case 1 : System.out.println("Surface Area of Sphere is" +sphere.calculateSurfaceArea());
                                                    break;
                                         case 2 :System.out.println("Volume of Sphere is" +sphere.calculateVolume());
                                                    break;            
                                     }
                                }while(ch2!=3);

                                break;
                }
            }
        }while(ch1!=7);
    }
}