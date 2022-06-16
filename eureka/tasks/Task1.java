package eureka.tasks;

public class Task1 extends Task {
    /**
     * @Task: Line reverse with .reverse()
     */
    @Override
    public void run() {
        String string = "Задача2";

        StringBuilder sb = new StringBuilder();
        sb.append(string).reverse();

        System.out.println(sb);
    }
}
