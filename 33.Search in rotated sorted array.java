There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104
  class Solution {
    public int search(int[] nums, int target) {
        int pickele=pivot(nums);
        int firstTry=binarySearch(nums,0,pickele,target);
        if(firstTry!=-1){
            return firstTry;
        }else{
            return binarySearch(nums,pickele+1,nums.length-1,target);
        }
    }
    static int pivot(int arr[]){
        int start=0;
        int end=arr.length-1;
        
       while(start<=end){
            int mid=start+(end-start)/2;
            //there are 4 cases
            if(mid<end && arr[mid]>arr[mid+1]){
                //we found the pivot,the only 2 numbers which are descending in order
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            //case 4 if star ele < mid ele then
            else{
                start=mid+1;
            }
        }
            
        return -1;
    }
    static int binarySearch(int arr[],int start,int end,int target){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
