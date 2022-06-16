package eureka.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task13 extends Task {
    /**
     * @Task: Checking for an Armstrong number
     */
    @Override
    public void run() {
        List<Integer> ints = new ArrayList<>();
        int number = 8208;
        String value = String.valueOf(number);

        for (char c : value.toCharArray()) {
            ints.add(Integer.parseInt(String.valueOf(c)));
        }

        int result = 0;
        for (Integer i : ints) {
            result += (int) Math.pow(i, value.length());
        }

        boolean isArmstrong = number == result;
        System.out.println(isArmstrong);
    }
}
