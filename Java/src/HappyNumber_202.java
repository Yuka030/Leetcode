import java.util.HashSet;
import java.util.Set;

class HappyNumber_202 {
    public boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();

        while(n != 1){
            int m = 0;
            while(n > 0){
                int i = n % 10;
                m += i * i;
                n /= 10;
            }
            if(set.contains(m)){
                return false;
            }
            set.add(m);
            n = m;
        }

        return true;
    }
}