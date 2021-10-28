public class Cat extends Animal{

    String eyeColor;

    Cat(String name,float weight,String colorOfEyes){
        super(name,weight,1);
        this.eyeColor = colorOfEyes;

    }

    void makeSound(){
        System.out.println("Mewo");
    }
}
