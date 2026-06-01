class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        

        String t = s.toLowerCase();
        int j = t.length()-1;
        while(i<j){

         while( i<j && !Character.isLetterOrDigit(t.charAt(i))){
            i++;
         }

         while(i<j && !Character.isLetterOrDigit(t.charAt(j))){
            j--;
         }
            if(t.charAt(i)!=t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
        
    }
}
