class Solution {


    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k >= n) k%=n;
        for(int i = 0 ; i < n-k ; i++){
            int t = nums[0];
            for(int j = 0 ; j < n-1 ; j++){
                nums[j] = nums[j+1];
            }
            nums[n-1] = t;
        }
    }
}