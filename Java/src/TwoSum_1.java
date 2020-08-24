import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] pair = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                pair[0] = map.get(target - nums[i]);
                pair[1] = i;
                return pair;
            }
            map.put(nums[i], i);
        }
        return pair;
    }
}
