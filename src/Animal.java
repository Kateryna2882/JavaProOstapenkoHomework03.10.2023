public class Animal {

    public static int count;

    void Action_run() {

        System.out.println("running : ");
    }

    void Action_swim() {

        System.out.println("swimming: ");
    }

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

}