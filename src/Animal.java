public class Animal {
    float weight;
    String name;
    int id;

    Animal(String name,float weight,int id){
        this.name = name;
        this.weight = weight;
        this.id  = id;
    }
    Animal(){
        this.name = "";
        this.weight = 0.0f;
    }

}
