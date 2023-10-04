public class Dog extends Animal {
    public static int count;

    public void Swim(String name, int actionSwim) {
        System.out.println("Dog " + name + actionSwim);
    }

    public void Run(String name, int actionRun) {

        System.out.println("Dog" + name + actionRun);
    }

    public static int getCountDog() {
        return count;
    }
}
