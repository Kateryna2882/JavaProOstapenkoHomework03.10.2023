
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("The Cat is : ");
        cat.Action_run();
        cat.Run(" Tim ", 200);
        cat.Action_swim();
        cat.Swim("Tim ");

        Dog dog = new Dog();
        System.out.println("The Dog is : ");
        dog.Action_run();
        dog.Run(" Bobik ", 500);
        dog.Action_swim();
        dog.Swim(" Bobik ", 10);

        System.out.println("Count animal : " + Animal.getCount());
    }

}