package eureka.tasks;

public class Task15 extends Task {
    /**
     * @Task: Removing spaces without using .replace()
     */
    @Override
    public void run() {
        StringBuilder string = new StringBuilder("Whole lotta spaces (3)");

        String[] split = string.toString().split(" ");
        string = new StringBuilder();
        for (String s : split) {
            string.append(s);
        }

        System.out.println(string);
    }
}
