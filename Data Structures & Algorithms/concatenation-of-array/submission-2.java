class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int counter = 0;
        for (int i = 0; i < ans.length; i++) {
            if (counter == nums.length) {
                counter = 0;
            }
            ans[i] = nums[counter++]; 
        }
        return ans;
    }
}