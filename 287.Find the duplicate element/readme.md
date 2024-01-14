# Find Duplicate Element in Array
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
## Examples
#### Example 1:

Input: nums = [1,3,4,2,2] <br>
Output: 2 <br>

#### Example 2: <br>

Input: nums = [3,1,3,4,2] <br>
Output: 3

## Intuition

First, we need to sort the array to identify the duplicate element. By using cyclic sort, we can achieve this with a time complexity of O(N).

## Approach

After sorting using cyclic sort, every element will be at the value - 1 index, except for the duplicate element, which will be shifted to the end of the array. Simply return the last element of the array after sorting it.

## Complexity

### Time Complexity

The time complexity is O(N), where N is the length of the input array. This is due to the cyclic sort, which operates in linear time.

### Space Complexity

The space complexity is O(1) as the algorithm uses a constant amount of extra space, not dependent on the input size.

## Code

```java
class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] = nums;
        int i = 0;
        while (i < arr.length) {
            int a = arr[i] - 1;
            if (arr[i] != arr[a]) {
                swap(nums, i, a);
            } else {
                i++;
            }
        }
        return arr[nums.length - 1];
    }

    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
