import java.util.ArrayList;
import java.util.List;

public class PartitionLabels_763 {
    public List<Integer> partitionLabels(String S) {
        if(S == null || S.length() == 0){
            return null;
        }

        int[] chars = new int[26];
        for(int i = 0; i < S.length(); i ++){
            chars[S.charAt(i) - 'a'] = i;
        }

        List list = new ArrayList();
        int last = 0;
        int start = 0;

        for(int i = 0; i < S.length(); i++){
            last = Math.max(last, chars[S.charAt(i) - 'a']);
            if(last == i){
                list.add(last - start + 1);
                start = last + 1;
            }
        }

        return list;
    }
}
