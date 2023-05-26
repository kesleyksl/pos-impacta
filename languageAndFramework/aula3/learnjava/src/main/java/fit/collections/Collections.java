package fit.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Collections {
    public static void exec() {
        System.out.println("collection started...");

        String[] names = new String[] { "Kesley", "Mello" };
        System.out.println(names);

        Map<String, String> record = new LinkedHashMap() {
            {
                put("k1", "v1");
                put("k2", "v2");
            }
        };

        System.out.println(record);
        // Map<String, String> record2 = Map.of("k1", "v1", "k2", "v2");
        // System.out.println(record2);

    }
}
