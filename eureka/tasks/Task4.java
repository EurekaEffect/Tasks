package eureka.tasks;

public class Task4 extends Task {
    /**
     * @Task: Swapping numbers by using 2 variables
     */
    @Override
    public void run() {
        int i = 8;
        int j = 4;

        i += j;
        j = Math.abs(j - i);
        i -= j;

        System.out.printf("i: %d; j: %d", i, j);
    }
}
