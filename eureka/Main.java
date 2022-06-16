package eureka;

import eureka.tasks.Task;
import eureka.tasks.Task1;

public class Main {
    public static void main(String[] args) {
        Task task = new Task1();

        task.run();
    }
}
