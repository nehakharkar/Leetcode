import java.util.Stack;

class reverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        Stack<Character> s = new Stack();
        for(char c : S.toCharArray())
        {
            if(Character.isLetter(c))
            {
                s.push(c);
            }    
        }
        StringBuilder ans = new StringBuilder();
        for(char c : S.toCharArray())
        {
            if(Character.isLetter(c))
            {
                ans.append(s.pop());
            }    
            else
            {
                ans.append(c);    
            }
        }
        return ans.toString();
        
    }
}