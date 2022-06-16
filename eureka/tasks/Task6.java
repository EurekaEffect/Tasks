package eureka.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task6 extends Task {
    /**
     * @Task: Iterating HashMap by using while and enhanced for
     */
    @Override
    public void run() {
        // TODO: 16.06.2022 use iterator instead of this
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(0, "My");
        hashMap.put(1, "Name");
        hashMap.put(2, "Is...");

        List<Integer> split = new ArrayList<>(hashMap.keySet().stream().toList());
        while (!split.isEmpty()) {
            System.out.println(hashMap.get(split.get(0)));
            split.remove(split.get(0));
        }

        for (Integer map : hashMap.keySet()) {
            System.out.println(hashMap.get(map));
        }
    }
}
