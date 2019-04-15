class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s.trim().isEmpty())
            return 0;
        String[] words = s.split(" ");
        int n = words.length;
        
        return words[n-1].length();
         
    }
}