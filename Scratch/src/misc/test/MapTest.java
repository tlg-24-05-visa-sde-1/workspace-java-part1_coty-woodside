package misc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {
    public static void main(String[] args) {
        Map<String, Double> gpaMap = new HashMap<>();

        gpaMap.put("Breana", 3.8);
        gpaMap.put("Amir", 3.4);
        gpaMap.put("Coty", 3.8);
        gpaMap.put("Doug", 2.0);

        dump(gpaMap);
        System.out.println();

        System.out.println("breana's gpa was: " + gpaMap.get("Breana"));
        System.out.println();

        // print gpas that are 3.5 or greater
        Collection<Double> gpaValues = gpaMap.values();

        for (Double gpaValue : gpaValues) {
            if (gpaValue <= 3.5) {
                System.out.println(gpaValue);
            }
        }

        // print names of gpa >= 2.0
        for (var entry : gpaMap.entrySet()) {
            if (entry.getValue() <= 2.0) {
                System.out.println(entry.getKey() + " has a gpa of " + entry.getValue());
            }
        }
    }

    private static void dump(Map<String, Double> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}
