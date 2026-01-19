class Solution {
    public int fib(int n) {
        if(n ==0 || n == 1) {
            return n;
        }

        int temp1 = fib(n - 1);
        int temp2 = fib(n - 2);
        
        return temp1 + temp2;
    }
}