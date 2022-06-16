package eureka.tasks;

public class Task14 extends Task {
    /**
     * @Task: Removing spaces by using .replace()
     */
    @Override
    public void run() {
        String string = "Whole lotta spaces (3)";

        System.out.println(string.replace(" ", ""));
    }
}
