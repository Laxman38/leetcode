class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        while(a >= b){
            long temp = b; int multiply = 1;
            while(a >= (temp << 1)){
                temp <<= 1;
                multiply <<= 1;
            }

            a -= temp;
            result += multiply;
        }
        
        return (dividend > 0) == (divisor > 0) ? result : -result; 
    }
}