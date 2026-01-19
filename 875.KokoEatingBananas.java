class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxpiles(piles);

        while(low <= high){
            int mid = (low + high) / 2;
            int totalH = totalhours(piles, mid);

            if(totalH <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return low;
    }

    public int maxpiles(int[] piles) {
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;

        for(int i = 0; i < n; i++) {
            maxi = Math.max(maxi,piles[i]);
        }

        return maxi;
    }
    
    public int totalhours(int []piles,int h) {
        int n = piles.length;
        int totalH = 0;

        for(int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(piles[i]) / (double)(h));
        }

        return totalH;
    }
}