public class Dog {
    public String name;

    public int age;

    public int weight;

    public String race;

    public Dog() {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void doWoof() {

        System.out.println("Woof!");

    }





}

class DogTest{


    public static void main(String[] args) {


        Dog dog1=new Dog();
        dog1.setName("more");
        dog1.setAge(1);
        dog1.setWeight(15);
        dog1.setRace("wolf");

        System.out.println("Dog's Name : "+dog1.getName());
        System.out.println("Dog's Age : "+dog1.getAge());
        System.out.println("Dog's weight : "+dog1.getWeight());
        System.out.println("Dog's Race : "+dog1.getRace());
        dog1.doWoof();

    }
}
