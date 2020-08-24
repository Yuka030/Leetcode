import java.util.HashMap;

public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num: nums){
            if(!map.containsKey(num)){
                map.put(num, false);
            }else{
                map.put(num, true);
            }
        }

        for(int key: map.keySet()) {
            if (!map.get(key)) {
                return key;
            }
        }
        return -1;
    }
}
