class Solution {
    public String toGoatLatin(String S) {
        if(S.length()== 0 )
            return null;
        String[] words = S.split(" ");
        StringBuilder result = new StringBuilder();
        StringBuilder a = new StringBuilder("a");
        for(int i = 0 ;i < words.length ; i++)
        {
            StringBuilder word = new StringBuilder(words[i]);
           switch(words[i].charAt(0)){
                 case 'a':case'A':
                 case 'e':case'E':
                 case 'i':case'I':
                 case 'o':case'O':
                 case 'u':case'U':
                    break;
               default:  
        
                 word.deleteCharAt(0).append(words[i].charAt(0));  
            }
                word.append("ma");
                word.append(a.toString());
               result.append(word.toString() + " ");
               a.append("a");
            }
        
        return result.toString();   
    }
}