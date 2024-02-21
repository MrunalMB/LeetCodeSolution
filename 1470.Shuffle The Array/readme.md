# Shuffle the Array

## Problem Statement

Given the array nums consisting of 2n elements in the form [x1, x2, ..., xn, y1, y2, ..., yn]. Return the array in the form [x1, y1, x2, y2, ..., xn, yn].

### Example 1:
nums = [2, 5, 1, 3, 4, 7],  <br>
n = 3<br>
Output:
[2, 3, 5, 4, 1, 7]

### Example 2:
nums = [1, 2, 3, 4, 4, 3, 2, 1],
<br>
n = 4
  <br>
Output:
[1, 4, 2, 3, 3, 2, 4, 1]


## Intuition

The problem requires rearranging the elements in a specific order: [x1, y1, x2, y2, ..., xn, yn]. We can achieve this by iterating through the array and placing the elements in the desired order.

## Approach

We can use two pointers, one starting from the beginning (j) and the other starting from the middle (k) of the array. We iterate through the array, placing elements at alternate positions in the result array.

1. Initialize an array `ans` of size 2n to store the result.
2. Use two pointers `j` and `k`, where `j` starts at the beginning (0) and `k` starts at the middle (n).
3. Iterate through the array and populate the `ans` array with elements from `nums[j]` and `nums[k]` alternatively.
4. Increment the pointers accordingly.
5. Return the `ans` array as the result.

## Complexity Analysis

- Time Complexity: O(n) - We iterate through the given array once.
- Space Complexity: O(n) - We use additional space to store the result array.
