class reverseInteger {
    public int reverse(int x) {
        long res = 0;
        while(x!=0)
        {
            res = x%10 + res*10;
            x = x/10;
            
        }
        int val=0;
        if(res>Integer.MIN_VALUE&&res<Integer.MAX_VALUE)
            val=(int)res;
        return val;
    }
}