class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = Integer.MIN_VALUE,high = 0;

        for(int i = 0; i < n; i++){
            high += weights[i];
            low = Math.max(low, weights[i]);
        }
        
        while(low <= high) {
            int mid = (low + high) / 2;
            int noofD = finddays(weights, mid);
            if(noofD <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public static int finddays(int weights[], int cap) {
        int n = weights.length;
        int days = 1, load = 0;

        for(int i = 0; i < n; i++) {
            if(load + weights[i] > cap) {
                days = days + 1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }

        return days;
    }
}