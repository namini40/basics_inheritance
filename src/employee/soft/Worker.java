package employee.soft;

public class Worker extends Employee{

    public Manager manager;


    public Worker(String name, float salary, Manager manager) {
        super(name, salary, 2);
        this.manager= manager;
    }

    public void setInsurance(int insuranceNumber){
        this.insuranceNumber=insuranceNumber;
    }



}
