public class ShortestDistanceToACharacter_821 {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int pos = len;
        int[] res = new int[len];
        boolean foundC = false;

        for(int i = 0; i < len; i++){

            if(S.charAt(i) == C) {
                foundC = true;
                pos = i;
                continue;
            }

            if(!foundC){
                res[i] = len;
                continue;
            }

            res[i] = i - pos;
        }

        for(int i = len - 1; i >= 0; i--){
            if(S.charAt(i) == C){
                pos = i;
                continue;
            }
            res[i] = Math.abs(Math.min(res[i], pos - i));
        }

        return res;

    }
}
