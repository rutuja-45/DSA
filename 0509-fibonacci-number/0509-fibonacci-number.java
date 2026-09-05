class Solution {
    int sum=0;
    int i=0;
    public int fib(int n) {
        if(n<=1)
        {
            return n;
        }
          return fib(n - 1) + fib(n - 2);
    }
}