package eureka.tasks;

public class Task3 extends Task{
    /**
     * @Task: Swapping numbers by using 3 variables
     */
    @Override
    public void run() {
        int i = 5;
        int j = 2;
        int temp = i;

        i = j;
        j = temp;

        System.out.printf("i: %d; j: %d", i, j);
    }
}
