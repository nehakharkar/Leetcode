class addDigits {
    public int addDigits(int num) {
        return num/10 == 0 ? num : addDigits(num%10 + addDigits(num/10) );
    }
}