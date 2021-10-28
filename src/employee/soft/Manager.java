package employee.soft;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private List<Worker> workersUnder;


    public Manager(String name, float salary) {
        super(name, salary, 1);
        workersUnder = new ArrayList<>();
    }

    @Override
    public void work() {
        super.work();
        super.work();
    }

    public void addAWorkerToList(Worker worker){
        this.workersUnder.add(worker);
    }

    public Worker removeFromList(int index){
        if(this.workersUnder.size()>index){
            return this.workersUnder.get(index);
        }else{
            return null;
        }
    }

    public void setInsurance(int numberForInsurance){
        this.insuranceNumber = numberForInsurance;
    }
}
