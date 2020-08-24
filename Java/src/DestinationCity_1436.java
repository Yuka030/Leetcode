import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity_1436 {
    public String destCity(List<List<String>> paths) {
        Map<String, Boolean> map = new HashMap<>();
        for (List<String> ss : paths) {
            map.put(ss.get(0), false);
            if (!map.containsKey(ss.get(1))) {
                map.put(ss.get(1), true);
            }
        }
        for (String s : map.keySet()) {
            if (map.get(s)) return s;
        }
        return null;
    }
}
