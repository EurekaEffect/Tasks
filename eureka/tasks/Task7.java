package eureka.tasks;

public class Task7 extends Task {
    /**
     * @Task: Checking a string for a palindrome
     */
    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();

        String string = "aboba";
        sb.append(string).reverse();

        System.out.println(string.equals(sb.toString()) ? "yes" : "no");
    }
}
