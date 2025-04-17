package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        KeyValueStorage tmpStorage = new InMemoryKV(storage.toMap());
//        tmpStorage.putAll(storage);

        for (Entry<String, String> line : tmpStorage.toMap().entrySet()) {
            var key = line.getKey();
            var value = line.getValue();
            storage.unset(key);
            storage.set(value, key);
        }

        System.out.println("swap " + storage);
    }
}
// END
