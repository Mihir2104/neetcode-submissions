class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i : nums){
            if(map.get(i) != null && map.get(i)==true){
                return true;
            }
            else{
                map.put(i,true);
            }
        }
        return false;
    }
}

