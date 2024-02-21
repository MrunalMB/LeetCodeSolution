class Solution {
    public int[] shuffle(int[] nums, int n) {
        int c=0,i=0;
        int ans[]=new int[2*n];

        int j = 0 , k = n;
        while(i < 2 *n ){
            ans[i] = nums[j];
            ans[++i] = nums[k];
            i++;
            j ++;
            k ++;
        }
        return ans;
    }
}
