package eureka.tasks;

public class Task2 extends Task {
    /**
     * @Task: Line reverse without .reverse()
     */
    @Override
    public void run() {
        String string = "Задача1";

        StringBuilder reverse = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse.append(string.toCharArray()[i]);
        }

        System.out.println(reverse);
    }
}
