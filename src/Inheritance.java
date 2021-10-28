import employee.soft.Manager;
import employee.soft.Worker;

public class Inheritance {
    public static void main(String[] args){

//        Animal animal = new Animal("dove",1.5f);
//
//        System.out.println(animal.name);
//        Dog dog = new Dog("poppy",20.0f,"black");
//        System.out.println(dog.color);
//        dog.makeSound();
//        Cat cat = new Cat("lucy",5.0f,"blue");
//        cat.makeSound();

        Manager managerRailway = new Manager("Amir",25.0f);
        Worker worker1 = new Worker("reza",5.0f,managerRailway);
        Worker worker2 = new Worker("ahmad",4.0f,managerRailway);

        managerRailway.addAWorkerToList(worker1);
        managerRailway.addAWorkerToList(worker2);
        worker1.work();
        managerRailway.work();
        managerRailway.setInsurance(12);
        worker1.insuranceNumber=-12;


    }
}
