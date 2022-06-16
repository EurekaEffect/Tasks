package eureka.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task12 extends Task {
    /**
     * @Task: Getting the highest number - 1
     */
    @Override
    public void run() {
        List<Integer> ints = new ArrayList<>(List.of(10, 99, 85, 43, 12, 39, 15));

        ints.sort(Comparator.comparingInt(Integer::intValue).reversed());
        System.out.println(ints.get(1));
    }
}
