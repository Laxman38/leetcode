class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        int first = start(nums, target);
        int last = end(nums, target);

        result[0] = first;
        result[1] = last;

        return result;
    }
    public static int start(int[]nums,int target){
        int low = 0, high = nums.length - 1;
        int start = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                start = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return start;
    }
     public static int end(int[]nums,int target){
        int low = 0, high = nums.length - 1;
        int last = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(nums[mid] == target){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        return last;
    }
    
}