public class MaximizeDistanceToClosestPerson_849 {
    public int maxDistToClosest(int[] seats) {
        int distance = 0;
        int lastIndex = -1;

        for(int i = 0; i < seats.length; i++){
            if(seats[i]==1){
                if(lastIndex < 0){
                    distance = i;
                }else{
                    distance = Math.max(distance, (i - lastIndex) / 2);
                }
                lastIndex = i;
            }
        }

        distance = Math.max(distance, (seats.length - 1) - lastIndex);
        return distance;
    }
}

