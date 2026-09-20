//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            Dog dog = new Dog();
            Cat cat = new Cat();
            Plant plant = new Plant();


            System.out.println(cat.isAlive);
            System.out.println(dog.isAlive);

        System.out.println(dog.live);
        System.out.println(cat.live);
        System.out.println(plant.isAlive);
        System.out.println(dog.leg);
        System.out.println(cat.leg);

        cat.speak();
        dog.speak();
        plant.photosythensis();
    }

}