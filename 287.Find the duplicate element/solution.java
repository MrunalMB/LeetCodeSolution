class Solution {
    public int findDuplicate(int[] nums) {
     int arr[]=nums;
     int i=0;
     while(i< arr.length){
         int a= arr[i] - 1;
         if(arr[i] != arr[a]){
              swap(nums, i, a);
            }else{
                i++;
            }
         }
         return arr[nums.length-1];
     } 
     public void swap(int[] arr, int first,int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }

}

