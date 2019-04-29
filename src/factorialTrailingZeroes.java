class factorialTrailingZeroes {
    public int trailingZeroes(int n) {
        return n == 0 ? n : n/5 + trailingZeroes(n/5);
        
    }
}