# Problem Statement

Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

## Example

### Example 1:

**Input:** `nums = [1,2,0]`
**Output:** `3`
**Explanation:** The numbers in the range [1,2] are all in the array.

### Example 2:

**Input:** `nums = [3,4,-1,1]`
**Output:** `2`
**Explanation:** 1 is in the array but 2 is missing.

### Example 3:

**Input:** `nums = [7,8,9,11,12]`
**Output:** `1`
**Explanation:** The smallest positive integer 1 is missing.

# Intuition

To find the smallest missing positive integer, we can rearrange the array in-place to bring each element to its correct position (i.e., nums[i] should be equal to i + 1) by using cyclic sort. After rearranging, we iterate through the array and find the first index where the element is not equal to its corresponding value. The missing positive integer is then the index + 1.
# Approach

1. Iterate through the array to rearrange elements in-place. And ignore if array elements value is greater then the array length and even if element is less than 1.
2. After rearranging, iterate through the array again to find the first index where the element is not equal to its corresponding value.
3. Return the missing positive integer (index + 1) or nums.length + 1 if all elements are in their correct positions.

# Time Complexity

The algorithm has a time complexity of O(n) because we iterate through the array twice, and each iteration takes O(n) time.

# Space Complexity

The algorithm uses O(1) auxiliary space as it rearranges the elements in-place without using additional space.
