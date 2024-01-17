class Solution {
    public int firstMissingPositive(int[] nums) {
      int min= Integer.MAX_VALUE;
      for(int i=0; i< nums.length;i++){
          min= Math.min(min, nums[i]);
      }if(min > 1){
          return 1;
      }else{
            int i=0;
            while(i < nums.length){
                int a = nums[i] - 1;
                if(nums[i] < 1 || nums[i] > nums.length){
                    i++;
                }else if (nums[i] != nums[a]){
                    swap(nums, i, a);
                }else{
                    i++;
                }
            }
        
        for(int ind=0 ; ind < nums.length ; ind++){
            if( nums[ind] != ind + 1){
                return  ind + 1;
            }
        }
        //return nums.length + 1 if array is alredy sorted
        return nums.length + 1;
      }
   
 }
 //another one approach
 /*public int firstMissingPositive(int[] nums){
     int i=0;
     while(i < nums.length){
         int a = nums[i] - 1;
         if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[a]){
             swap(nums, i, a);
         }else{
             i++;
         }
     }
      for(int ind=0 ; ind < nums.length ; ind++){
            if( nums[ind] != ind + 1){
                return  ind + 1;
            }
        }
        return nums.length + 1;
 }*/
    public void swap(int nums[], int first, int sec){
        int temp = nums[first];
        nums[first] = nums[sec];
        nums[sec] = temp;
    }
}
