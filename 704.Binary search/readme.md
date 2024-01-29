# Binary Search Algorithm

## Problem Statement

Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, then return its index. Otherwise, return -1.

## Approach

Binary Search is an efficient algorithm for finding an element in a sorted array. The idea is to repeatedly divide the array in half until the target element is found.

1. Initialize two pointers, `left` and `right`, to the start and end of the array respectively.
2. While `left` is less than or equal to `right`:
   - Calculate the middle index as `(left + right) // 2`.
   - If the middle element is equal to the target, return the middle index.
   - If the middle element is greater than the target, update `right` to be `mid - 1`.
   - If the middle element is less than the target, update `left` to be `mid + 1`.
3. If the loop exits without finding the target, return -1.

## complexity Analysis
### Time complexity : O(long N)
### Space complexity : O(1)
