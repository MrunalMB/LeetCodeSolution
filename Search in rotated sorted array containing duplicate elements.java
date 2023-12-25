There is an integer array nums sorted in ascending order (with non distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
  
  //in this code,we are try to find the index of target ele in rotaed sorted arr which contains duplicate element.
public class DuplicateROtatedArr {
    public static void main(String[] args) {
        //int nums[]={2,9,2,2,2};
        //int nums[]={1,2,3,4,5,6,7,7,8,9,10};
        //int nums[]={7,8,9,10,0,1,1,2,3,4,5,6,7};
        int nums[]={11,11,11,9,9,10,11};
        int target=9;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int pickele = pivotWithDuplicates(nums);
        int firstTry = binarySearch(nums, 0, pickele, target);
        if (firstTry != -1) {
            return firstTry;
        } else {
            return binarySearch(nums, pickele + 1, nums.length - 1, target);
        }
    }
    //the only change in this code is that, it the start ,mid and end ele are same
    // then in SearchInRotatedArr program code the last if else conditon will get confuse
    //so to avoid this the only change is that if arr[mid]==arr[start] then start searching from the next ele
    static int pivotWithDuplicates(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // if arr[mid]==arr[start] then start searching from the next ele
            // if arr[mid]==arr[end] then start searching from the privious ele of end

            if(arr[mid]==arr[start] && arr[mid]==arr[end]) {
                //but we need to check whethere the skipping start or end are realy the pivot(lergest ele in arr) or not.
                //it these are pivot then return else skip these ele
                if (arr[start] >= arr[start + 1]) {
                    return start;
                } else {
                    start = start + 1;
                }//need to check wether our end is pivot or not.if yes then return end otherwise skip it.
                if (arr[end] >= arr[end - 1]) {
                    return end;
                } else {
                    end = end - 1;
                }
            }
            //left side is sorted, so pivot should be in the right
            else if(arr[start]<arr[mid] ||(arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }else {
                end=mid-1;
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
