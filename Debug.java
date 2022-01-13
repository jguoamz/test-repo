package examples;

import java.util.concurrent.ConcurrentHashMap;

public class Debug {

    public void atomViol07(ConcurrentHashMap<String, String> concurrentMap, String key) {
        String sampleValue = "sampleString";
        synchronized (this) {
            String value = concurrentMap.get(key);
            if (value == null) {
                concurrentMap.put(key, sampleValue);
            }
        }
    }
}
