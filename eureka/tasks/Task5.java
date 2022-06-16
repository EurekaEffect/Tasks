package eureka.tasks;

import java.util.HashMap;

public class Task5 extends Task {
    /**
     * @Task: Counting repeated words by using HashMap
     */
    @Override
    public void run() {
        HashMap<String, Integer> hashMap = new HashMap<>();

        String string = "im im, im currently working on on it.";
        String[] split = string.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (hashMap.containsKey(split[i])) {
                int key = hashMap.get(split[i]) + 1;
                hashMap.put(split[i], key);
            } else {
                hashMap.put(split[i], i);
            }
        }

        System.out.println(hashMap);
    }
}
