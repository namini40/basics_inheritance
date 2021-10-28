package employee.soft;

public class Employee {

    public String name;
    private float salary;
    public int department;
    private int hoursOfWork;
    public int insuranceNumber;

    Employee(String name,float salary,int department){
        this.department = department;
        this.name = name;
        this.salary = salary;
        this.hoursOfWork=0;
    }

    public void work(){
        this.hoursOfWork++;
    }


}

