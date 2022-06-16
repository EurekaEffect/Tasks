package eureka.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task10 extends Task {
    /**
     * @Task: Iterating List by using while, for and enhanced for
     */
    @Override
    public void run() {
        List<String> list = new ArrayList<>();

        list.add("My");
        list.add("Name");
        list.add("Is...");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String string : list) {
            System.out.println(string);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
