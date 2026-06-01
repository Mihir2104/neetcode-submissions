class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        
        int i =0;
         
         s = s.toLowerCase();
        while(i<s.length()){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stack.push(s.charAt(i));
                i++;
            }
            else{
                i++;
            }
        }
        
        int j=0;

        while(j<s.length()){
           if(Character.isLetterOrDigit(s.charAt(j)) && stack.pop() == s.charAt(j)){
              j++;
           }
           else if (!Character.isLetterOrDigit(s.charAt(j))){
            j++;
           }
           else{
            return false;
           }
        }
        return true;

    }
}
