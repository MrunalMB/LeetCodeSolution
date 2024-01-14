# Find Disappeared Numbers in Array

## Problem Statement

Given an array `nums` of n integers where `nums[i]` is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in `nums`.

## Example

#### Example 1


Input: nums = [4,3,2,7,8,2,3,1] <br>
Output: [5,6] <br>

#### Example 2
Input: nums = [1,1]<br>
Output: [2]<br>

# Intuition
First we need to sort the array, then we get to know which element is missing in the sorted array.<br>By using cyclic sort we can sort the array in O(N) time complexity.

# Approach
First, we sort the array using cyclic sort, which has a time complexity of O(N). After sorting, every element will be at the value - 1 index, except for the numbers that are missing. We only need to add the index whose value is not equal to index + 1.

# Complexity
## Time complexity:
The time complexity is O(n), where n is the length of the input array.

## Space complexity:
The space complexity is O(1) as the algorithm uses a constant amount of extra space, not dependent on the input size.
