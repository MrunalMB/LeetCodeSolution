# Find Missing Number in Array

## Problem Statement

Given an array `nums` containing `n` distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

### Example 1:

**Input:** 
nums = [3, 0, 1]<br>
**Output:** 
2
**Explanation:** 
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

## Intuition

The intuition behind this problem is to use the given array to rearrange the elements such that each element is at its correct index. This can be done by- Cycle sortwhich include the swapping of elements until they are in their correct positions.
## Approach

Iterate through the array and swap elements until each element is at its correct index.
Once the array is rearranged, iterate through it again to find the first index where the element does not match its index. That index is the missing numbe.
If missing number is the last element in the range, then we need to only return the array length, as array length is nothing but the index of last element.
## Complexity Analysis

- Time Complexity: O(n) - Two passes through the array.
- Space Complexity: O(1) - Constant space used for swapping elements.

