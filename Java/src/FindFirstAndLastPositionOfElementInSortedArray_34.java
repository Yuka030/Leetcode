public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] pos = new int[2];
        pos[0] = firstFindIndex(nums, target);
        pos[1] = findLastIndex(nums, target);
        return pos;
    }

    public int firstFindIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int middle = (start + end) / 2;
            if(nums[middle] >= target){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
            if(nums[middle] == target) index = middle;
        }

        return index;
    }

    public int findLastIndex(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int middle = (start + end) / 2;
            if(nums[middle] <= target){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
            if(nums[middle] == target) index = middle;
        }
        return index;
    }
}
