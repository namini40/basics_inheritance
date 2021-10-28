public class Dog extends Animal {

    String color;

    Dog(String name,float weight,String color){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.id = 2;
    }

    void makeSound(){
        System.out.println("hap hap");
    }


}
