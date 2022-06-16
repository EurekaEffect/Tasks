package eureka.tasks;

import java.util.ArrayList;
import java.util.List;

public class Task11 extends Task {
    /**
     * @Task: Check for duplicate characters
     */
    @Override
    public void run() {
        List<Character> characters = new ArrayList<>();
        List<Character> repeated = new ArrayList<>();

        String string = "Iterating each char";

        for (char c : string.toLowerCase().toCharArray()) {
            if (characters.contains(c)) {
                repeated.add(c);
            } else {
                characters.add(c);
            }
        }

        System.out.println(repeated);
    }
}
