package eureka.tasks;

public class Task9 extends Task {
    /**
     * @Task: Printing Fibonacci numbers
     */
    @Override
    public void run() {
        int x;
        int y = 0;
        int z = 1;

        for (int i = 0; i <= 200; i++) {
            x = y;
            y = z;
            z = x + y;
            System.out.println(z);
        }
    }
}
