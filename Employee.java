class Employee{
    private int id;
    private String name;
    private float salary;

    public void setId(int i){
        id = i;
    }

    public void setName(String n){
        name = n;
    }
    public void setSalary(float s){
        salary = s;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }
}

class TestEmployee{

    static public void main(String args[]){

        Employee emp= new Employee();
        emp.setId(111);
        emp.setName("Ankit");
        emp.setSalary(22000);

        System.out.println("EMPLOYEE ID IS :"+emp.getId());
        System.out.println("EMPLOYEE NAME IS:"+emp.getName());
        System.out.println("EMPLOYEE SALARY IS:"+emp.getSalary());
        
    }
}