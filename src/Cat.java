public class Cat extends Animal {

    public static int count;

    public void Swim(String name) {

        System.out.println("Cat " + name + " can't swim");
    }

    public void Run(String name, int action) {
        System.out.println("Cat" + name + action);
    }

    public static int getCountCat() {
        return count;
    }
}
