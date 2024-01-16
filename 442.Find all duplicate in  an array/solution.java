  class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> list=new ArrayList<>();
        while(i < nums.length){
            int a= nums[i]-1;
            if(nums[i] !=nums[a] ){
                //swap
                swap(nums, i, a);
            }else{
                i++;
            }
        }
        for(int ind=0; ind<nums.length; ind++){
            if(nums[ind] != ind + 1){
                list.add(nums[ind]);
            }
        }

            return list;
    }
    public void swap(int[] arr, int first,int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }
}
