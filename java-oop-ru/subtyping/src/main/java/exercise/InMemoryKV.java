package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class InMemoryKV implements exercise.KeyValueStorage {
    private Map<String, String> storage;

    InMemoryKV(Map<String, String> initMap) {

        storage = new HashMap<>();
        storage.putAll(initMap);
    }

    @Override
    public void set(String key, String value) {
        storage.put(key, value);
    }

    @Override
    public void unset(String key) {
        storage.remove(key);
    }

    public String get(String key, String defaultValue) {

        return storage.getOrDefault(key, defaultValue);
    }

    public Map<String, String> toMap() {
        var result = new HashMap<String, String>(storage);

        return result;
    }
}
// END
